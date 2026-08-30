package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Response model for supplemental items batch operation
 */
@ApiModel(description="Response model for supplemental items batch operation")

public class SupplementalItemsBatchResponse  {
  
 /**
  * Id of the batch operation
  */
  @ApiModelProperty(example = "66753b9bb65c46c49bd", required = true, value = "Id of the batch operation")
  private String batchId;

 /**
  * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date completedTime;

 /**
  * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdTime;

 /**
  * Array of operation results
  */
  @ApiModelProperty(required = true, value = "Array of operation results")
  @Valid
  private List<SupplementalOperationResult> operationResults = new ArrayList<>();

 /**
  * Status of the batch: PROCESSING, COMPLETED, FAILED
  */
  @ApiModelProperty(required = true, value = "Status of the batch: PROCESSING, COMPLETED, FAILED")
  @Valid
  private SupplementalItemBatchOperationStatus status;
 /**
  * Id of the batch operation
  * @return batchId
  */
  @JsonProperty("batch_id")
  @NotNull
  public String getBatchId() {
    return batchId;
  }

  /**
   * Sets the <code>batchId</code> property.
   * <br><em>N.B. <code>batchId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * Sets the <code>batchId</code> property.
   * <br><em>N.B. <code>batchId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SupplementalItemsBatchResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
  * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
  * @return completedTime
  */
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  /**
   * Sets the <code>completedTime</code> property.
   * <br><em>N.B. <code>completedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Sets the <code>completedTime</code> property.
   * <br><em>N.B. <code>completedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SupplementalItemsBatchResponse completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

 /**
  * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
  * @return createdTime
  */
  @JsonProperty("created_time")
  @NotNull
  public Date getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SupplementalItemsBatchResponse createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Array of operation results
  * @return operationResults
  */
  @JsonProperty("operation_results")
  @NotNull
  public List<SupplementalOperationResult> getOperationResults() {
    return operationResults;
  }

  /**
   * Sets the <code>operationResults</code> property.
   * <br><em>N.B. <code>operationResults</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setOperationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
  }

  /**
   * Sets the <code>operationResults</code> property.
   * <br><em>N.B. <code>operationResults</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SupplementalItemsBatchResponse operationResults(List<SupplementalOperationResult> operationResults) {
    this.operationResults = operationResults;
    return this;
  }

  /**
   * Adds a new item to the <code>operationResults</code> list.
   * <br><em>N.B. <code>operationResults</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SupplementalItemsBatchResponse addOperationResultsItem(SupplementalOperationResult operationResultsItem) {
    this.operationResults.add(operationResultsItem);
    return this;
  }

 /**
  * Status of the batch: PROCESSING, COMPLETED, FAILED
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public SupplementalItemBatchOperationStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(SupplementalItemBatchOperationStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SupplementalItemsBatchResponse status(SupplementalItemBatchOperationStatus status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

