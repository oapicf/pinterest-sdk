package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupUint32Criteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomNumber2Filter   {

    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;

    /**
     * Default constructor.
     */
    public CustomNumber2Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomNumber2Filter.
     *
     * @param CUSTOM_NUMBER_2 CUSTOM_NUMBER_2
     */
    public CustomNumber2Filter(
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2
    ) {
        this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    }



    /**
     * Get CUSTOM_NUMBER_2
     * @return CUSTOM_NUMBER_2
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
        return CUSTOM_NUMBER_2;
    }

    public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
        this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomNumber2Filter {\n");
        
        sb.append("    CUSTOM_NUMBER_2: ").append(toIndentedString(CUSTOM_NUMBER_2)).append("\n");
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

