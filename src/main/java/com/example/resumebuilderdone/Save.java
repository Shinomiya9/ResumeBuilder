package com.example.resumebuilderdone;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Kaisan
public class Save extends HelloController {
    public void Save(){

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
}

