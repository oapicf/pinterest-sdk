package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemIdFilter   {

    private CatalogsProductGroupMultipleStringCriteria ITEM_ID;

    /**
     * Default constructor.
     */
    public ItemIdFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemIdFilter.
     *
     * @param ITEM_ID ITEM_ID
     */
    public ItemIdFilter(
        CatalogsProductGroupMultipleStringCriteria ITEM_ID
    ) {
        this.ITEM_ID = ITEM_ID;
    }



    /**
     * Get ITEM_ID
     * @return ITEM_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getITEMID() {
        return ITEM_ID;
    }

    public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemIdFilter {\n");
        
        sb.append("    ITEM_ID: ").append(toIndentedString(ITEM_ID)).append("\n");
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

