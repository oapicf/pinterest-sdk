package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsAnalyticsGetAsyncResponse  {
  
  @ApiModelProperty(value = "")
  private String reportStatus;

  @ApiModelProperty(value = "")
  private String url;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal size;
 /**
  * Get reportStatus
  * @return reportStatus
  */
  @JsonProperty("report_status")
  public String getReportStatus() {
    return reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   */
 public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   */
  public AdsAnalyticsGetAsyncResponse reportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public AdsAnalyticsGetAsyncResponse url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Get size
  * @return size
  */
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public AdsAnalyticsGetAsyncResponse size(BigDecimal size) {
    this.size = size;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

