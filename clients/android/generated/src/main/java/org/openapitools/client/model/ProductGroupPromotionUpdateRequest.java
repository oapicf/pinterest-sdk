/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ProductGroupPromotion;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProductGroupPromotionUpdateRequest {
  
  @SerializedName("ad_group_id")
  private String adGroupId = null;
  @SerializedName("product_group_promotion")
  private List<ProductGroupPromotion> productGroupPromotion = null;

  /**
   * ID of the ad group the product group belongs to.
   **/
  @ApiModelProperty(required = true, value = "ID of the ad group the product group belongs to.")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
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
    ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest = (ProductGroupPromotionUpdateRequest) o;
    return (this.adGroupId == null ? productGroupPromotionUpdateRequest.adGroupId == null : this.adGroupId.equals(productGroupPromotionUpdateRequest.adGroupId)) &&
        (this.productGroupPromotion == null ? productGroupPromotionUpdateRequest.productGroupPromotion == null : this.productGroupPromotion.equals(productGroupPromotionUpdateRequest.productGroupPromotion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.adGroupId == null ? 0: this.adGroupId.hashCode());
    result = 31 * result + (this.productGroupPromotion == null ? 0: this.productGroupPromotion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionUpdateRequest {\n");
    
    sb.append("  adGroupId: ").append(adGroupId).append("\n");
    sb.append("  productGroupPromotion: ").append(productGroupPromotion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
