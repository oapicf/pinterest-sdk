package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Unified model for local inventory items batch operation
 */
@ApiModel(description="Unified model for local inventory items batch operation")

public class LocalInventoryItemsBatch  {
  
 /**
  * Id of the batch operation
  */
  @ApiModelProperty(example = "66753b9bb65c46c49bd", required = true, value = "Id of the batch operation")

  private String batchId;

 /**
  * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")

  private Date completedTime;

 /**
  * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")

  private Date createdTime;

 /**
  * Array of operation results
  */
  @ApiModelProperty(required = true, value = "Array of operation results")

  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

 /**
  * Status of the batch: PROCESSING, COMPLETED, FAILED
  */
  @ApiModelProperty(required = true, value = "Status of the batch: PROCESSING, COMPLETED, FAILED")

  private SupplementalItemBatchOperationStatus status;
 /**
   * Id of the batch operation
   * @return batchId
  **/
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }


 /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return completedTime
  **/
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }


 /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }


 /**
   * Array of operation results
   * @return operationResults
  **/
  @JsonProperty("operation_results")
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }


 /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   * @return status
  **/
  @JsonProperty("status")
  public SupplementalItemBatchOperationStatus getStatus() {
    return status;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

