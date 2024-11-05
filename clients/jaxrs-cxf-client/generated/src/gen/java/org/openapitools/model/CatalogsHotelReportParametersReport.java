package org.openapitools.model;

import org.openapitools.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.model.CatalogsReportFeedIngestionFilter;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsHotelReportParametersReport  {
  
public enum ReportTypeEnum {

FEED_INGESTION_ISSUES(String.valueOf("FEED_INGESTION_ISSUES")), DISTRIBUTION_ISSUES(String.valueOf("DISTRIBUTION_ISSUES"));


    private String value;

    ReportTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String value) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ReportTypeEnum reportType;

  @ApiModelProperty(required = true, value = "ID of the feed entity.")
 /**
   * ID of the feed entity.
  **/
  private String feedId;

  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
 /**
   * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  **/
  private String processingResultId;

  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
 /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
  **/
  private String catalogId;
 /**
   * Get reportType
   * @return reportType
  **/
  @JsonProperty("report_type")
  public String getReportType() {
    if (reportType == null) {
      return null;
    }
    return reportType.value();
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsHotelReportParametersReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

 /**
   * ID of the feed entity.
   * @return feedId
  **/
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsHotelReportParametersReport feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
   * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   * @return processingResultId
  **/
  @JsonProperty("processing_result_id")
  public String getProcessingResultId() {
    return processingResultId;
  }

  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

  public CatalogsHotelReportParametersReport processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

 /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsHotelReportParametersReport catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
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
    return Objects.equals(this.reportType, catalogsHotelReportParametersReport.reportType) &&
        Objects.equals(this.feedId, catalogsHotelReportParametersReport.feedId) &&
        Objects.equals(this.processingResultId, catalogsHotelReportParametersReport.processingResultId) &&
        Objects.equals(this.catalogId, catalogsHotelReportParametersReport.catalogId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

