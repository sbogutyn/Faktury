/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans; 

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;

import java.io.File;
import java.util.*;

/**
 *
 * @author wieslaw
 */
public class Raport {
    public static void main(String[] args) {
        String fileName = "raport.jasper";
        String outFileName = "raport.pdf";
        HashMap hm = new HashMap();
        try {
            // Fill the report using an empty data source
            JasperPrint print = JasperFillManager.fillReport(fileName, hm, new JREmptyDataSource());

            // Create a PDF exporter
            JRExporter exporter = new JRPdfExporter();

            // Configure the exporter (set output file name and print object)
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outFileName);
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);

            // Export the PDF file
            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
