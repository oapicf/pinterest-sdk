package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BulkReportingJobStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ConversionProductReport
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionProductReport   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("report_status")
  private BulkReportingJobStatus reportStatus;

  @JsonProperty("size")
  private BigDecimal size;

  @JsonProperty("token")
  private String token;

  @JsonProperty("url")
  private String url;

  public ConversionProductReport message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message returned from the create report request
   * @return message
   */
  @ApiModelProperty(readOnly = true, value = "Message returned from the create report request")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConversionProductReport reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  /**
   * Async report status
   * @return reportStatus
   */
  @ApiModelProperty(readOnly = true, value = "Async report status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  public ConversionProductReport size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Size of the report in bytes
   * @return size
   */
  @ApiModelProperty(readOnly = true, value = "Size of the report in bytes")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public ConversionProductReport token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token returned from the create report request
   * @return token
   */
  @ApiModelProperty(readOnly = true, value = "Token returned from the create report request")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ConversionProductReport url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the report
   * @return url
   */
  @ApiModelProperty(readOnly = true, value = "URL of the report")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

