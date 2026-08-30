/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotion;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupPromotionsCreate   {
  
  private String adGroupId;
  private List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

  /**
   * ID of the ad group the product group promotion belongs to.
   */
  public ProductGroupPromotionsCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the ad group the product group promotion belongs to.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * List of product group promotions to create or update.
   */
  public ProductGroupPromotionsCreate productGroupPromotion(List<ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to create\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\",\"is_mdl\":true},{\"id\":\"2680059592705\",\"catalog_product_group_id\":\"1234123\",\"slideshow_collections_description\":\"Description\",\"creative_type\":\"REGULAR\",\"collections_hero_pin_id\":\"123123\",\"catalog_product_group_name\":\"catalogProductGroupName to update\",\"collections_hero_destination_url\":\"http://www.pinterest.com\",\"tracking_url\":\"https://www.pinterest.com\",\"slideshow_collections_title\":\"Title\",\"status\":\"ACTIVE\"}]", required = true, value = "List of product group promotions to create or update.")
  @JsonProperty("product_group_promotion")
  public List<ProductGroupPromotion> getProductGroupPromotion() {
    return productGroupPromotion;
  }
  public void setProductGroupPromotion(List<ProductGroupPromotion> productGroupPromotion) {
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
    return Objects.equals(adGroupId, productGroupPromotionsCreate.adGroupId) &&
        Objects.equals(productGroupPromotion, productGroupPromotionsCreate.productGroupPromotion);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

