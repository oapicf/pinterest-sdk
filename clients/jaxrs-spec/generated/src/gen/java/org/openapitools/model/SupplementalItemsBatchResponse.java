package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Response model for supplemental items batch operation
 **/
@ApiModel(description = "Response model for supplemental items batch operation")
@JsonTypeName("SupplementalItemsBatchResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalItemsBatchResponse   {
  private String batchId;
  private Date completedTime;
  private Date createdTime;
  private @Valid List<SupplementalOperationResult> operationResults = new ArrayList<>();
  private SupplementalItemBatchOperationStatus status;

  public SupplementalItemsBatchResponse() {
  }

  @JsonCreator
  public SupplementalItemsBatchResponse(
    @JsonProperty(required = true, value = "batch_id") String batchId,
    @JsonProperty(required = true, value = "created_time") Date createdTime,
    @JsonProperty(required = true, value = "operation_results") List<@Valid SupplementalOperationResult> operationResults,
    @JsonProperty(required = true, value = "status") SupplementalItemBatchOperationStatus status
  ) {
    this.batchId = batchId;
    this.createdTime = createdTime;
    this.operationResults = operationResults;
    this.status = status;
  }

  /**
   * Id of the batch operation
   **/
  public SupplementalItemsBatchResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @ApiModelProperty(example = "66753b9bb65c46c49bd", required = true, value = "Id of the batch operation")
  @JsonProperty(required = true, value = "batch_id")
  public String getBatchId() {
    return batchId;
  }

  @JsonProperty(required = true, value = "batch_id")
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public SupplementalItemsBatchResponse completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  @JsonProperty("completed_time")
  public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public SupplementalItemsBatchResponse createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty(required = true, value = "created_time")
  public Date getCreatedTime() {
    return createdTime;
  }

  @JsonProperty(required = true, value = "created_time")
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Array of operation results
   **/
  public SupplementalItemsBatchResponse operationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of operation results")
  @JsonProperty(required = true, value = "operation_results")
  @Valid public List<@Valid SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

  @JsonProperty(required = true, value = "operation_results")
  public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

  public SupplementalItemsBatchResponse addOperationResultsItem(SupplementalOperationResult operationResultsItem) {
    if (this.operationResults == null) {
      this.operationResults = new ArrayList<>();
    }

    this.operationResults.add(operationResultsItem);
    return this;
  }

  public SupplementalItemsBatchResponse removeOperationResultsItem(SupplementalOperationResult operationResultsItem) {
    if (operationResultsItem != null && this.operationResults != null) {
      this.operationResults.remove(operationResultsItem);
    }

    return this;
  }
  /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   **/
  public SupplementalItemsBatchResponse status(SupplementalItemBatchOperationStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status of the batch: PROCESSING, COMPLETED, FAILED")
  @JsonProperty(required = true, value = "status")
  public SupplementalItemBatchOperationStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
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
