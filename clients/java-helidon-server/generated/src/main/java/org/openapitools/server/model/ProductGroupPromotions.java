package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ProductGroupPromotionResponseItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Wrapper model for ProductGroupPromotion.
 */
public class ProductGroupPromotions   {

    private List<@Valid ProductGroupPromotionResponseItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProductGroupPromotions() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductGroupPromotions.
     *
     * @param items Response-only: created or updated product group promotions, or exceptions.
     */
    public ProductGroupPromotions(
        List<@Valid ProductGroupPromotionResponseItem> items
    ) {
        this.items = items;
    }



    /**
     * Response-only: created or updated product group promotions, or exceptions.
     * @return items
     */
    public List<@Valid ProductGroupPromotionResponseItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid ProductGroupPromotionResponseItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupPromotions {\n");
        
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

