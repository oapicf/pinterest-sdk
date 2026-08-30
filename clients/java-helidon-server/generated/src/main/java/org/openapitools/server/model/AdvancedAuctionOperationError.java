package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Error which occurred when applying a bid options operation to a specific item.
 */
public class AdvancedAuctionOperationError   {

    private Integer code;
    private String message;

    /**
     * Default constructor.
     */
    public AdvancedAuctionOperationError() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionOperationError.
     *
     * @param code The error code for the item bid option operation validation error
     * @param message Message describing the item bid option operation validation error
     */
    public AdvancedAuctionOperationError(
        Integer code, 
        String message
    ) {
        this.code = code;
        this.message = message;
    }



    /**
     * The error code for the item bid option operation validation error
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Message describing the item bid option operation validation error
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
        sb.append("class AdvancedAuctionOperationError {\n");
        
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

