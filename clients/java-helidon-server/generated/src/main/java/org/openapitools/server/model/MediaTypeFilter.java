package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MediaTypeFilter   {

    private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

    /**
     * Default constructor.
     */
    public MediaTypeFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create MediaTypeFilter.
     *
     * @param MEDIA_TYPE MEDIA_TYPE
     */
    public MediaTypeFilter(
        CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE
    ) {
        this.MEDIA_TYPE = MEDIA_TYPE;
    }



    /**
     * Get MEDIA_TYPE
     * @return MEDIA_TYPE
     */
    public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
        return MEDIA_TYPE;
    }

    public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
        this.MEDIA_TYPE = MEDIA_TYPE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaTypeFilter {\n");
        
        sb.append("    MEDIA_TYPE: ").append(toIndentedString(MEDIA_TYPE)).append("\n");
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

