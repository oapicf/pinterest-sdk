package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreativeAssetsIdFilter   {

    private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

    /**
     * Default constructor.
     */
    public CreativeAssetsIdFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CreativeAssetsIdFilter.
     *
     * @param CREATIVE_ASSETS_ID CREATIVE_ASSETS_ID
     */
    public CreativeAssetsIdFilter(
        CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID
    ) {
        this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    }



    /**
     * Get CREATIVE_ASSETS_ID
     * @return CREATIVE_ASSETS_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID() {
        return CREATIVE_ASSETS_ID;
    }

    public void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
        this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreativeAssetsIdFilter {\n");
        
        sb.append("    CREATIVE_ASSETS_ID: ").append(toIndentedString(CREATIVE_ASSETS_ID)).append("\n");
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

