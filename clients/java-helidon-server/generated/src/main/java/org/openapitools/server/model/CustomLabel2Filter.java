package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomLabel2Filter   {

    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;

    /**
     * Default constructor.
     */
    public CustomLabel2Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomLabel2Filter.
     *
     * @param CUSTOM_LABEL_2 CUSTOM_LABEL_2
     */
    public CustomLabel2Filter(
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2
    ) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    }



    /**
     * Get CUSTOM_LABEL_2
     * @return CUSTOM_LABEL_2
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
        return CUSTOM_LABEL_2;
    }

    public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLabel2Filter {\n");
        
        sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
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

