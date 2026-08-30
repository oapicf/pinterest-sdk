package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;

/**
 * Unified model for local inventory items batch operation
 */
@ApiModel(description = "Unified model for local inventory items batch operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsBatch   {
  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("completed_time")
  private Date completedTime;

  @JsonProperty("created_time")
  private Date createdTime;

  @JsonProperty("operation_results")
  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

  @JsonProperty("status")
  private SupplementalItemBatchOperationStatus status;

   /**
   * Id of the batch operation
   * @return batchId
  **/
  @ApiModelProperty(example = "66753b9bb65c46c49bd", required = true, value = "Id of the batch operation")
  public String getBatchId() {
    return batchId;
  }

   /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
  **/
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  public Date getCompletedTime() {
    return completedTime;
  }

   /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
   * @return createdTime
  **/
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  public Date getCreatedTime() {
    return createdTime;
  }

   /**
   * Array of operation results
   * @return operationResults
  **/
  @ApiModelProperty(required = true, value = "Array of operation results")
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

   /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the batch: PROCESSING, COMPLETED, FAILED")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

