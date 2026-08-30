package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupPricingCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MaxPriceFilter   {

    private CatalogsProductGroupPricingCriteria MAX_PRICE;

    /**
     * Default constructor.
     */
    public MaxPriceFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create MaxPriceFilter.
     *
     * @param MAX_PRICE MAX_PRICE
     */
    public MaxPriceFilter(
        CatalogsProductGroupPricingCriteria MAX_PRICE
    ) {
        this.MAX_PRICE = MAX_PRICE;
    }



    /**
     * Get MAX_PRICE
     * @return MAX_PRICE
     */
    public CatalogsProductGroupPricingCriteria getMAXPRICE() {
        return MAX_PRICE;
    }

    public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
        this.MAX_PRICE = MAX_PRICE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaxPriceFilter {\n");
        
        sb.append("    MAX_PRICE: ").append(toIndentedString(MAX_PRICE)).append("\n");
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

