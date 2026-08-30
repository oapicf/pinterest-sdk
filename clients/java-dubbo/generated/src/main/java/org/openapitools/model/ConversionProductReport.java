package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ConversionProductReport implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Message returned from the create report request
   */
  @JsonProperty("message")
  private String message;

  /**
   * Async report status
   */
  @JsonProperty("report_status")
  private BulkReportingJobStatus reportStatus;

  /**
   * Size of the report in bytes
   */
  @JsonProperty("size")
  private BigDecimal size;

  /**
   * Token returned from the create report request
   */
  @JsonProperty("token")
  private String token;

  /**
   * URL of the report
   */
  @JsonProperty("url")
  private String url;

  /**
   * Message returned from the create report request
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Async report status
   * @return reportStatus
   */
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Size of the report in bytes
   * @return size
   */
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   * Token returned from the create report request
   * @return token
   */
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  /**
   * URL of the report
   * @return url
   */
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
