package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionDeletionRequestStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion deletion request
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Conversion deletion request")
public class ConversionDeletionRequest   {
  
  private LocalDate createdTime;

  private LocalDate processedTime;

  private String requestId;

  private ConversionDeletionRequestStatus status;

  /**
   * Timestamp when the conversion deletion request was succesfully created.
   **/
  public ConversionDeletionRequest createdTime(LocalDate createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Timestamp when the conversion deletion request was succesfully created.")
  @JsonProperty("created_time")
  @NotNull
  public LocalDate getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(LocalDate createdTime) {
    this.createdTime = createdTime;
  }


  /**
   * Timestamp when the conversion deletion request was processed.
   **/
  public ConversionDeletionRequest processedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp when the conversion deletion request was processed.")
  @JsonProperty("processed_time")
  public LocalDate getProcessedTime() {
    return processedTime;
  }
  public void setProcessedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
  }


  /**
   * Unique identifier of the conversion deletion request
   **/
  public ConversionDeletionRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the conversion deletion request")
  @JsonProperty("request_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
   **/
  public ConversionDeletionRequest status(ConversionDeletionRequestStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.")
  @JsonProperty("status")
  @NotNull
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
    return Objects.equals(this.createdTime, conversionDeletionRequest.createdTime) &&
        Objects.equals(this.processedTime, conversionDeletionRequest.processedTime) &&
        Objects.equals(this.requestId, conversionDeletionRequest.requestId) &&
        Objects.equals(this.status, conversionDeletionRequest.status);
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

