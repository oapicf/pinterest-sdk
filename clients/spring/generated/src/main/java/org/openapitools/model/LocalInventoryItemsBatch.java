package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Unified model for local inventory items batch operation
 */

@Schema(name = "LocalInventoryItemsBatch", description = "Unified model for local inventory items batch operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsBatch {

  private String batchId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdTime;

  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

  private SupplementalItemBatchOperationStatus status;

  public LocalInventoryItemsBatch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalInventoryItemsBatch(String batchId, OffsetDateTime createdTime, List<SupplementalOperationResult> operationResults, SupplementalItemBatchOperationStatus status) {
    this.batchId = batchId;
    this.createdTime = createdTime;
    this.operationResults = operationResults;
    this.status = status;
  }

  public LocalInventoryItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the batch operation
   * @return batchId
   */
  
  @Schema(name = "batch_id", accessMode = Schema.AccessMode.READ_ONLY, example = "66753b9bb65c46c49bd", description = "Id of the batch operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  @JsonProperty("batch_id")
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public LocalInventoryItemsBatch completedTime(@Nullable OffsetDateTime completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
   */
  @Valid 
  @Schema(name = "completed_time", accessMode = Schema.AccessMode.READ_ONLY, example = "2022-03-14T15:16:34Z", description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_time")
  public @Nullable OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  @JsonProperty("completed_time")
  public void setCompletedTime(@Nullable OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  public LocalInventoryItemsBatch createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
   * @return createdTime
   */
  @Valid 
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, example = "2022-03-14T15:15:22Z", description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_time")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
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
   */
  @Valid 
  @Schema(name = "operation_results", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of operation results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation_results")
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

  @JsonProperty("operation_results")
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
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, description = "Status of the batch: PROCESSING, COMPLETED, FAILED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public SupplementalItemBatchOperationStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

