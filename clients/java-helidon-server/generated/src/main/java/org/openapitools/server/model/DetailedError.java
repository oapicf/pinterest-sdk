package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Used for including extra details to a base error
 */
public class DetailedError   {

    private Integer code;
    private Object details;
    private String message;

    /**
     * Default constructor.
     */
    public DetailedError() {
    // JSON-B / Jackson
    }

    /**
     * Create DetailedError.
     *
     * @param code code
     * @param details details
     * @param message message
     */
    public DetailedError(
        Integer code, 
        Object details, 
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
     * Get details
     * @return details
     */
    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
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
        sb.append("class DetailedError {\n");
        
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

