package com.example.resumebuilderdone;
//Han Min
public class Clear extends HelloController {
    public void clearBtn() {
        txtCV.clear();

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
