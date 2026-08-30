package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupUint32Criteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomNumber1Filter   {

    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;

    /**
     * Default constructor.
     */
    public CustomNumber1Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomNumber1Filter.
     *
     * @param CUSTOM_NUMBER_1 CUSTOM_NUMBER_1
     */
    public CustomNumber1Filter(
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1
    ) {
        this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    }



    /**
     * Get CUSTOM_NUMBER_1
     * @return CUSTOM_NUMBER_1
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
        return CUSTOM_NUMBER_1;
    }

    public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
        this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomNumber1Filter {\n");
        
        sb.append("    CUSTOM_NUMBER_1: ").append(toIndentedString(CUSTOM_NUMBER_1)).append("\n");
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

