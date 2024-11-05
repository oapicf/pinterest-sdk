package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsReportFeedIngestionFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportFeedIngestionFilter implements CatalogsHotelReportParametersReport {

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReportTypeEnum reportType;

  private String feedId;

  private String processingResultId;

  public CatalogsReportFeedIngestionFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsReportFeedIngestionFilter(ReportTypeEnum reportType, String feedId) {
    this.reportType = reportType;
    this.feedId = feedId;
  }

  public CatalogsReportFeedIngestionFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
   */
  @NotNull 
  @Schema(name = "report_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("report_type")
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
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "feed_id", description = "ID of the feed entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feed_id")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "processing_result_id", description = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processing_result_id")
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

