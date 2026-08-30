package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupPricingCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MinPriceFilter   {

    private CatalogsProductGroupPricingCriteria MIN_PRICE;

    /**
     * Default constructor.
     */
    public MinPriceFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create MinPriceFilter.
     *
     * @param MIN_PRICE MIN_PRICE
     */
    public MinPriceFilter(
        CatalogsProductGroupPricingCriteria MIN_PRICE
    ) {
        this.MIN_PRICE = MIN_PRICE;
    }



    /**
     * Get MIN_PRICE
     * @return MIN_PRICE
     */
    public CatalogsProductGroupPricingCriteria getMINPRICE() {
        return MIN_PRICE;
    }

    public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
        this.MIN_PRICE = MIN_PRICE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MinPriceFilter {\n");
        
        sb.append("    MIN_PRICE: ").append(toIndentedString(MIN_PRICE)).append("\n");
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

