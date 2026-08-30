package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CartingRetailer   {

    private String retailerId;
    private String retailerName;

    /**
     * Default constructor.
     */
    public CartingRetailer() {
    // JSON-B / Jackson
    }

    /**
     * Create CartingRetailer.
     *
     * @param retailerId Unique identifier for the retailer
     * @param retailerName Name of the retailer
     */
    public CartingRetailer(
        String retailerId, 
        String retailerName
    ) {
        this.retailerId = retailerId;
        this.retailerName = retailerName;
    }



    /**
     * Unique identifier for the retailer
     * @return retailerId
     */
    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    /**
     * Name of the retailer
     * @return retailerName
     */
    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CartingRetailer {\n");
        
        sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
        sb.append("    retailerName: ").append(toIndentedString(retailerName)).append("\n");
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

