package apimodels;

import apimodels.SupplementalItemBatchOperationStatus;
import apimodels.SupplementalOperationResult;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Unified model for local inventory items batch operation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalInventoryItemsBatch   {
  @JsonProperty("batch_id")
  @NotNull

  private String batchId;

  @JsonProperty("completed_time")
  @Valid

  private OffsetDateTime completedTime;

  @JsonProperty("created_time")
  @NotNull
@Valid

  private OffsetDateTime createdTime;

  @JsonProperty("operation_results")
  @NotNull
@Valid

  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

  @JsonProperty("status")
  @NotNull
@Valid

  private SupplementalItemBatchOperationStatus status;

  public LocalInventoryItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Id of the batch operation
   * @return batchId
  **/
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public LocalInventoryItemsBatch completedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
    return this;
  }

   /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
  **/
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  public LocalInventoryItemsBatch createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
   * @return createdTime
  **/
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public LocalInventoryItemsBatch operationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
    return this;
  }

  public LocalInventoryItemsBatch addOperationResultsItem(SupplementalOperationResult operationResultsItem) {
    if (this.operationResults == null) {
      this.operationResults = new ArrayList<>();
    }
    this.operationResults.add(operationResultsItem);
    return this;
  }

   /**
   * Array of operation results
   * @return operationResults
  **/
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

  public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

  public LocalInventoryItemsBatch status(SupplementalItemBatchOperationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   * @return status
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

