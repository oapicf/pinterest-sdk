/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionDeletionRequestStatus;



/**
 * Conversion deletion request
 */

@ApiModel(description = "Conversion deletion request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequest   {
  
  private Date createdTime;
  private Date processedTime;
  private String requestId;
  private ConversionDeletionRequestStatus status;

  /**
   * Timestamp when the conversion deletion request was succesfully created.
   */
  public ConversionDeletionRequest createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Timestamp when the conversion deletion request was succesfully created.")
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Timestamp when the conversion deletion request was processed.
   */
  public ConversionDeletionRequest processedTime(Date processedTime) {
    this.processedTime = processedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp when the conversion deletion request was processed.")
  @JsonProperty("processed_time")
  public Date getProcessedTime() {
    return processedTime;
  }
  public void setProcessedTime(Date processedTime) {
    this.processedTime = processedTime;
  }

  /**
   * Unique identifier of the conversion deletion request
   */
  public ConversionDeletionRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the conversion deletion request")
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
   */
  public ConversionDeletionRequest status(ConversionDeletionRequestStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.")
  @JsonProperty("status")
  public ConversionDeletionRequestStatus getStatus() {
    return status;
  }
  public void setStatus(ConversionDeletionRequestStatus status) {
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
    ConversionDeletionRequest conversionDeletionRequest = (ConversionDeletionRequest) o;
    return Objects.equals(createdTime, conversionDeletionRequest.createdTime) &&
        Objects.equals(processedTime, conversionDeletionRequest.processedTime) &&
        Objects.equals(requestId, conversionDeletionRequest.requestId) &&
        Objects.equals(status, conversionDeletionRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, processedTime, requestId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequest {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    processedTime: ").append(toIndentedString(processedTime)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

