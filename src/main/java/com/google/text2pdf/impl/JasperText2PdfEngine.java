package com.google.text2pdf.impl;

import java.io.FileNotFoundException;

/**
 * @author sergiizagriichuk
 */
public class JasperText2PdfEngine extends AbstractText2PdfEngine {

    public JasperText2PdfEngine(String pathToReportTemplate) {
        this.pathToReportTemplate = pathToReportTemplate;
    }

    @Override
    public void convertTextToPdf(String text, String pathToPdfFile) throws FileNotFoundException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
