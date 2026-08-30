package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class IntegrationLogsInvalidLogResponseRejectedLogsItems   {

    private String field;
    private Integer logIndex;
    private String reason;
    private String value;

    /**
     * Default constructor.
     */
    public IntegrationLogsInvalidLogResponseRejectedLogsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLogsInvalidLogResponseRejectedLogsItems.
     *
     * @param field The field name containing an invalid value.
     * @param logIndex Index of the log in the batch.
     * @param reason The reason the value is invalid.
     * @param value The value that is invalid.
     */
    public IntegrationLogsInvalidLogResponseRejectedLogsItems(
        String field, 
        Integer logIndex, 
        String reason, 
        String value
    ) {
        this.field = field;
        this.logIndex = logIndex;
        this.reason = reason;
        this.value = value;
    }



    /**
     * The field name containing an invalid value.
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /**
     * Index of the log in the batch.
     * @return logIndex
     */
    public Integer getLogIndex() {
        return logIndex;
    }

    public void setLogIndex(Integer logIndex) {
        this.logIndex = logIndex;
    }

    /**
     * The reason the value is invalid.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * The value that is invalid.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationLogsInvalidLogResponseRejectedLogsItems {\n");
        
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

