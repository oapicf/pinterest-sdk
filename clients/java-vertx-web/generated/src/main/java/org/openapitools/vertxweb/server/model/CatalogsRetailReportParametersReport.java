package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.vertxweb.server.model.CatalogsReportFeedIngestionFilter;
import org.openapitools.vertxweb.server.model.CatalogsRetailReportAllItemsFilter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailReportParametersReport   {
  
  private String feedId;
  private String processingResultId;


  public enum ReportTypeEnum {
    ALL_ITEMS("ALL_ITEMS");

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
  private String productGroupId;

  public CatalogsRetailReportParametersReport () {

  }

  public CatalogsRetailReportParametersReport (String feedId, String processingResultId, ReportTypeEnum reportType, String catalogId, String productGroupId) {
    this.feedId = feedId;
    this.processingResultId = processingResultId;
    this.reportType = reportType;
    this.catalogId = catalogId;
    this.productGroupId = productGroupId;
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

    
  @JsonProperty("product_group_id")
  public String getProductGroupId() {
    return productGroupId;
  }
  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailReportParametersReport catalogsRetailReportParametersReport = (CatalogsRetailReportParametersReport) o;
    return Objects.equals(feedId, catalogsRetailReportParametersReport.feedId) &&
        Objects.equals(processingResultId, catalogsRetailReportParametersReport.processingResultId) &&
        Objects.equals(reportType, catalogsRetailReportParametersReport.reportType) &&
        Objects.equals(catalogId, catalogsRetailReportParametersReport.catalogId) &&
        Objects.equals(productGroupId, catalogsRetailReportParametersReport.productGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, processingResultId, reportType, catalogId, productGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailReportParametersReport {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    productGroupId: ").append(toIndentedString(productGroupId)).append("\n");
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
