package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupUint32Criteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomNumber4Filter   {

    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4;

    /**
     * Default constructor.
     */
    public CustomNumber4Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomNumber4Filter.
     *
     * @param CUSTOM_NUMBER_4 CUSTOM_NUMBER_4
     */
    public CustomNumber4Filter(
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4
    ) {
        this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
    }



    /**
     * Get CUSTOM_NUMBER_4
     * @return CUSTOM_NUMBER_4
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
        return CUSTOM_NUMBER_4;
    }

    public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
        this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomNumber4Filter {\n");
        
        sb.append("    CUSTOM_NUMBER_4: ").append(toIndentedString(CUSTOM_NUMBER_4)).append("\n");
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

