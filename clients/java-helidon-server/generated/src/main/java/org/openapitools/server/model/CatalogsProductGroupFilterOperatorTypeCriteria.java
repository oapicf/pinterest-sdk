package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FilterOperatorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsProductGroupFilterOperatorTypeCriteria   {

    private FilterOperatorType filterOperatorType;
    private Boolean negated;
    private List<String> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupFilterOperatorTypeCriteria.
     *
     * @param filterOperatorType filterOperatorType
     * @param negated negated
     * @param values values
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria(
        FilterOperatorType filterOperatorType, 
        Boolean negated, 
        List<String> values
    ) {
        this.filterOperatorType = filterOperatorType;
        this.negated = negated;
        this.values = values;
    }



    /**
     * Get filterOperatorType
     * @return filterOperatorType
     */
    public FilterOperatorType getFilterOperatorType() {
        return filterOperatorType;
    }

    public void setFilterOperatorType(FilterOperatorType filterOperatorType) {
        this.filterOperatorType = filterOperatorType;
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
        sb.append("class CatalogsProductGroupFilterOperatorTypeCriteria {\n");
        
        sb.append("    filterOperatorType: ").append(toIndentedString(filterOperatorType)).append("\n");
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

