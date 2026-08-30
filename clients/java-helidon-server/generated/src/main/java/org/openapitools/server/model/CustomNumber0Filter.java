package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupUint32Criteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomNumber0Filter   {

    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;

    /**
     * Default constructor.
     */
    public CustomNumber0Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomNumber0Filter.
     *
     * @param CUSTOM_NUMBER_0 CUSTOM_NUMBER_0
     */
    public CustomNumber0Filter(
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0
    ) {
        this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    }



    /**
     * Get CUSTOM_NUMBER_0
     * @return CUSTOM_NUMBER_0
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
        return CUSTOM_NUMBER_0;
    }

    public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
        this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomNumber0Filter {\n");
        
        sb.append("    CUSTOM_NUMBER_0: ").append(toIndentedString(CUSTOM_NUMBER_0)).append("\n");
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

