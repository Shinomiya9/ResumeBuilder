package com.example.resumebuilderdone;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.io.FileOutputStream;
//Eason
public class Generate extends HelloController {
    public void Generate(){
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
}
