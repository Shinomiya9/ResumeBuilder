package com.example.resumebuilderdone;

public class Clear extends HelloController {
    public void clearBtn()  {
        HelloController hi = new HelloController();
        hi.txtName.clear();
        hi.txtEmail.clear();
        hi.txtPhone.clear();

        hi.txtSkill1.clear();
        hi.txtSkill2.clear();
        hi.txtSkill3.clear();
        hi.txtSkill4.clear();

        hi.txtAward1.clear();
        hi.txtAward2.clear();
        hi.txtAward3.clear();

        hi.txtJobTitle1.clear();
        hi.txtJobTitle2.clear();
        hi.txtJobDesc1.clear();
        hi.txtJobDesc2.clear();
        hi.txtJobDuration1.clear();
        hi.txtJobDuration2.clear();

        hi.txtProject1.clear();
        hi.txtProjectDesc1.clear();
        hi.txtDate1.clear();
        hi.txtProject2.clear();
        hi.txtProjectDesc2.clear();
        hi.txtDate2.clear();

        hi.txtEducation1.clear();
        hi.txtEducation2.clear();
        hi.txtEducationDesc1.clear();
        hi.txtEducationDesc2.clear();
        hi.txtEducationDate1.clear();
        hi.txtEducationDate2.clear();
    }
}
