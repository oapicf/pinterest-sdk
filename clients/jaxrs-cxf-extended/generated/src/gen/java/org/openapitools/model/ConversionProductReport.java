package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionProductReport  {
  
 /**
  * Message returned from the create report request
  */
  @ApiModelProperty(value = "Message returned from the create report request")
  private String message;

 /**
  * Async report status
  */
  @ApiModelProperty(value = "Async report status")
  @Valid
  private BulkReportingJobStatus reportStatus;

 /**
  * Size of the report in bytes
  */
  @ApiModelProperty(value = "Size of the report in bytes")
  @Valid
  private BigDecimal size;

 /**
  * Token returned from the create report request
  */
  @ApiModelProperty(value = "Token returned from the create report request")
  private String token;

 /**
  * URL of the report
  */
  @ApiModelProperty(value = "URL of the report")
  private String url;
 /**
  * Message returned from the create report request
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   * <br><em>N.B. <code>message</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   * <br><em>N.B. <code>message</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionProductReport message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Async report status
  * @return reportStatus
  */
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   * <br><em>N.B. <code>reportStatus</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   * <br><em>N.B. <code>reportStatus</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionProductReport reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

 /**
  * Size of the report in bytes
  * @return size
  */
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   * <br><em>N.B. <code>size</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   * <br><em>N.B. <code>size</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionProductReport size(BigDecimal size) {
    this.size = size;
    return this;
  }

 /**
  * Token returned from the create report request
  * @return token
  */
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  /**
   * Sets the <code>token</code> property.
   * <br><em>N.B. <code>token</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setToken(String token) {
    this.token = token;
  }

  /**
   * Sets the <code>token</code> property.
   * <br><em>N.B. <code>token</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionProductReport token(String token) {
    this.token = token;
    return this;
  }

 /**
  * URL of the report
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionProductReport url(String url) {
    this.url = url;
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
    ConversionProductReport conversionProductReport = (ConversionProductReport) o;
    return Objects.equals(this.message, conversionProductReport.message) &&
        Objects.equals(this.reportStatus, conversionProductReport.reportStatus) &&
        Objects.equals(this.size, conversionProductReport.size) &&
        Objects.equals(this.token, conversionProductReport.token) &&
        Objects.equals(this.url, conversionProductReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reportStatus, size, token, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionProductReport {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

