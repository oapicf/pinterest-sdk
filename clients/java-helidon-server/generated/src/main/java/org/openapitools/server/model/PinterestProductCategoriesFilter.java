package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PinterestProductCategoriesFilter   {

    private CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

    /**
     * Default constructor.
     */
    public PinterestProductCategoriesFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create PinterestProductCategoriesFilter.
     *
     * @param PINTEREST_PRODUCT_CATEGORIES PINTEREST_PRODUCT_CATEGORIES
     */
    public PinterestProductCategoriesFilter(
        CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES
    ) {
        this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    }



    /**
     * Get PINTEREST_PRODUCT_CATEGORIES
     * @return PINTEREST_PRODUCT_CATEGORIES
     */
    public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
        return PINTEREST_PRODUCT_CATEGORIES;
    }

    public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
        this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinterestProductCategoriesFilter {\n");
        
        sb.append("    PINTEREST_PRODUCT_CATEGORIES: ").append(toIndentedString(PINTEREST_PRODUCT_CATEGORIES)).append("\n");
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

