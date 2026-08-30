package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductType2Filter   {

    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;

    /**
     * Default constructor.
     */
    public ProductType2Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductType2Filter.
     *
     * @param PRODUCT_TYPE_2 PRODUCT_TYPE_2
     */
    public ProductType2Filter(
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2
    ) {
        this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    }



    /**
     * Get PRODUCT_TYPE_2
     * @return PRODUCT_TYPE_2
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
        return PRODUCT_TYPE_2;
    }

    public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
        this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductType2Filter {\n");
        
        sb.append("    PRODUCT_TYPE_2: ").append(toIndentedString(PRODUCT_TYPE_2)).append("\n");
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

