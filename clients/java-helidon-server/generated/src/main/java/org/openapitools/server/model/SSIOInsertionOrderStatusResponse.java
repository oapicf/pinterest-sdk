package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * SSIO insertion order status response for a single pin order id lookup.
 */
public class SSIOInsertionOrderStatusResponse   {

    private String creationTime;
    private String pinOrderId;
    private String status;

    /**
     * Default constructor.
     */
    public SSIOInsertionOrderStatusResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOInsertionOrderStatusResponse.
     *
     * @param creationTime Salesforce insertion order creation time
     * @param pinOrderId Salesforce order id
     * @param status Salesforce insertion order status
     */
    public SSIOInsertionOrderStatusResponse(
        String creationTime, 
        String pinOrderId, 
        String status
    ) {
        this.creationTime = creationTime;
        this.pinOrderId = pinOrderId;
        this.status = status;
    }



    /**
     * Salesforce insertion order creation time
     * @return creationTime
     */
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * Salesforce order id
     * @return pinOrderId
     */
    public String getPinOrderId() {
        return pinOrderId;
    }

    public void setPinOrderId(String pinOrderId) {
        this.pinOrderId = pinOrderId;
    }

    /**
     * Salesforce insertion order status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOInsertionOrderStatusResponse {\n");
        
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

