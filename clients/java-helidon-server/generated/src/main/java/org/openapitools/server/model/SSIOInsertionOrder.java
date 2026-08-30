package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An SSIO insertion order.
 */
public class SSIOInsertionOrder   {

    private String pinOrderId;

    /**
     * Default constructor.
     */
    public SSIOInsertionOrder() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOInsertionOrder.
     *
     * @param pinOrderId Salesforce order id
     */
    public SSIOInsertionOrder(
        String pinOrderId
    ) {
        this.pinOrderId = pinOrderId;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOInsertionOrder {\n");
        
        sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
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

