package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.vertxweb.server.model.CatalogsReportFeedIngestionFilter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailReportStatsParametersReport   {
  
  private String feedId;
  private String processingResultId;


  public enum ReportTypeEnum {
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ReportTypeEnum reportType;
  private String catalogId;

  public CatalogsRetailReportStatsParametersReport () {

  }

  public CatalogsRetailReportStatsParametersReport (String feedId, String processingResultId, ReportTypeEnum reportType, String catalogId) {
    this.feedId = feedId;
    this.processingResultId = processingResultId;
    this.reportType = reportType;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("processing_result_id")
  public String getProcessingResultId() {
    return processingResultId;
  }
  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

    
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailReportStatsParametersReport catalogsRetailReportStatsParametersReport = (CatalogsRetailReportStatsParametersReport) o;
    return Objects.equals(feedId, catalogsRetailReportStatsParametersReport.feedId) &&
        Objects.equals(processingResultId, catalogsRetailReportStatsParametersReport.processingResultId) &&
        Objects.equals(reportType, catalogsRetailReportStatsParametersReport.reportType) &&
        Objects.equals(catalogId, catalogsRetailReportStatsParametersReport.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, processingResultId, reportType, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailReportStatsParametersReport {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
