package org.openapitools.server.model;

import org.openapitools.server.model.IneligibleProductTagsErrorDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Error response for requests containing ineligible product tags.
 */
public class ProductTagsError   {

    private Integer code;
    private IneligibleProductTagsErrorDetails details;
    private String message;

    /**
     * Default constructor.
     */
    public ProductTagsError() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductTagsError.
     *
     * @param code code
     * @param details Details about which product tags failed eligibility check.
     * @param message message
     */
    public ProductTagsError(
        Integer code, 
        IneligibleProductTagsErrorDetails details, 
        String message
    ) {
        this.code = code;
        this.details = details;
        this.message = message;
    }



    /**
     * Get code
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Details about which product tags failed eligibility check.
     * @return details
     */
    public IneligibleProductTagsErrorDetails getDetails() {
        return details;
    }

    public void setDetails(IneligibleProductTagsErrorDetails details) {
        this.details = details;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTagsError {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

