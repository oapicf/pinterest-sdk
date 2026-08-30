package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupCurrencyCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CurrencyFilter   {

    private CatalogsProductGroupCurrencyCriteria CURRENCY;

    /**
     * Default constructor.
     */
    public CurrencyFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CurrencyFilter.
     *
     * @param CURRENCY CURRENCY
     */
    public CurrencyFilter(
        CatalogsProductGroupCurrencyCriteria CURRENCY
    ) {
        this.CURRENCY = CURRENCY;
    }



    /**
     * Get CURRENCY
     * @return CURRENCY
     */
    public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyFilter {\n");
        
        sb.append("    CURRENCY: ").append(toIndentedString(CURRENCY)).append("\n");
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

