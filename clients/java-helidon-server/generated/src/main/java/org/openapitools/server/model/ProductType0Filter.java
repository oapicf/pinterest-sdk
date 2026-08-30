package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductType0Filter   {

    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;

    /**
     * Default constructor.
     */
    public ProductType0Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductType0Filter.
     *
     * @param PRODUCT_TYPE_0 PRODUCT_TYPE_0
     */
    public ProductType0Filter(
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0
    ) {
        this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    }



    /**
     * Get PRODUCT_TYPE_0
     * @return PRODUCT_TYPE_0
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
        return PRODUCT_TYPE_0;
    }

    public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
        this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductType0Filter {\n");
        
        sb.append("    PRODUCT_TYPE_0: ").append(toIndentedString(PRODUCT_TYPE_0)).append("\n");
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

