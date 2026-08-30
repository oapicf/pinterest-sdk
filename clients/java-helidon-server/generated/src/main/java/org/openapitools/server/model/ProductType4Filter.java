package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductType4Filter   {

    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;

    /**
     * Default constructor.
     */
    public ProductType4Filter() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductType4Filter.
     *
     * @param PRODUCT_TYPE_4 PRODUCT_TYPE_4
     */
    public ProductType4Filter(
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4
    ) {
        this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    }



    /**
     * Get PRODUCT_TYPE_4
     * @return PRODUCT_TYPE_4
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
        return PRODUCT_TYPE_4;
    }

    public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
        this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductType4Filter {\n");
        
        sb.append("    PRODUCT_TYPE_4: ").append(toIndentedString(PRODUCT_TYPE_4)).append("\n");
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

