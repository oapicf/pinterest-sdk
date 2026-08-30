package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SupplementalItemBatchOperationStatus;
import org.openapitools.server.model.SupplementalOperationResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Unified model for local inventory items batch operation
 */
public class LocalInventoryItemsBatch   {

    private String batchId;
    private OffsetDateTime completedTime;
    private OffsetDateTime createdTime;
    private List<SupplementalOperationResult> operationResults = new ArrayList<>();
    private SupplementalItemBatchOperationStatus status;

    /**
     * Default constructor.
     */
    public LocalInventoryItemsBatch() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryItemsBatch.
     *
     * @param batchId Id of the batch operation
     * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @param operationResults Array of operation results
     * @param status Status of the batch: PROCESSING, COMPLETED, FAILED
     */
    public LocalInventoryItemsBatch(
        String batchId, 
        OffsetDateTime completedTime, 
        OffsetDateTime createdTime, 
        List<SupplementalOperationResult> operationResults, 
        SupplementalItemBatchOperationStatus status
    ) {
        this.batchId = batchId;
        this.completedTime = completedTime;
        this.createdTime = createdTime;
        this.operationResults = operationResults;
        this.status = status;
    }



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
     * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
     * @return completedTime
     */
    public OffsetDateTime getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(OffsetDateTime completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
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

    /**
      * Create a string representation of this pojo.
    **/
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

