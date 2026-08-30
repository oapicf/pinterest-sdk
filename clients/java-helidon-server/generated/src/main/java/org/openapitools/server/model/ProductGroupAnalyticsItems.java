package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductGroupAnalyticsItems   {

    private LocalDate DATE;
    private String PRODUCT_GROUP_ID;

    /**
     * Default constructor.
     */
    public ProductGroupAnalyticsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductGroupAnalyticsItems.
     *
     * @param DATE Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     * @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to.
     */
    public ProductGroupAnalyticsItems(
        LocalDate DATE, 
        String PRODUCT_GROUP_ID
    ) {
        this.DATE = DATE;
        this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    }



    /**
     * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
     * @return DATE
     */
    public LocalDate getDATE() {
        return DATE;
    }

    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }

    /**
     * The ID of the product group that this metrics belongs to.
     * @return PRODUCT_GROUP_ID
     */
    public String getPRODUCTGROUPID() {
        return PRODUCT_GROUP_ID;
    }

    public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
        this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupAnalyticsItems {\n");
        
        sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
        sb.append("    PRODUCT_GROUP_ID: ").append(toIndentedString(PRODUCT_GROUP_ID)).append("\n");
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

