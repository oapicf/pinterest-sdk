package org.openapitools.model;

import java.time.OffsetDateTime;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Unified model for local inventory items batch operation
 */
public class LocalInventoryItemsBatch implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Id of the batch operation
   */
  @JsonProperty("batch_id")
  private String batchId;

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   */
  @JsonProperty("completed_time")
  private OffsetDateTime completedTime;

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   */
  @JsonProperty("created_time")
  private OffsetDateTime createdTime;

  /**
   * Array of operation results
   */
  @JsonProperty("operation_results")
  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

  /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   */
  @JsonProperty("status")
  private SupplementalItemBatchOperationStatus status;

  /**
   * Id of the batch operation
   * @return batchId
   */
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return completedTime
   */
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return createdTime
   */
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Array of operation results
   * @return operationResults
   */
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

  public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

  /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   * @return status
   */
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
    return Objects.equals(this.batchId, localInventoryItemsBatch.batchId) &&
        Objects.equals(this.completedTime, localInventoryItemsBatch.completedTime) &&
        Objects.equals(this.createdTime, localInventoryItemsBatch.createdTime) &&
        Objects.equals(this.operationResults, localInventoryItemsBatch.operationResults) &&
        Objects.equals(this.status, localInventoryItemsBatch.status);
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
