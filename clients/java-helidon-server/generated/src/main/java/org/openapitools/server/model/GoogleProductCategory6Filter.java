package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GoogleProductCategory6Filter   {

    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;

    /**
     * Default constructor.
     */
    public GoogleProductCategory6Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create GoogleProductCategory6Filter.
     *
     * @param GOOGLE_PRODUCT_CATEGORY_6 GOOGLE_PRODUCT_CATEGORY_6
     */
    public GoogleProductCategory6Filter(
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6
    ) {
        this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    }



    /**
     * Get GOOGLE_PRODUCT_CATEGORY_6
     * @return GOOGLE_PRODUCT_CATEGORY_6
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
        return GOOGLE_PRODUCT_CATEGORY_6;
    }

    public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
        this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoogleProductCategory6Filter {\n");
        
        sb.append("    GOOGLE_PRODUCT_CATEGORY_6: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_6)).append("\n");
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

