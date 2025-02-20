/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkReportingJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateMMMReportResponseData
 */
@JsonPropertyOrder({
  CreateMMMReportResponseData.JSON_PROPERTY_REPORT_STATUS,
  CreateMMMReportResponseData.JSON_PROPERTY_TOKEN,
  CreateMMMReportResponseData.JSON_PROPERTY_MESSAGE,
  CreateMMMReportResponseData.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateMMMReportResponseData   {
  public static final String JSON_PROPERTY_REPORT_STATUS = "report_status";
  @JsonProperty(JSON_PROPERTY_REPORT_STATUS)
  private BulkReportingJobStatus reportStatus;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @JsonProperty(JSON_PROPERTY_TOKEN)
  private String token;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private String status;

  public CreateMMMReportResponseData reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  /**
   * Get reportStatus
   * @return reportStatus
   **/
  @JsonProperty(value = "report_status")
  @ApiModelProperty(value = "")
  
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  public CreateMMMReportResponseData token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   **/
  @JsonProperty(value = "token")
  @ApiModelProperty(value = "")
  
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public CreateMMMReportResponseData message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @JsonProperty(value = "message")
  @ApiModelProperty(value = "")
  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateMMMReportResponseData status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(value = "status")
  @ApiModelProperty(example = "success", value = "")
  
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

