package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.EventProcessingStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionApiResponseEventsItems   {

    private String errorMessage;
    private EventProcessingStatus status;
    private String warningMessage;

    /**
     * Default constructor.
     */
    public ConversionApiResponseEventsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionApiResponseEventsItems.
     *
     * @param errorMessage Error message containing more information about why the event failed to be processed.
     * @param status Whether the event was processed successfully.
     * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing.
     */
    public ConversionApiResponseEventsItems(
        String errorMessage, 
        EventProcessingStatus status, 
        String warningMessage
    ) {
        this.errorMessage = errorMessage;
        this.status = status;
        this.warningMessage = warningMessage;
    }



    /**
     * Error message containing more information about why the event failed to be processed.
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Whether the event was processed successfully.
     * @return status
     */
    public EventProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(EventProcessingStatus status) {
        this.status = status;
    }

    /**
     * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
     * @return warningMessage
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionApiResponseEventsItems {\n");
        
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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

