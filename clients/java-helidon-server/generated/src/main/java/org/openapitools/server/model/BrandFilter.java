package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BrandFilter   {

    private CatalogsProductGroupMultipleStringCriteria BRAND;

    /**
     * Default constructor.
     */
    public BrandFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create BrandFilter.
     *
     * @param BRAND BRAND
     */
    public BrandFilter(
        CatalogsProductGroupMultipleStringCriteria BRAND
    ) {
        this.BRAND = BRAND;
    }



    /**
     * Get BRAND
     * @return BRAND
     */
    public CatalogsProductGroupMultipleStringCriteria getBRAND() {
        return BRAND;
    }

    public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
        this.BRAND = BRAND;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandFilter {\n");
        
        sb.append("    BRAND: ").append(toIndentedString(BRAND)).append("\n");
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

