package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PromotionArrayElement;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PromotionsResponse   {

    private List<@Valid PromotionArrayElement> promotions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PromotionsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create PromotionsResponse.
     *
     * @param promotions promotions
     */
    public PromotionsResponse(
        List<@Valid PromotionArrayElement> promotions
    ) {
        this.promotions = promotions;
    }



    /**
     * Get promotions
     * @return promotions
     */
    public List<@Valid PromotionArrayElement> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<@Valid PromotionArrayElement> promotions) {
        this.promotions = promotions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromotionsResponse {\n");
        
        sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
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

