package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GoogleProductCategory4Filter   {

    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

    /**
     * Default constructor.
     */
    public GoogleProductCategory4Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create GoogleProductCategory4Filter.
     *
     * @param GOOGLE_PRODUCT_CATEGORY_4 GOOGLE_PRODUCT_CATEGORY_4
     */
    public GoogleProductCategory4Filter(
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4
    ) {
        this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    }



    /**
     * Get GOOGLE_PRODUCT_CATEGORY_4
     * @return GOOGLE_PRODUCT_CATEGORY_4
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
        return GOOGLE_PRODUCT_CATEGORY_4;
    }

    public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
        this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoogleProductCategory4Filter {\n");
        
        sb.append("    GOOGLE_PRODUCT_CATEGORY_4: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_4)).append("\n");
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

