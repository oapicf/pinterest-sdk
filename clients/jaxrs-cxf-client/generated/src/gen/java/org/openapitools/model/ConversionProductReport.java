package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

  private BulkReportingJobStatus reportStatus;

 /**
  * Size of the report in bytes
  */
  @ApiModelProperty(value = "Size of the report in bytes")

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
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }


 /**
   * Async report status
   * @return reportStatus
  **/
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }


 /**
   * Size of the report in bytes
   * @return size
  **/
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }


 /**
   * Token returned from the create report request
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }


 /**
   * URL of the report
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
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

