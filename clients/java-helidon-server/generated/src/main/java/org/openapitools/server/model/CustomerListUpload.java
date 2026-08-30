package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ErrorDetail;
import org.openapitools.server.model.RecordCounts;
import org.openapitools.server.model.UserListOperationType;
import org.openapitools.server.model.WorkloadState;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomerListUpload   {

    private String adAccountId;
    private Integer creationTime;
    private String customerListId;
    private List<@Valid ErrorDetail> errorCounts;
    private String id;
    private UserListOperationType operation;
    private RecordCounts recordCounts;
    private WorkloadState state;
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public CustomerListUpload() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerListUpload.
     *
     * @param adAccountId Advertiser ID.
     * @param creationTime Customer List Upload creation_time. Epoch (seconds).
     * @param customerListId ID of the customer list associated with this upload.
     * @param errorCounts Error counts by error code
     * @param id Customer List Upload ID.
     * @param operation operation
     * @param recordCounts Record processing counts
     * @param state state
     * @param updatedTime Customer List Upload updated_time. Epoch (seconds).
     */
    public CustomerListUpload(
        String adAccountId, 
        Integer creationTime, 
        String customerListId, 
        List<@Valid ErrorDetail> errorCounts, 
        String id, 
        UserListOperationType operation, 
        RecordCounts recordCounts, 
        WorkloadState state, 
        Integer updatedTime
    ) {
        this.adAccountId = adAccountId;
        this.creationTime = creationTime;
        this.customerListId = customerListId;
        this.errorCounts = errorCounts;
        this.id = id;
        this.operation = operation;
        this.recordCounts = recordCounts;
        this.state = state;
        this.updatedTime = updatedTime;
    }



    /**
     * Advertiser ID.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Customer List Upload creation_time. Epoch (seconds).
     * @return creationTime
     */
    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * ID of the customer list associated with this upload.
     * @return customerListId
     */
    public String getCustomerListId() {
        return customerListId;
    }

    public void setCustomerListId(String customerListId) {
        this.customerListId = customerListId;
    }

    /**
     * Error counts by error code
     * @return errorCounts
     */
    public List<@Valid ErrorDetail> getErrorCounts() {
        return errorCounts;
    }

    public void setErrorCounts(List<@Valid ErrorDetail> errorCounts) {
        this.errorCounts = errorCounts;
    }

    /**
     * Customer List Upload ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get operation
     * @return operation
     */
    public UserListOperationType getOperation() {
        return operation;
    }

    public void setOperation(UserListOperationType operation) {
        this.operation = operation;
    }

    /**
     * Record processing counts
     * @return recordCounts
     */
    public RecordCounts getRecordCounts() {
        return recordCounts;
    }

    public void setRecordCounts(RecordCounts recordCounts) {
        this.recordCounts = recordCounts;
    }

    /**
     * Get state
     * @return state
     */
    public WorkloadState getState() {
        return state;
    }

    public void setState(WorkloadState state) {
        this.state = state;
    }

    /**
     * Customer List Upload updated_time. Epoch (seconds).
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerListUpload {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    customerListId: ").append(toIndentedString(customerListId)).append("\n");
        sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    recordCounts: ").append(toIndentedString(recordCounts)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

