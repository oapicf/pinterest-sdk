package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupUint32Criteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomNumber3Filter   {

    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3;

    /**
     * Default constructor.
     */
    public CustomNumber3Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomNumber3Filter.
     *
     * @param CUSTOM_NUMBER_3 CUSTOM_NUMBER_3
     */
    public CustomNumber3Filter(
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3
    ) {
        this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    }



    /**
     * Get CUSTOM_NUMBER_3
     * @return CUSTOM_NUMBER_3
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
        return CUSTOM_NUMBER_3;
    }

    public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
        this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomNumber3Filter {\n");
        
        sb.append("    CUSTOM_NUMBER_3: ").append(toIndentedString(CUSTOM_NUMBER_3)).append("\n");
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

