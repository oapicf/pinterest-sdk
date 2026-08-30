package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ProductGroupPromotion;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class ProductGroupPromotionsUpdateWithRequiredBody   {

    private String adGroupId;
    private List<@Valid ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProductGroupPromotionsUpdateWithRequiredBody() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductGroupPromotionsUpdateWithRequiredBody.
     *
     * @param adGroupId ID of the ad group the product group promotion belongs to.
     * @param productGroupPromotion List of product group promotions to create or update.
     */
    public ProductGroupPromotionsUpdateWithRequiredBody(
        String adGroupId, 
        List<@Valid ProductGroupPromotion> productGroupPromotion
    ) {
        this.adGroupId = adGroupId;
        this.productGroupPromotion = productGroupPromotion;
    }



    /**
     * ID of the ad group the product group promotion belongs to.
     * @return adGroupId
     */
    public String getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(String adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * List of product group promotions to create or update.
     * @return productGroupPromotion
     */
    public List<@Valid ProductGroupPromotion> getProductGroupPromotion() {
        return productGroupPromotion;
    }

    public void setProductGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
        this.productGroupPromotion = productGroupPromotion;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupPromotionsUpdateWithRequiredBody {\n");
        
        sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
        sb.append("    productGroupPromotion: ").append(toIndentedString(productGroupPromotion)).append("\n");
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

