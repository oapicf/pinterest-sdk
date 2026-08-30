package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class InnerProductCategoriesMetricsHighlights   {

    private BigDecimal pctChangeMom;

    /**
     * Default constructor.
     */
    public InnerProductCategoriesMetricsHighlights() {
    // JSON-B / Jackson
    }

    /**
     * Create InnerProductCategoriesMetricsHighlights.
     *
     * @param pctChangeMom Month-over-month percentage change
     */
    public InnerProductCategoriesMetricsHighlights(
        BigDecimal pctChangeMom
    ) {
        this.pctChangeMom = pctChangeMom;
    }



    /**
     * Month-over-month percentage change
     * @return pctChangeMom
     */
    public BigDecimal getPctChangeMom() {
        return pctChangeMom;
    }

    public void setPctChangeMom(BigDecimal pctChangeMom) {
        this.pctChangeMom = pctChangeMom;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnerProductCategoriesMetricsHighlights {\n");
        
        sb.append("    pctChangeMom: ").append(toIndentedString(pctChangeMom)).append("\n");
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

