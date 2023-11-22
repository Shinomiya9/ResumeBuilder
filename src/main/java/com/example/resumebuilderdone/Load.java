package com.example.resumebuilderdone;

import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

//Ang
public class Load extends HelloController {
    private Window primaryStage;
    public void Load(){
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
}
