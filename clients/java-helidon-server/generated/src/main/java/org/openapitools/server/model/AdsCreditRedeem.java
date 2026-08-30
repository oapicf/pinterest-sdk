package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ads credit redemption
 */
public class AdsCreditRedeem   {

    private Integer errorCode;
    private String errorMessage;
    private Boolean success;

    /**
     * Default constructor.
     */
    public AdsCreditRedeem() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsCreditRedeem.
     *
     * @param errorCode Error code type if error occurs
     * @param errorMessage Reason for failure
     * @param success Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
     */
    public AdsCreditRedeem(
        Integer errorCode, 
        String errorMessage, 
        Boolean success
    ) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.success = success;
    }



    /**
     * Error code type if error occurs
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Reason for failure
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsCreditRedeem {\n");
        
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

