package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomLabel1Filter   {

    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;

    /**
     * Default constructor.
     */
    public CustomLabel1Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomLabel1Filter.
     *
     * @param CUSTOM_LABEL_1 CUSTOM_LABEL_1
     */
    public CustomLabel1Filter(
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1
    ) {
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    }



    /**
     * Get CUSTOM_LABEL_1
     * @return CUSTOM_LABEL_1
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
        return CUSTOM_LABEL_1;
    }

    public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLabel1Filter {\n");
        
        sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
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

