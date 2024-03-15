package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BulkReportingJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdsAnalyticsGetAsyncResponse   {
  
  private BulkReportingJobStatus reportStatus;

  private String url;

  private BigDecimal size;

  /**
   **/
  public AdsAnalyticsGetAsyncResponse reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }
  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }


  /**
   **/
  public AdsAnalyticsGetAsyncResponse url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   **/
  public AdsAnalyticsGetAsyncResponse size(BigDecimal size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse = (AdsAnalyticsGetAsyncResponse) o;
    return Objects.equals(this.reportStatus, adsAnalyticsGetAsyncResponse.reportStatus) &&
        Objects.equals(this.url, adsAnalyticsGetAsyncResponse.url) &&
        Objects.equals(this.size, adsAnalyticsGetAsyncResponse.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, url, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsGetAsyncResponse {\n");
    
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

