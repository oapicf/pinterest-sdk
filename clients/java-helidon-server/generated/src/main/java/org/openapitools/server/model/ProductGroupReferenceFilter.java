package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductGroupReferenceFilter   {

    private CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP;

    /**
     * Default constructor.
     */
    public ProductGroupReferenceFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductGroupReferenceFilter.
     *
     * @param PRODUCT_GROUP PRODUCT_GROUP
     */
    public ProductGroupReferenceFilter(
        CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP
    ) {
        this.PRODUCT_GROUP = PRODUCT_GROUP;
    }



    /**
     * Get PRODUCT_GROUP
     * @return PRODUCT_GROUP
     */
    public CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP() {
        return PRODUCT_GROUP;
    }

    public void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
        this.PRODUCT_GROUP = PRODUCT_GROUP;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupReferenceFilter {\n");
        
        sb.append("    PRODUCT_GROUP: ").append(toIndentedString(PRODUCT_GROUP)).append("\n");
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

