package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GoogleProductCategory0Filter   {

    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;

    /**
     * Default constructor.
     */
    public GoogleProductCategory0Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create GoogleProductCategory0Filter.
     *
     * @param GOOGLE_PRODUCT_CATEGORY_0 GOOGLE_PRODUCT_CATEGORY_0
     */
    public GoogleProductCategory0Filter(
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0
    ) {
        this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    }



    /**
     * Get GOOGLE_PRODUCT_CATEGORY_0
     * @return GOOGLE_PRODUCT_CATEGORY_0
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
        return GOOGLE_PRODUCT_CATEGORY_0;
    }

    public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
        this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoogleProductCategory0Filter {\n");
        
        sb.append("    GOOGLE_PRODUCT_CATEGORY_0: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_0)).append("\n");
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

