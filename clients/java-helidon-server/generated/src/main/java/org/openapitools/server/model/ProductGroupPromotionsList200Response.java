package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ProductGroupPromotion;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductGroupPromotionsList200Response   {

    private String bookmark;
    private List<@Valid ProductGroupPromotion> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProductGroupPromotionsList200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductGroupPromotionsList200Response.
     *
     * @param bookmark bookmark
     * @param items items
     */
    public ProductGroupPromotionsList200Response(
        String bookmark, 
        List<@Valid ProductGroupPromotion> items
    ) {
        this.bookmark = bookmark;
        this.items = items;
    }



    /**
     * Get bookmark
     * @return bookmark
     */
    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    /**
     * Get items
     * @return items
     */
    public List<@Valid ProductGroupPromotion> getItems() {
        return items;
    }

    public void setItems(List<@Valid ProductGroupPromotion> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupPromotionsList200Response {\n");
        
        sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

