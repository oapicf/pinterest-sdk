package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomLabel3Filter   {

    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;

    /**
     * Default constructor.
     */
    public CustomLabel3Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomLabel3Filter.
     *
     * @param CUSTOM_LABEL_3 CUSTOM_LABEL_3
     */
    public CustomLabel3Filter(
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3
    ) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    }



    /**
     * Get CUSTOM_LABEL_3
     * @return CUSTOM_LABEL_3
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
        return CUSTOM_LABEL_3;
    }

    public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLabel3Filter {\n");
        
        sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
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

