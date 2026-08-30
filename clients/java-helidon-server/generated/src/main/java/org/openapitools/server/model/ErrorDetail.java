package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ErrorDetail   {

    private Integer count;
    private Integer errorCode;
    private String message;

    /**
     * Default constructor.
     */
    public ErrorDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ErrorDetail.
     *
     * @param count Number of records with this error
     * @param errorCode Numeric error code
     * @param message Error message description
     */
    public ErrorDetail(
        Integer count, 
        Integer errorCode, 
        String message
    ) {
        this.count = count;
        this.errorCode = errorCode;
        this.message = message;
    }



    /**
     * Number of records with this error
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Numeric error code
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Error message description
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
        sb.append("class ErrorDetail {\n");
        
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

