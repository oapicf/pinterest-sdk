package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotion;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "ProductGroupPromotionsCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupPromotionsCreate {

  private String adGroupId;

  private List<@Valid ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

  public ProductGroupPromotionsCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductGroupPromotionsCreate(String adGroupId, List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.adGroupId = adGroupId;
    this.productGroupPromotion = productGroupPromotion;
  }

  public ProductGroupPromotionsCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group the product group promotion belongs to.
   * @return adGroupId
   */
  @NotNull @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", example = "2680059592705", description = "ID of the ad group the product group promotion belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionsCreate productGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  public ProductGroupPromotionsCreate addProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
    if (this.productGroupPromotion == null) {
      this.productGroupPromotion = new ArrayList<>();
    }
    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

  /**
   * List of product group promotions to create or update.
   * @return productGroupPromotion
   */
  @NotNull @Valid 
  @Schema(name = "product_group_promotion", example = "[{\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to create\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\",\"is_mdl\":true},{\"id\":\"2680059592705\",\"catalog_product_group_id\":\"1234123\",\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to update\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\"}]", description = "List of product group promotions to create or update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_group_promotion")
  public List<@Valid ProductGroupPromotion> getProductGroupPromotion() {
    return productGroupPromotion;
  }

  @JsonProperty("product_group_promotion")
  public void setProductGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupPromotionsCreate productGroupPromotionsCreate = (ProductGroupPromotionsCreate) o;
    return Objects.equals(this.adGroupId, productGroupPromotionsCreate.adGroupId) &&
        Objects.equals(this.productGroupPromotion, productGroupPromotionsCreate.productGroupPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, productGroupPromotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionsCreate {\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    productGroupPromotion: ").append(toIndentedString(productGroupPromotion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

