/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogsReportFeedIngestionFilter {
  
  public enum ReportTypeEnum {
     FEED_INGESTION_ISSUES, 
  };
  @SerializedName("report_type")
  private ReportTypeEnum reportType = null;
  @SerializedName("feed_id")
  private String feedId = null;
  @SerializedName("processing_result_id")
  private String processingResultId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * ID of the feed entity.
   **/
  @ApiModelProperty(required = true, value = "ID of the feed entity.")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
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
    return (this.reportType == null ? catalogsReportFeedIngestionFilter.reportType == null : this.reportType.equals(catalogsReportFeedIngestionFilter.reportType)) &&
        (this.feedId == null ? catalogsReportFeedIngestionFilter.feedId == null : this.feedId.equals(catalogsReportFeedIngestionFilter.feedId)) &&
        (this.processingResultId == null ? catalogsReportFeedIngestionFilter.processingResultId == null : this.processingResultId.equals(catalogsReportFeedIngestionFilter.processingResultId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.reportType == null ? 0: this.reportType.hashCode());
    result = 31 * result + (this.feedId == null ? 0: this.feedId.hashCode());
    result = 31 * result + (this.processingResultId == null ? 0: this.processingResultId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportFeedIngestionFilter {\n");
    
    sb.append("  reportType: ").append(reportType).append("\n");
    sb.append("  feedId: ").append(feedId).append("\n");
    sb.append("  processingResultId: ").append(processingResultId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
