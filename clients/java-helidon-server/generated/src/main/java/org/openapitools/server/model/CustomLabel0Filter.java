package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomLabel0Filter   {

    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;

    /**
     * Default constructor.
     */
    public CustomLabel0Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomLabel0Filter.
     *
     * @param CUSTOM_LABEL_0 CUSTOM_LABEL_0
     */
    public CustomLabel0Filter(
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0
    ) {
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    }



    /**
     * Get CUSTOM_LABEL_0
     * @return CUSTOM_LABEL_0
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
        return CUSTOM_LABEL_0;
    }

    public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLabel0Filter {\n");
        
        sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
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

