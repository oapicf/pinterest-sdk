package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotionCreateRequestElement;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProductGroupPromotionCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductGroupPromotionCreateRequest   {
  private String adGroupId;
  private @Valid List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion = new ArrayList<>();

  /**
   * ID of the Ad Group the Product Group Promotion belongs to.
   **/
  public ProductGroupPromotionCreateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the Ad Group the Product Group Promotion belongs to.")
  @JsonProperty("ad_group_id")
  @NotNull  @Pattern(regexp="^(AG)?\\d+$")public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   **/
  public ProductGroupPromotionCreateRequest productGroupPromotion(List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("product_group_promotion")
  @NotNull @Valid public List<@Valid ProductGroupPromotionCreateRequestElement> getProductGroupPromotion() {
    return productGroupPromotion;
  }

  @JsonProperty("product_group_promotion")
  public void setProductGroupPromotion(List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
  }

  public ProductGroupPromotionCreateRequest addProductGroupPromotionItem(ProductGroupPromotionCreateRequestElement productGroupPromotionItem) {
    if (this.productGroupPromotion == null) {
      this.productGroupPromotion = new ArrayList<>();
    }

    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

  public ProductGroupPromotionCreateRequest removeProductGroupPromotionItem(ProductGroupPromotionCreateRequestElement productGroupPromotionItem) {
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

