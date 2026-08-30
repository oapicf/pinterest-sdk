package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AmazonConnectResponse   {

    private String message;

    /**
     * Default constructor.
     */
    public AmazonConnectResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create AmazonConnectResponse.
     *
     * @param message Amazon connect response message
     */
    public AmazonConnectResponse(
        String message
    ) {
        this.message = message;
    }



    /**
     * Amazon connect response message
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
        sb.append("class AmazonConnectResponse {\n");
        
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

