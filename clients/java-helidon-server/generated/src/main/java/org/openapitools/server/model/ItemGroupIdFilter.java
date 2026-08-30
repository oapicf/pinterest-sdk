package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemGroupIdFilter   {

    private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

    /**
     * Default constructor.
     */
    public ItemGroupIdFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemGroupIdFilter.
     *
     * @param ITEM_GROUP_ID ITEM_GROUP_ID
     */
    public ItemGroupIdFilter(
        CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID
    ) {
        this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    }



    /**
     * Get ITEM_GROUP_ID
     * @return ITEM_GROUP_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
        return ITEM_GROUP_ID;
    }

    public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
        this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemGroupIdFilter {\n");
        
        sb.append("    ITEM_GROUP_ID: ").append(toIndentedString(ITEM_GROUP_ID)).append("\n");
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

