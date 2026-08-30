package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CampaignPlanningResponseErrorCode;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Error encountered while estimating delivery for a campaign.
 */
public class CampaignPlanningResponseError   {

    private CampaignPlanningResponseErrorCode code;
    private String message;

    /**
     * Default constructor.
     */
    public CampaignPlanningResponseError() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningResponseError.
     *
     * @param code code
     * @param message Human-readable error message.
     */
    public CampaignPlanningResponseError(
        CampaignPlanningResponseErrorCode code, 
        String message
    ) {
        this.code = code;
        this.message = message;
    }



    /**
     * Get code
     * @return code
     */
    public CampaignPlanningResponseErrorCode getCode() {
        return code;
    }

    public void setCode(CampaignPlanningResponseErrorCode code) {
        this.code = code;
    }

    /**
     * Human-readable error message.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningResponseError {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

