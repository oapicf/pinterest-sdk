package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BulkReportingJobStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class TemplateBasedReportCreate   {

    private String message;
    private BulkReportingJobStatus reportStatus;
    private String token;

    /**
     * Default constructor.
     */
    public TemplateBasedReportCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create TemplateBasedReportCreate.
     *
     * @param message message
     * @param reportStatus reportStatus
     * @param token token
     */
    public TemplateBasedReportCreate(
        String message, 
        BulkReportingJobStatus reportStatus, 
        String token
    ) {
        this.message = message;
        this.reportStatus = reportStatus;
        this.token = token;
    }



    /**
     * Get message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get reportStatus
     * @return reportStatus
     */
    public BulkReportingJobStatus getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(BulkReportingJobStatus reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * Get token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateBasedReportCreate {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

