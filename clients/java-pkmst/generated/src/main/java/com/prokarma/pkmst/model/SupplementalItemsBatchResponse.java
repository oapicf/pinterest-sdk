package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.SupplementalItemBatchOperationStatus;
import com.prokarma.pkmst.model.SupplementalOperationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Response model for supplemental items batch operation
 */
@ApiModel(description = "Response model for supplemental items batch operation")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalItemsBatchResponse   {
  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("completed_time")
  private OffsetDateTime completedTime;

  @JsonProperty("created_time")
  private OffsetDateTime createdTime;

  @JsonProperty("operation_results")
  
  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

  @JsonProperty("status")
  private SupplementalItemBatchOperationStatus status;

  public SupplementalItemsBatchResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the batch operation
   * @return batchId
   */
  @ApiModelProperty(example = "66753b9bb65c46c49bd", required = true, readOnly = true, value = "Id of the batch operation")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public SupplementalItemsBatchResponse completedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
   */
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", readOnly = true, value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  public SupplementalItemsBatchResponse createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
   * @return createdTime
   */
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, readOnly = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public SupplementalItemsBatchResponse operationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
    return this;
  }

  public SupplementalItemsBatchResponse addOperationResultsItem(SupplementalOperationResult operationResultsItem) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "Array of operation results")
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

  public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

  public SupplementalItemsBatchResponse status(SupplementalItemBatchOperationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   * @return status
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Status of the batch: PROCESSING, COMPLETED, FAILED")
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
    SupplementalItemsBatchResponse supplementalItemsBatchResponse = (SupplementalItemsBatchResponse) o;
    return Objects.equals(this.batchId, supplementalItemsBatchResponse.batchId) &&
        Objects.equals(this.completedTime, supplementalItemsBatchResponse.completedTime) &&
        Objects.equals(this.createdTime, supplementalItemsBatchResponse.createdTime) &&
        Objects.equals(this.operationResults, supplementalItemsBatchResponse.operationResults) &&
        Objects.equals(this.status, supplementalItemsBatchResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, completedTime, createdTime, operationResults, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalItemsBatchResponse {\n");
    
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

