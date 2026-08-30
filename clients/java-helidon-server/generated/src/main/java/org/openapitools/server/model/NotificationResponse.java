package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class NotificationResponse   {

    private String errorMsg;
    private Integer receivedAt;
    private Boolean success;

    /**
     * Default constructor.
     */
    public NotificationResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create NotificationResponse.
     *
     * @param errorMsg error message when success is false
     * @param receivedAt Received time. Unix timestamp in seconds.
     * @param success Returns true if the notification accepted.
     */
    public NotificationResponse(
        String errorMsg, 
        Integer receivedAt, 
        Boolean success
    ) {
        this.errorMsg = errorMsg;
        this.receivedAt = receivedAt;
        this.success = success;
    }



    /**
     * error message when success is false
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Received time. Unix timestamp in seconds.
     * @return receivedAt
     */
    public Integer getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Integer receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Returns true if the notification accepted.
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
        sb.append("class NotificationResponse {\n");
        
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
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

