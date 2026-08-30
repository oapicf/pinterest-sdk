package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotion;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@ApiModel(description="Resource create or update operation model with required body fields (no OptionalProperties).")

public class ProductGroupPromotionsUpdateWithRequiredBody  {
  
 /**
  * ID of the ad group the product group promotion belongs to.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the ad group the product group promotion belongs to.")

  private String adGroupId;

 /**
  * List of product group promotions to create or update.
  */
  @ApiModelProperty(example = "[{\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to create\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\",\"is_mdl\":true},{\"id\":\"2680059592705\",\"catalog_product_group_id\":\"1234123\",\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to update\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\"}]", required = true, value = "List of product group promotions to create or update.")

  private List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>();
 /**
   * ID of the ad group the product group promotion belongs to.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * List of product group promotions to create or update.
   * @return productGroupPromotion
  **/
  @JsonProperty("product_group_promotion")
  public List<ProductGroupPromotion> getProductGroupPromotion() {
    return productGroupPromotion;
  }

  public void setProductGroupPromotion(List<ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotion(List<ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody addProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody = (ProductGroupPromotionsUpdateWithRequiredBody) o;
    return Objects.equals(this.adGroupId, productGroupPromotionsUpdateWithRequiredBody.adGroupId) &&
        Objects.equals(this.productGroupPromotion, productGroupPromotionsUpdateWithRequiredBody.productGroupPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, productGroupPromotion);
  }

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

