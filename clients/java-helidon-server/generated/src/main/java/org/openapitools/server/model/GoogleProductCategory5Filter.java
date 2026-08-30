package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GoogleProductCategory5Filter   {

    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

    /**
     * Default constructor.
     */
    public GoogleProductCategory5Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create GoogleProductCategory5Filter.
     *
     * @param GOOGLE_PRODUCT_CATEGORY_5 GOOGLE_PRODUCT_CATEGORY_5
     */
    public GoogleProductCategory5Filter(
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5
    ) {
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    }



    /**
     * Get GOOGLE_PRODUCT_CATEGORY_5
     * @return GOOGLE_PRODUCT_CATEGORY_5
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
        return GOOGLE_PRODUCT_CATEGORY_5;
    }

    public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoogleProductCategory5Filter {\n");
        
        sb.append("    GOOGLE_PRODUCT_CATEGORY_5: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_5)).append("\n");
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

