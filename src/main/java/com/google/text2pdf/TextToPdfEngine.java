package com.google.text2pdf;

import com.google.text2pdf.logger.LoggerFacade;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.slf4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Hello world!
 */
public class TextToPdfEngine {

    private static final Logger LOGGER = LoggerFacade.getLogger(TextToPdfEngine.class);

    public void convertTextToPdf(String text, String pathToPdfFile) throws FileNotFoundException {
        Document document = new Document();

        createPdfWriterForDocument(pathToPdfFile, document);

        document.open();

        addParagraphWithDataToDocument(document, text);

        document.close();
    }

    private void addParagraphWithDataToDocument(Document document, String text) {
        try {
            document.add(new Paragraph(text));
        } catch (DocumentException e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void createPdfWriterForDocument(String pathToPdfFile, Document document) throws FileNotFoundException {

        if (pathToPdfFile == null)
            throw new FileNotFoundException("Path to document cannot be null");

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pathToPdfFile));
        } catch (DocumentException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
