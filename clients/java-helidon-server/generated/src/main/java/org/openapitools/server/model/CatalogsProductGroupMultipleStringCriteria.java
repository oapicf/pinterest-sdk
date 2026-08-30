package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsProductGroupMultipleStringCriteria   {

    private Boolean negated;
    private List<String> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsProductGroupMultipleStringCriteria() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupMultipleStringCriteria.
     *
     * @param negated negated
     * @param values values
     */
    public CatalogsProductGroupMultipleStringCriteria(
        Boolean negated, 
        List<String> values
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
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupMultipleStringCriteria {\n");
        
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

