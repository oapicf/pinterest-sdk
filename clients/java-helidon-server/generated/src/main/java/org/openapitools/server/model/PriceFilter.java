package org.openapitools.server.model;

import org.openapitools.server.model.PriceFilterPrice;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PriceFilter   {

    private PriceFilterPrice PRICE;

    /**
     * Default constructor.
     */
    public PriceFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceFilter.
     *
     * @param PRICE PRICE
     */
    public PriceFilter(
        PriceFilterPrice PRICE
    ) {
        this.PRICE = PRICE;
    }



    /**
     * Get PRICE
     * @return PRICE
     */
    public PriceFilterPrice getPRICE() {
        return PRICE;
    }

    public void setPRICE(PriceFilterPrice PRICE) {
        this.PRICE = PRICE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceFilter {\n");
        
        sb.append("    PRICE: ").append(toIndentedString(PRICE)).append("\n");
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

