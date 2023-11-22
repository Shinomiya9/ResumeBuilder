package com.example.resumebuilderdone;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.animation.PauseTransition;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;
import java.io.FileOutputStream;
import java.util.Optional;

import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class HelloController {

    @FXML
    protected Button btnClear;

    @FXML
    protected Button btnGenerate;

    @FXML
    protected Button btnSave;

    @FXML
    protected Button showDialog;

    @FXML
    protected Button btnLoad;

    @FXML
    protected TextField txtCV;

    @FXML
    protected TextField txtAward1;

    @FXML
    protected TextField txtAward2;

    @FXML
    protected TextField txtAward3;

    @FXML
    protected TextField txtDate1; //date of project1

    @FXML
    protected TextField txtDate2; // date of project2

    @FXML
    protected TextField txtEducation1;

    @FXML
    protected TextField txtEducation2;

    @FXML
    protected TextField txtEducationDate1;

    @FXML
    protected TextField txtEducationDate2;

    @FXML
    protected TextField txtEducationDesc1;

    @FXML
    protected TextField txtEducationDesc2;

    @FXML
    protected TextField txtEmail;

    @FXML
    protected TextField txtJobDesc1;

    @FXML
    protected TextField txtJobDesc2;

    @FXML
    protected TextField txtJobDuration1;

    @FXML
    protected TextField txtJobDuration2;

    @FXML
    protected TextField txtJobTitle1;

    @FXML
    protected TextField txtJobTitle2;

    @FXML
    protected TextField txtName;

    @FXML
    protected TextField txtPhone;

    @FXML
    protected TextField txtProject1;

    @FXML
    protected TextField txtProject2;

    @FXML
    protected TextField txtProjectDesc1;

    @FXML
    protected TextField txtProjectDesc2;

    @FXML
    protected TextField txtSkill1;

    @FXML
    protected TextField txtSkill2;

    @FXML
    protected TextField txtSkill3;

    @FXML
    protected TextField txtSkill4;
    showDialog dialog = new showDialog();

    private Window primaryStage;

    //Han Min
    protected void loadingClear(){
        Stage primaryStage = new Stage();
        LoadingComponent loading = new LoadingComponent();

        // Create a scene with the loading component as the root node
        Scene loadingScene = new Scene(loading, 500, 500);

        // Set the loading screen as the initial scene
        primaryStage.setScene(loadingScene);
        primaryStage.show();
        PauseTransition pause = new PauseTransition(Duration.seconds(6));
        pause.setOnFinished(event -> {
            // Replace the loading scene with your main scene
            dialog.showClear();
            primaryStage.close();
        });
        pause.play();

        // Simulate a long-running task by pausing for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void loadingGen(){
        Stage primaryStage = new Stage();
        LoadingComponent loading = new LoadingComponent();

        // Create a scene with the loading component as the root node
        Scene loadingScene = new Scene(loading, 500, 500);

        // Set the loading screen as the initial scene
        primaryStage.setScene(loadingScene);
        primaryStage.show();
        PauseTransition pause = new PauseTransition(Duration.seconds(6));
        pause.setOnFinished(event -> {
            // Replace the loading scene with your main scene
            dialog.showConfirmation();
            primaryStage.close();
        });
        pause.play();

        // Simulate a long-running task by pausing for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void loadingSave(){
        Stage primaryStage = new Stage();
        LoadingComponent loading = new LoadingComponent();

        // Create a scene with the loading component as the root node
        Scene loadingScene = new Scene(loading, 500, 500);

        // Set the loading screen as the initial scene
        primaryStage.setScene(loadingScene);
        primaryStage.show();
        PauseTransition pause = new PauseTransition(Duration.seconds(6));
        pause.setOnFinished(event -> {
            // Replace the loading scene with your main scene
            dialog.showSave();
            primaryStage.close();
        });
        pause.play();

        // Simulate a long-running task by pausing for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void loadingLoad(){
        Stage primaryStage = new Stage();
        LoadingComponent loading = new LoadingComponent();

        // Create a scene with the loading component as the root node
        Scene loadingScene = new Scene(loading, 500, 500);

        // Set the loading screen as the initial scene
        primaryStage.setScene(loadingScene);
        primaryStage.show();
        PauseTransition pause = new PauseTransition(Duration.seconds(6));
        pause.setOnFinished(event -> {
            // Replace the loading scene with your main scene
            dialog.showLoad();
            primaryStage.close();
        });
        pause.play();

        // Simulate a long-running task by pausing for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Kaisan
    private void saveToFile() {
        /*Save save = new Save();
        save.saveToFile();*/
        if (txtName.getText().isEmpty() || txtPhone.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            dialog.showErrorSave();

        } else {
            String fileName = txtCV.getText();

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
                String name = txtName.getText();
                String phoneNumber = txtPhone.getText();
                String email = txtEmail.getText();
                String skill1 = txtSkill1.getText();
                String skill2 = txtSkill2.getText();
                String skill3 = txtSkill3.getText();
                String skill4 = txtSkill4.getText();
                String award1 = txtAward1.getText();
                String award2 = txtAward2.getText();
                String award3 = txtAward3.getText();
                String jobTitle1 = txtJobTitle1.getText();
                String jobDesc1 = txtJobDesc1.getText();
                String jobDuration1 = txtJobDuration1.getText();
                String jobTitle2 = txtJobTitle2.getText();
                String jobDesc2 = txtJobDesc2.getText();
                String jobDuration2 = txtJobDuration2.getText();
                String project1 = txtProject1.getText();
                String projectDesc1 = txtProjectDesc1.getText();
                String projectDate1 = txtDate1.getText();
                String project2 = txtProject2.getText();
                String projectDesc2 = txtProjectDesc2.getText();
                String projectDate2 = txtDate2.getText();
                String education1 = txtEducation1.getText();
                String educationDesc1 = txtEducationDesc1.getText();
                String educationDate1 = txtEducationDate1.getText();
                String education2 = txtEducation2.getText();
                String educationDesc2 = txtEducationDesc2.getText();
                String educationDate2 = txtEducationDate2.getText();

                writer.println("Name: " + name);
                writer.println("Phone Number: " + phoneNumber);
                writer.println("Email: " + email);
                writer.println("Skill1: " + skill1);
                writer.println("Skill2: " + skill2);
                writer.println("Skill3: " + skill3);
                writer.println("Skill4: " + skill4);
                writer.println("Award1: " + award1);
                writer.println("Award2: " + award2);
                writer.println("Award3: " + award3);
                writer.println("JobTitle1: " + jobTitle1);
                writer.println("JobDesc1: " + jobDesc1);
                writer.println("JobDate1: " + jobDuration1);
                writer.println("JobTitle2: " + jobTitle2);
                writer.println("JobDesc2: " + jobDesc2);
                writer.println("JobDate2: " + jobDuration2);
                writer.println("Project1: " + project1);
                writer.println("ProjectDesc1: " + projectDesc1);
                writer.println("ProjectDate1: " + projectDate1);
                writer.println("Project2: " + project2);
                writer.println("ProjectDesc2: " + projectDesc2);
                writer.println("ProjectDate2: " + projectDate2);
                writer.println("Education1: " + education1);
                writer.println("EducationDecs1: " + educationDesc1);
                writer.println("EducationDate1: " + educationDate1);
                writer.println("Education2: " + education2);
                writer.println("EducationDecs2: " + educationDesc2);
                writer.println("EducationDate2: " + educationDate2);

                System.out.println("Data saved to file successfully.");
                loadingSave();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Eason
    private void GenToPdf() {
        /*Generate gen = new Generate();
        gen.Generate();*/
        if (txtName.getText().isEmpty() || txtPhone.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            dialog.showErrorGen();

        } else {
            try {
                String fileName = txtCV.getText();
                Document document = new Document();
                String filename = textName();

                String filePath = fileName + ".pdf";
                PdfWriter.getInstance(document, new FileOutputStream(filePath));

                document.open();

                PdfPTable table = new PdfPTable(2);

                document.add(new Paragraph(txtName.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 32, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("CONTACT DETAILS", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEmail.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtPhone.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                //myDocument.add(new Paragraph(address.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7, BaseColor.DARK_GRAY )));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("SKILLS", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                table.setHeaderRows(1);
                table.addCell(txtSkill1.getText());
                table.addCell(txtSkill2.getText());
                table.addCell(txtSkill3.getText());
                table.addCell(txtSkill4.getText());

                document.add(table);

                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("AWARDS & ACHIEVEMENTS", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtAward1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtAward2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtAward3.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("WORK EXPERIENCE", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtJobTitle1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtJobDesc1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtJobDuration1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtJobTitle2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtJobDesc2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtJobDuration2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("PROJECT", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtProject1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtProjectDesc1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtDate1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtProject2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtProjectDesc2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtDate2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("EDUCATION", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEducation1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEducationDesc1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEducationDate1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEducation2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEducationDesc2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph(txtEducationDate2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 7, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));

                document.close();

                System.out.println("PDF generated successfully at: " + filePath);
                loadingGen();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    // Kaisan / Eason
    protected String textName() {
        String txtFileName = txtCV.getText();
        return txtFileName;
    }

    @FXML // Ang
    public void loadClicked(MouseEvent event) {
        // Create a FileChooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

        // Show open file dialog
        try {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {

                StringBuilder content = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    String[] words;

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtName.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 2, words.length));
                        // Set the modified line to text field
                        txtPhone.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEmail.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtSkill1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtSkill2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtSkill3.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtSkill4.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtAward1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtAward2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtAward3.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtJobTitle1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtJobDesc1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtJobDuration1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtJobTitle2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtJobDesc2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtJobDuration2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtProject1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtProjectDesc1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtDate1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtProject2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtProjectDesc2.setText(modifiedLine);
                    }
                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split("\\s+");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtDate2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split("\\s+");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEducation1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split(" ");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEducationDesc1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split("\\s+");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEducationDate1.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split("\\s+");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEducation2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split("\\s+");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEducationDesc2.setText(modifiedLine);
                    }

                    //read following line
                    if ((line = reader.readLine()) != null) {
                        words = line.split("\\s+");
                        // Remove the specified number of words from the beginning
                        String modifiedLine = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                        // Set the modified line to text field
                        txtEducationDate2.setText(modifiedLine);
                    }
                }

                //read following line
                loadingLoad();
                }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML // Kaisan
    public void SaveClicked(MouseEvent event) {
        saveToFile();
    }

    @FXML // Eason
    public void GenerateClicked(MouseEvent event) {
        GenToPdf();
    }

    @FXML // Ady
    public void showDialog(ActionEvent event) {
        dialog.showDialog();
    }

    @FXML // Han Min
    public void ClearClicked(MouseEvent event) {
        //Clear clear = new Clear();
        //clear.clearBtn();

        txtName.clear();
        txtEmail.clear();
        txtPhone.clear();

        txtSkill1.clear();
        txtSkill2.clear();
        txtSkill3.clear();
        txtSkill4.clear();

        txtAward1.clear();
        txtAward2.clear();
        txtAward3.clear();

        txtJobTitle1.clear();
        txtJobTitle2.clear();
        txtJobDesc1.clear();
        txtJobDesc2.clear();
        txtJobDuration1.clear();
        txtJobDuration2.clear();

        txtProject1.clear();
        txtProjectDesc1.clear();
        txtDate1.clear();
        txtProject2.clear();
        txtProjectDesc2.clear();
        txtDate2.clear();

        txtEducation1.clear();
        txtEducation2.clear();
        txtEducationDesc1.clear();
        txtEducationDesc2.clear();
        txtEducationDate1.clear();
        txtEducationDate2.clear();
        loadingClear();

        System.out.println("Cleared");
    }
}