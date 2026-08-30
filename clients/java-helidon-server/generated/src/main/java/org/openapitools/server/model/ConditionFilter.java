package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConditionFilter   {

    private CatalogsProductGroupMultipleStringCriteria CONDITION;

    /**
     * Default constructor.
     */
    public ConditionFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create ConditionFilter.
     *
     * @param CONDITION CONDITION
     */
    public ConditionFilter(
        CatalogsProductGroupMultipleStringCriteria CONDITION
    ) {
        this.CONDITION = CONDITION;
    }



    /**
     * Get CONDITION
     * @return CONDITION
     */
    public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
        return CONDITION;
    }

    public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
        this.CONDITION = CONDITION;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionFilter {\n");
        
        sb.append("    CONDITION: ").append(toIndentedString(CONDITION)).append("\n");
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

