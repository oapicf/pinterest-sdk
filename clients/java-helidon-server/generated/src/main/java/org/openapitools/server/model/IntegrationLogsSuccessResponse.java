package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Response when logs are successfully processed.
 */
public class IntegrationLogsSuccessResponse   {

    private String message;

    /**
     * Default constructor.
     */
    public IntegrationLogsSuccessResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLogsSuccessResponse.
     *
     * @param message message
     */
    public IntegrationLogsSuccessResponse(
        String message
    ) {
        this.message = message;
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
        sb.append("class IntegrationLogsSuccessResponse {\n");
        
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

