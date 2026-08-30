package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GoogleProductCategory3Filter   {

    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

    /**
     * Default constructor.
     */
    public GoogleProductCategory3Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create GoogleProductCategory3Filter.
     *
     * @param GOOGLE_PRODUCT_CATEGORY_3 GOOGLE_PRODUCT_CATEGORY_3
     */
    public GoogleProductCategory3Filter(
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3
    ) {
        this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    }



    /**
     * Get GOOGLE_PRODUCT_CATEGORY_3
     * @return GOOGLE_PRODUCT_CATEGORY_3
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
        return GOOGLE_PRODUCT_CATEGORY_3;
    }

    public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
        this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoogleProductCategory3Filter {\n");
        
        sb.append("    GOOGLE_PRODUCT_CATEGORY_3: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_3)).append("\n");
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

