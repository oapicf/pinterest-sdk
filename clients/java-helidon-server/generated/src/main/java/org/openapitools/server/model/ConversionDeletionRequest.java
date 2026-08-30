package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ConversionDeletionRequestStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Conversion deletion request
 */
public class ConversionDeletionRequest   {

    private LocalDate createdTime;
    private LocalDate processedTime;
    private String requestId;
    private ConversionDeletionRequestStatus status;

    /**
     * Default constructor.
     */
    public ConversionDeletionRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionDeletionRequest.
     *
     * @param createdTime Timestamp when the conversion deletion request was succesfully created.
     * @param processedTime Timestamp when the conversion deletion request was processed.
     * @param requestId Unique identifier of the conversion deletion request
     * @param status Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
     */
    public ConversionDeletionRequest(
        LocalDate createdTime, 
        LocalDate processedTime, 
        String requestId, 
        ConversionDeletionRequestStatus status
    ) {
        this.createdTime = createdTime;
        this.processedTime = processedTime;
        this.requestId = requestId;
        this.status = status;
    }



    /**
     * Timestamp when the conversion deletion request was succesfully created.
     * @return createdTime
     */
    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Timestamp when the conversion deletion request was processed.
     * @return processedTime
     */
    public LocalDate getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(LocalDate processedTime) {
        this.processedTime = processedTime;
    }

    /**
     * Unique identifier of the conversion deletion request
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
     * @return status
     */
    public ConversionDeletionRequestStatus getStatus() {
        return status;
    }

    public void setStatus(ConversionDeletionRequestStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionDeletionRequest {\n");
        
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    processedTime: ").append(toIndentedString(processedTime)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

