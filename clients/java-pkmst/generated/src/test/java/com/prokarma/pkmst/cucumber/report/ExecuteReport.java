package com.prokarma.pkmst.cucumber.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ExecuteReport {

  public static void main(String[] args) {
    generateReport();
  }

  private static void generateReport() {
    String buildNumber = "1";
    String projectName = "Spring-micro-sample";
    boolean runWithJenkins = false;
    boolean parallelTesting = false;

    File reportOutputDirectory = null;
    List<String> jsonFiles = null;
    Configuration configuration = null;
    ReportBuilder reportBuilder = null;
    reportOutputDirectory = new File("./report/ad_accounts-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/ad_accounts-report-json/ad_accounts.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/ad_groups-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/ad_groups-report-json/ad_groups.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/ads-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/ads-report-json/ads.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/advanced_auction-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/advanced_auction-report-json/advanced_auction.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/audience_insights-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/audience_insights-report-json/audience_insights.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/audience_sharing-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/audience_sharing-report-json/audience_sharing.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/audiences-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/audiences-report-json/audiences.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/billing-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/billing-report-json/billing.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/boards-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/boards-report-json/boards.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/bulk-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/bulk-report-json/bulk.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/campaigns-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/campaigns-report-json/campaigns.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/catalogs-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/catalogs-report-json/catalogs.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/conversion_events-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/conversion_events-report-json/conversion_events.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/conversion_tags-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/conversion_tags-report-json/conversion_tags.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/customer_lists-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/customer_lists-report-json/customer_lists.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/integrations-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/integrations-report-json/integrations.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/keywords-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/keywords-report-json/keywords.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/lead_ads-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/lead_ads-report-json/lead_ads.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/lead_forms-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/lead_forms-report-json/lead_forms.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/leads_export-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/leads_export-report-json/leads_export.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/media-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/media-report-json/media.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/oauth-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/oauth-report-json/oauth.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/order_lines-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/order_lines-report-json/order_lines.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/pins-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/pins-report-json/pins.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/product_group_promotions-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/product_group_promotions-report-json/product_group_promotions.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/resources-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/resources-report-json/resources.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/search-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/search-report-json/search.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/targeting_template-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/targeting_template-report-json/targeting_template.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/terms-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/terms-report-json/terms.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/terms_of_service-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/terms_of_service-report-json/terms_of_service.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/user_account-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/user_account-report-json/user_account.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();

  }
}