package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ProductGroupPromotion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ProductGroupPromotionCreateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductGroupPromotionCreateRequest   {
  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("product_group_promotion")
  
  private List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

  public ProductGroupPromotionCreateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * ID of the Ad Group the Product Group Promotion belongs to.
   * @return adGroupId
  **/
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the Ad Group the Product Group Promotion belongs to.")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionCreateRequest productGroupPromotion(List<ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  public ProductGroupPromotionCreateRequest addProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
    if (this.productGroupPromotion == null) {
      this.productGroupPromotion = new ArrayList<>();
    }
    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

   /**
   * Get productGroupPromotion
   * @return productGroupPromotion
  **/
  @ApiModelProperty(required = true, value = "")
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
    ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest = (ProductGroupPromotionCreateRequest) o;
    return Objects.equals(this.adGroupId, productGroupPromotionCreateRequest.adGroupId) &&
        Objects.equals(this.productGroupPromotion, productGroupPromotionCreateRequest.productGroupPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, productGroupPromotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionCreateRequest {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

