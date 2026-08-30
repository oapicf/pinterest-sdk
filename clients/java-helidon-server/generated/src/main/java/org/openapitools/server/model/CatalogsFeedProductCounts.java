package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The counts can be null early in the process.
 */
public class CatalogsFeedProductCounts   {

    private Integer ingested;
    private Integer original;

    /**
     * Default constructor.
     */
    public CatalogsFeedProductCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedProductCounts.
     *
     * @param ingested The number of products successfully ingested from the feed file.
     * @param original The number of products in the feed file.
     */
    public CatalogsFeedProductCounts(
        Integer ingested, 
        Integer original
    ) {
        this.ingested = ingested;
        this.original = original;
    }



    /**
     * The number of products successfully ingested from the feed file.
     * @return ingested
     */
    public Integer getIngested() {
        return ingested;
    }

    public void setIngested(Integer ingested) {
        this.ingested = ingested;
    }

    /**
     * The number of products in the feed file.
     * @return original
     */
    public Integer getOriginal() {
        return original;
    }

    public void setOriginal(Integer original) {
        this.original = original;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedProductCounts {\n");
        
        sb.append("    ingested: ").append(toIndentedString(ingested)).append("\n");
        sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

