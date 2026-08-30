package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionDeletionRequestStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Conversion deletion request
 */
@ApiModel(description="Conversion deletion request")

public class ConversionDeletionRequest  {
  
 /**
  * Timestamp when the conversion deletion request was succesfully created.
  */
  @ApiModelProperty(required = true, value = "Timestamp when the conversion deletion request was succesfully created.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate createdTime;

 /**
  * Timestamp when the conversion deletion request was processed.
  */
  @ApiModelProperty(value = "Timestamp when the conversion deletion request was processed.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate processedTime;

 /**
  * Unique identifier of the conversion deletion request
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the conversion deletion request")
  private String requestId;

 /**
  * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  */
  @ApiModelProperty(required = true, value = "Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.")
  @Valid
  private ConversionDeletionRequestStatus status;
 /**
  * Timestamp when the conversion deletion request was succesfully created.
  * @return createdTime
  */
  @JsonProperty("created_time")
  @NotNull
  public LocalDate getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(LocalDate createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionDeletionRequest createdTime(LocalDate createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Timestamp when the conversion deletion request was processed.
  * @return processedTime
  */
  @JsonProperty("processed_time")
  public LocalDate getProcessedTime() {
    return processedTime;
  }

  /**
   * Sets the <code>processedTime</code> property.
   * <br><em>N.B. <code>processedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setProcessedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
  }

  /**
   * Sets the <code>processedTime</code> property.
   * <br><em>N.B. <code>processedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionDeletionRequest processedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
    return this;
  }

 /**
  * Unique identifier of the conversion deletion request
  * @return requestId
  */
  @JsonProperty("request_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getRequestId() {
    return requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   */
 public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   */
  public ConversionDeletionRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

 /**
  * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public ConversionDeletionRequestStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(ConversionDeletionRequestStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionDeletionRequest status(ConversionDeletionRequestStatus status) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

