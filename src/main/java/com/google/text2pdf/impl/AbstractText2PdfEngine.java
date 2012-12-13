package com.google.text2pdf.impl;

import com.google.text2pdf.Text2PdfEngine;

import java.io.FileNotFoundException;

/**
 * @author sergiizagriichuk
 */
public abstract class AbstractText2PdfEngine implements Text2PdfEngine {

    protected String pathToReportTemplate;

    @Override
    public void changeReportTemplate(String pathToReportTemplate) throws FileNotFoundException {
        this.pathToReportTemplate = pathToReportTemplate;
    }
}
