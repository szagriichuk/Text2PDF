package com.google.text2pdf.impl;

import com.google.text2pdf.logger.LoggerFacade;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.slf4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author sergiizagriichuk
 */
public class ITextText2PdfEngine extends AbstractText2PdfEngine {

    private static final Logger LOGGER = LoggerFacade.getLogger(ITextText2PdfEngine.class);

    @Override
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

    private PdfWriter createPdfWriterForDocument(String pathToPdfFile, Document document) throws FileNotFoundException {

        if (pathToPdfFile == null)
            throw new FileNotFoundException("Path to document cannot be null");

        try {
            return PdfWriter.getInstance(document, new FileOutputStream(pathToPdfFile));
        } catch (DocumentException e) {
            LOGGER.error(e.getMessage());
        }

        return null;
    }

    @Override
    public void changeReportTemplate(String pathToReportTemplate) throws FileNotFoundException {
        throw new UnsupportedOperationException("This operation unsupported by current implementation");
    }

}
