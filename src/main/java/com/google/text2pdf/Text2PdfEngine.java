package com.google.text2pdf;

import java.io.FileNotFoundException;

/**
 * @author sergiizagriichuk
 */
public interface Text2PdfEngine {
    void convertTextToPdf(String text, String pathToPdfFile) throws FileNotFoundException;

    public void changeReportTemplate(String pathToReportTemplate) throws FileNotFoundException;
}
