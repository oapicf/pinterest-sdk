package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroupPromotionCreateRequest  {
  
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the Ad Group the Product Group Promotion belongs to.")
 /**
   * ID of the Ad Group the Product Group Promotion belongs to.
  **/
  private String adGroupId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid ProductGroupPromotion> productGroupPromotion = new ArrayList<>();
 /**
   * ID of the Ad Group the Product Group Promotion belongs to.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  @NotNull
 @Pattern(regexp="^(AG)?\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionCreateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * Get productGroupPromotion
   * @return productGroupPromotion
  **/
  @JsonProperty("product_group_promotion")
  @NotNull
  public List<@Valid ProductGroupPromotion> getProductGroupPromotion() {
    return productGroupPromotion;
  }

  public void setProductGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
  }

  public ProductGroupPromotionCreateRequest productGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  public ProductGroupPromotionCreateRequest addProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

