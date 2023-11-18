package com.example.resumebuilderdone;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.io.FileOutputStream;

public class Generate {
    public void Generate(){
        HelloController hi = new HelloController();
        if (hi.txtName.getText().isEmpty()|| hi.txtPhone.getText().isEmpty() || hi.txtEmail.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL DETAILS TO GENERATE CV");

        } else
        {
            try {
                Document document = new Document();

                String filePath = "Resume.pdf";
                PdfWriter.getInstance(document, new FileOutputStream(filePath));

                document.open();

                PdfPTable table = new PdfPTable(2);

                document.add(new Paragraph(hi.txtName.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD,32, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY )));
                document.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY)));
                document.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("CONTACT DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtEmail.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtPhone.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));
                //myDocument.add(new Paragraph(address.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7, BaseColor.DARK_GRAY )));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("SKILLS",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
                table.setHeaderRows(1);
                table.addCell(hi.txtSkill1.getText());
                table.addCell(hi.txtSkill2.getText());
                table.addCell(hi.txtSkill3.getText());
                table.addCell(hi.txtSkill4.getText());

                document.add(table);

                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("AWARDS & ACHIEVEMENTS", FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD, BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtAward1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtAward2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtAward3.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY )));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("WORK EXPERIENCE",FontFactory.getFont(FontFactory.TIMES_BOLD,10, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtJobTitle1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtJobDesc1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtJobDuration1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtJobTitle2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtJobDesc2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtJobDuration2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("PROJECT",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtProject1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtProjectDesc1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtDate1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtProject2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtProjectDesc2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtDate2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                document.add(new Paragraph("EDUCATION",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
                document.add(new Paragraph(hi.txtEducation1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtEducationDesc1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtEducationDate1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtEducation2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtEducationDesc2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph(hi.txtEducationDate2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,7,BaseColor.DARK_GRAY)));
                document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));

                document.close();

                System.out.println("PDF generated successfully at: " + filePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
