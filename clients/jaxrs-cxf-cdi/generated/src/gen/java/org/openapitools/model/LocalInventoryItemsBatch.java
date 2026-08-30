package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Unified model for local inventory items batch operation
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Unified model for local inventory items batch operation")
public class LocalInventoryItemsBatch   {
  
  private String batchId;

  private java.util.Date completedTime;

  private java.util.Date createdTime;

  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

  private SupplementalItemBatchOperationStatus status;

  /**
   * Id of the batch operation
   **/
  public LocalInventoryItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @ApiModelProperty(example = "66753b9bb65c46c49bd", required = true, value = "Id of the batch operation")
  @JsonProperty("batch_id")
  @NotNull
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public LocalInventoryItemsBatch completedTime(java.util.Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("completed_time")
  public java.util.Date getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(java.util.Date completedTime) {
    this.completedTime = completedTime;
  }


  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public LocalInventoryItemsBatch createdTime(java.util.Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("created_time")
  @NotNull
  public java.util.Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(java.util.Date createdTime) {
    this.createdTime = createdTime;
  }


  /**
   * Array of operation results
   **/
  public LocalInventoryItemsBatch operationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of operation results")
  @JsonProperty("operation_results")
  @NotNull
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }
  public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

  public LocalInventoryItemsBatch addOperationResultsItem(SupplementalOperationResult operationResultsItem) {
    if (this.operationResults == null) {
      this.operationResults = new ArrayList<>();
    }
    this.operationResults.add(operationResultsItem);
    return this;
  }


  /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   **/
  public LocalInventoryItemsBatch status(SupplementalItemBatchOperationStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status of the batch: PROCESSING, COMPLETED, FAILED")
  @JsonProperty("status")
  @NotNull
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

