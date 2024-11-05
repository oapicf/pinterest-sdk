package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsReportFeedIngestionFilter  {
  
public enum ReportTypeEnum {

    @JsonProperty("FEED_INGESTION_ISSUES") FEED_INGESTION_ISSUES(String.valueOf("FEED_INGESTION_ISSUES"));

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

  @ApiModelProperty(required = true, value = "")
  private ReportTypeEnum reportType;

 /**
  * ID of the feed entity.
  */
  @ApiModelProperty(required = true, value = "ID of the feed entity.")
  private String feedId;

 /**
  * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  */
  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
  private String processingResultId;
 /**
  * Get reportType
  * @return reportType
  */
  @JsonProperty("report_type")
  @NotNull
  public String getReportType() {
    return reportType == null ? null : reportType.value();
  }

  /**
   * Sets the <code>reportType</code> property.
   */
 public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * Sets the <code>reportType</code> property.
   */
  public CatalogsReportFeedIngestionFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

 /**
  * ID of the feed entity.
  * @return feedId
  */
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
 public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
  public CatalogsReportFeedIngestionFilter feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
  * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  * @return processingResultId
  */
  @JsonProperty("processing_result_id")
 @Pattern(regexp="^\\d+$")  public String getProcessingResultId() {
    return processingResultId;
  }

  /**
   * Sets the <code>processingResultId</code> property.
   */
 public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

  /**
   * Sets the <code>processingResultId</code> property.
   */
  public CatalogsReportFeedIngestionFilter processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

