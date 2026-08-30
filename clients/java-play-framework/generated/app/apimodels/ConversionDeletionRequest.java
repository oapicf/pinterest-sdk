package apimodels;

import apimodels.ConversionDeletionRequestStatus;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Conversion deletion request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionDeletionRequest   {
  @JsonProperty("created_time")
  @NotNull
@Valid

  private LocalDate createdTime;

  @JsonProperty("processed_time")
  @Valid

  private LocalDate processedTime;

  @JsonProperty("request_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String requestId;

  @JsonProperty("status")
  @NotNull
@Valid

  private ConversionDeletionRequestStatus status;

  public ConversionDeletionRequest createdTime(LocalDate createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Timestamp when the conversion deletion request was succesfully created.
   * @return createdTime
  **/
  public LocalDate getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(LocalDate createdTime) {
    this.createdTime = createdTime;
  }

  public ConversionDeletionRequest processedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
    return this;
  }

   /**
   * Timestamp when the conversion deletion request was processed.
   * @return processedTime
  **/
  public LocalDate getProcessedTime() {
    return processedTime;
  }

  public void setProcessedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
  }

  public ConversionDeletionRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier of the conversion deletion request
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ConversionDeletionRequest status(ConversionDeletionRequestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
   * @return status
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

