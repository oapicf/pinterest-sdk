package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CatalogsReportFeedIngestionFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportFeedIngestionFilter   {
  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String text) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("report_type")
  private ReportTypeEnum reportType;

  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("processing_result_id")
  private String processingResultId;

  public CatalogsReportFeedIngestionFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(required = true, value = "")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportFeedIngestionFilter feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * ID of the feed entity.
   * @return feedId
  **/
  @ApiModelProperty(required = true, value = "ID of the feed entity.")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsReportFeedIngestionFilter processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

   /**
   * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   * @return processingResultId
  **/
  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
  public String getProcessingResultId() {
    return processingResultId;
  }

  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter = (CatalogsReportFeedIngestionFilter) o;
    return Objects.equals(this.reportType, catalogsReportFeedIngestionFilter.reportType) &&
        Objects.equals(this.feedId, catalogsReportFeedIngestionFilter.feedId) &&
        Objects.equals(this.processingResultId, catalogsReportFeedIngestionFilter.processingResultId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, feedId, processingResultId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportFeedIngestionFilter {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
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

