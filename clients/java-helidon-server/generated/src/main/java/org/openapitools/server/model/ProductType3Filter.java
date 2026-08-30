package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductType3Filter   {

    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;

    /**
     * Default constructor.
     */
    public ProductType3Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductType3Filter.
     *
     * @param PRODUCT_TYPE_3 PRODUCT_TYPE_3
     */
    public ProductType3Filter(
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3
    ) {
        this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    }



    /**
     * Get PRODUCT_TYPE_3
     * @return PRODUCT_TYPE_3
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
        return PRODUCT_TYPE_3;
    }

    public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
        this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductType3Filter {\n");
        
        sb.append("    PRODUCT_TYPE_3: ").append(toIndentedString(PRODUCT_TYPE_3)).append("\n");
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

