package com.google.text2pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import junit.framework.Assert;
import org.junit.Test;

import java.io.*;

/**
 * Unit test for simple TextToPdfEngine.
 */
public class TextToPdfEngineTest {
    private TextToPdfEngine textToPdfEngine = new TextToPdfEngine();

    @Test(expected = com.itextpdf.text.ExceptionConverter.class)
    public void testNullTextToPdf() throws Exception {
        textToPdfEngine.convertTextToPdf(null, "test1.pdf");
    }

    @Test(expected = FileNotFoundException.class)
    public void testNullPathToPdf() throws Exception {
        textToPdfEngine.convertTextToPdf("test content", null);
    }

    @Test(expected = com.itextpdf.text.ExceptionConverter.class)
    public void testEmptyTextToPdf() throws Exception {

        String fileName = "test1.pdf";

        textToPdfEngine.convertTextToPdf("", fileName);

        Assert.assertEquals("", readDataFromPdf(fileName));
    }

    @Test(expected = FileNotFoundException.class)
    public void testEmptyPathToPdf() throws Exception {
        textToPdfEngine.convertTextToPdf("test content", "");
    }

    @Test
    public void simpleTextToPdf() throws Exception {
        testWriteContentToPdf("simplePdfFile.pdf", "./src/test/java/simpleTestData.txt");
    }

    @Test
    public void middleTextToPdf() throws Exception {

        testWriteContentToPdf("middlePdfFile.pdf", "./src/test/java/middleTestData.txt");
    }

    @Test
    public void bigTextToPdf() throws Exception {

        testWriteContentToPdf("bigPdfFile.pdf", "./src/test/java/bigTextData.txt");
    }

    private void testWriteContentToPdf(String pdfFileName, String textContentFileName) throws IOException {

        String data = readDataFromTextFile(textContentFileName);

        textToPdfEngine.convertTextToPdf(data, pdfFileName);

        Assert.assertEquals(data, readDataFromPdf(pdfFileName));
    }

    private String readDataFromTextFile(String pathToFile) throws IOException {
        InputStream stream = new FileInputStream(pathToFile);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        readContentToOutStream(stream, outputStream);

        return new String(outputStream.toByteArray()).trim();
    }

    private void readContentToOutStream(InputStream stream, ByteArrayOutputStream outputStream) throws IOException {

        byte[] data = new byte[1024];

        while (stream.read(data) > -1) {
            outputStream.write(data);
        }
    }


    private String readDataFromPdf(String fileName) throws IOException {
        PdfReader pdfReader = new PdfReader(fileName);
        PdfReaderContentParser parser = new PdfReaderContentParser(pdfReader);
        TextExtractionStrategy strategy;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
            strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
            builder.append(strategy.getResultantText());
        }
        return builder.toString().trim();
    }

}
