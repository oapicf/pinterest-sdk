package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BulkReportingJobStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateMMMReportResponseData  {
  
  @ApiModelProperty(value = "")
  private BulkReportingJobStatus reportStatus;

  @ApiModelProperty(value = "")
  private String token;

  @ApiModelProperty(value = "")
  private String message;

  @ApiModelProperty(example = "success", value = "")
  private String status;
 /**
   * Get reportStatus
   * @return reportStatus
  **/
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  public CreateMMMReportResponseData reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

 /**
   * Get token
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public CreateMMMReportResponseData token(String token) {
    this.token = token;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateMMMReportResponseData message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CreateMMMReportResponseData status(String status) {
    this.status = status;
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
    CreateMMMReportResponseData createMMMReportResponseData = (CreateMMMReportResponseData) o;
    return Objects.equals(this.reportStatus, createMMMReportResponseData.reportStatus) &&
        Objects.equals(this.token, createMMMReportResponseData.token) &&
        Objects.equals(this.message, createMMMReportResponseData.message) &&
        Objects.equals(this.status, createMMMReportResponseData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, token, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMMMReportResponseData {\n");
    
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

