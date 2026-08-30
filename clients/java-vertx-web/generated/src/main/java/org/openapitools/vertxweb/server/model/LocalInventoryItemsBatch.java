package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SupplementalItemBatchOperationStatus;
import org.openapitools.vertxweb.server.model.SupplementalOperationResult;

/**
 * Unified model for local inventory items batch operation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalInventoryItemsBatch   {
  
  private String batchId;
  private OffsetDateTime completedTime;
  private OffsetDateTime createdTime;
  private List<SupplementalOperationResult> operationResults = new ArrayList<>();
  private SupplementalItemBatchOperationStatus status;

  public LocalInventoryItemsBatch () {

  }

  public LocalInventoryItemsBatch (String batchId, OffsetDateTime completedTime, OffsetDateTime createdTime, List<SupplementalOperationResult> operationResults, SupplementalItemBatchOperationStatus status) {
    this.batchId = batchId;
    this.completedTime = completedTime;
    this.createdTime = createdTime;
    this.operationResults = operationResults;
    this.status = status;
  }

    
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

    
  @JsonProperty("completed_time")
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

    
  @JsonProperty("created_time")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("operation_results")
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }
  public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

    
  @JsonProperty("status")
  public SupplementalItemBatchOperationStatus getStatus() {
    return status;
  }
  public void setStatus(SupplementalItemBatchOperationStatus status) {
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
    LocalInventoryItemsBatch localInventoryItemsBatch = (LocalInventoryItemsBatch) o;
    return Objects.equals(batchId, localInventoryItemsBatch.batchId) &&
        Objects.equals(completedTime, localInventoryItemsBatch.completedTime) &&
        Objects.equals(createdTime, localInventoryItemsBatch.createdTime) &&
        Objects.equals(operationResults, localInventoryItemsBatch.operationResults) &&
        Objects.equals(status, localInventoryItemsBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, completedTime, createdTime, operationResults, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemsBatch {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    operationResults: ").append(toIndentedString(operationResults)).append("\n");
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
