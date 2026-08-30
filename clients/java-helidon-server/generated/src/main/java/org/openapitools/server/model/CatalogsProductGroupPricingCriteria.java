package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsProductGroupPricingCriteria   {

    private Boolean inclusion = true;
    private Boolean negated;
    private BigDecimal values;

    /**
     * Default constructor.
     */
    public CatalogsProductGroupPricingCriteria() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupPricingCriteria.
     *
     * @param inclusion inclusion
     * @param negated negated
     * @param values values
     */
    public CatalogsProductGroupPricingCriteria(
        Boolean inclusion, 
        Boolean negated, 
        BigDecimal values
    ) {
        this.inclusion = inclusion;
        this.negated = negated;
        this.values = values;
    }



    /**
     * Get inclusion
     * @return inclusion
     */
    public Boolean getInclusion() {
        return inclusion;
    }

    public void setInclusion(Boolean inclusion) {
        this.inclusion = inclusion;
    }

    /**
     * Get negated
     * @return negated
     */
    public Boolean getNegated() {
        return negated;
    }

    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * Get values
     * minimum: 0
     * @return values
     */
    public BigDecimal getValues() {
        return values;
    }

    public void setValues(BigDecimal values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupPricingCriteria {\n");
        
        sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
        sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

