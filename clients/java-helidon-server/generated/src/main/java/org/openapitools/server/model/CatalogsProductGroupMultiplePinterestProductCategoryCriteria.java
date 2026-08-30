package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ProductCategoryEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsProductGroupMultiplePinterestProductCategoryCriteria   {

    private Boolean negated;
    private List<ProductCategoryEnum> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsProductGroupMultiplePinterestProductCategoryCriteria() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupMultiplePinterestProductCategoryCriteria.
     *
     * @param negated negated
     * @param values values
     */
    public CatalogsProductGroupMultiplePinterestProductCategoryCriteria(
        Boolean negated, 
        List<ProductCategoryEnum> values
    ) {
        this.negated = negated;
        this.values = values;
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
     * @return values
     */
    public List<ProductCategoryEnum> getValues() {
        return values;
    }

    public void setValues(List<ProductCategoryEnum> values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupMultiplePinterestProductCategoryCriteria {\n");
        
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

