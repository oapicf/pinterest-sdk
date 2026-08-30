package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }


 /**
   * Get reportStatus
   * @return reportStatus
  **/
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }


 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }


 /**
   * Get token
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }


 /**
   * Get url
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

