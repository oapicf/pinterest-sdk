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


public class MMMReport  {
  
  @ApiModelProperty(value = "")
  private String message;

  @ApiModelProperty(value = "")
  @Valid
  private BulkReportingJobStatus reportStatus;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal size;

  @ApiModelProperty(example = "success", value = "")
  private String status;

  @ApiModelProperty(value = "")
  private String token;

  @ApiModelProperty(value = "")
  private String url;
 /**
  * Get message
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
  public MMMReport message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Get reportStatus
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
  public MMMReport reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
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
   * <br><em>N.B. <code>size</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   * <br><em>N.B. <code>size</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MMMReport size(BigDecimal size) {
    this.size = size;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MMMReport status(String status) {
    this.status = status;
    return this;
  }

 /**
  * Get token
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
  public MMMReport token(String token) {
    this.token = token;
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
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MMMReport url(String url) {
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
    MMMReport mmMReport = (MMMReport) o;
    return Objects.equals(this.message, mmMReport.message) &&
        Objects.equals(this.reportStatus, mmMReport.reportStatus) &&
        Objects.equals(this.size, mmMReport.size) &&
        Objects.equals(this.status, mmMReport.status) &&
        Objects.equals(this.token, mmMReport.token) &&
        Objects.equals(this.url, mmMReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reportStatus, size, status, token, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MMMReport {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

