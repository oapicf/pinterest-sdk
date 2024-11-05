package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.vertxweb.server.model.CatalogsReportFeedIngestionFilter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelReportParametersReport   {
  


  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES"),
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
  private String feedId;
  private String processingResultId;
  private String catalogId;

  public CatalogsHotelReportParametersReport () {

  }

  public CatalogsHotelReportParametersReport (ReportTypeEnum reportType, String feedId, String processingResultId, String catalogId) {
    this.reportType = reportType;
    this.feedId = feedId;
    this.processingResultId = processingResultId;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
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
    CatalogsHotelReportParametersReport catalogsHotelReportParametersReport = (CatalogsHotelReportParametersReport) o;
    return Objects.equals(reportType, catalogsHotelReportParametersReport.reportType) &&
        Objects.equals(feedId, catalogsHotelReportParametersReport.feedId) &&
        Objects.equals(processingResultId, catalogsHotelReportParametersReport.processingResultId) &&
        Objects.equals(catalogId, catalogsHotelReportParametersReport.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, feedId, processingResultId, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelReportParametersReport {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
