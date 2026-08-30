package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 **/
@ApiModel(description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@JsonTypeName("ProductGroupPromotionsUpdateWithRequiredBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupPromotionsUpdateWithRequiredBody   {
  private String adGroupId;
  private @Valid List<@Valid ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

  public ProductGroupPromotionsUpdateWithRequiredBody() {
  }

  @JsonCreator
  public ProductGroupPromotionsUpdateWithRequiredBody(
    @JsonProperty(required = true, value = "ad_group_id") String adGroupId,
    @JsonProperty(required = true, value = "product_group_promotion") List<@Valid ProductGroupPromotion> productGroupPromotion
  ) {
    this.adGroupId = adGroupId;
    this.productGroupPromotion = productGroupPromotion;
  }

  /**
   * ID of the ad group the product group promotion belongs to.
   **/
  public ProductGroupPromotionsUpdateWithRequiredBody adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the ad group the product group promotion belongs to.")
  @JsonProperty(required = true, value = "ad_group_id")
  @NotNull  @Pattern(regexp="^(AG)?\\d+$")public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty(required = true, value = "ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * List of product group promotions to create or update.
   **/
  public ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to create\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\",\"is_mdl\":true},{\"id\":\"2680059592705\",\"catalog_product_group_id\":\"1234123\",\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to update\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\"}]", required = true, value = "List of product group promotions to create or update.")
  @JsonProperty(required = true, value = "product_group_promotion")
  @NotNull @Valid public List<@Valid ProductGroupPromotion> getProductGroupPromotion() {
    return productGroupPromotion;
  }

  @JsonProperty(required = true, value = "product_group_promotion")
  public void setProductGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody addProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
    if (this.productGroupPromotion == null) {
      this.productGroupPromotion = new ArrayList<>();
    }

    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody removeProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
    if (productGroupPromotionItem != null && this.productGroupPromotion != null) {
      this.productGroupPromotion.remove(productGroupPromotionItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
