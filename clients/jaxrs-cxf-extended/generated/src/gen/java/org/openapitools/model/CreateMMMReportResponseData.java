package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BulkReportingJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateMMMReportResponseData  {
  
  @ApiModelProperty(value = "")
  @Valid
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
  */
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   */
 public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   */
  public CreateMMMReportResponseData reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
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
   */
 public void setToken(String token) {
    this.token = token;
  }

  /**
   * Sets the <code>token</code> property.
   */
  public CreateMMMReportResponseData token(String token) {
    this.token = token;
    return this;
  }

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
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public CreateMMMReportResponseData message(String message) {
    this.message = message;
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
   */
 public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
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

