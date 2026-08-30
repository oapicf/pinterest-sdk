package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestStatus;

/**
 * Conversion deletion request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionDeletionRequest   {
  
  private LocalDate createdTime;
  private LocalDate processedTime;
  private String requestId;
  private ConversionDeletionRequestStatus status;

  public ConversionDeletionRequest () {

  }

  public ConversionDeletionRequest (LocalDate createdTime, LocalDate processedTime, String requestId, ConversionDeletionRequestStatus status) {
    this.createdTime = createdTime;
    this.processedTime = processedTime;
    this.requestId = requestId;
    this.status = status;
  }

    
  @JsonProperty("created_time")
  public LocalDate getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(LocalDate createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("processed_time")
  public LocalDate getProcessedTime() {
    return processedTime;
  }
  public void setProcessedTime(LocalDate processedTime) {
    this.processedTime = processedTime;
  }

    
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

    
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
