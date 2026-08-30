package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.IneligibleProductTagReason;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Error item for a product tag that failed eligibility check.
 */
public class IneligibleProductTagErrorItem   {

    private IneligibleProductTagReason errorMessage;
    private String pinId;

    /**
     * Default constructor.
     */
    public IneligibleProductTagErrorItem() {
    // JSON-B / Jackson
    }

    /**
     * Create IneligibleProductTagErrorItem.
     *
     * @param errorMessage Reason why the pin is ineligible for tagging.
     * @param pinId Pin ID that failed eligibility check.
     */
    public IneligibleProductTagErrorItem(
        IneligibleProductTagReason errorMessage, 
        String pinId
    ) {
        this.errorMessage = errorMessage;
        this.pinId = pinId;
    }



    /**
     * Reason why the pin is ineligible for tagging.
     * @return errorMessage
     */
    public IneligibleProductTagReason getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(IneligibleProductTagReason errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Pin ID that failed eligibility check.
     * @return pinId
     */
    public String getPinId() {
        return pinId;
    }

    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IneligibleProductTagErrorItem {\n");
        
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

