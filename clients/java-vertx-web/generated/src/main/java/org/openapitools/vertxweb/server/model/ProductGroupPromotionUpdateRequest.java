package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ProductGroupPromotion;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductGroupPromotionUpdateRequest   {
  
  private String adGroupId;
  private List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

  public ProductGroupPromotionUpdateRequest () {

  }

  public ProductGroupPromotionUpdateRequest (String adGroupId, List<ProductGroupPromotion> productGroupPromotion) {
    this.adGroupId = adGroupId;
    this.productGroupPromotion = productGroupPromotion;
  }

    
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

    
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
    ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest = (ProductGroupPromotionUpdateRequest) o;
    return Objects.equals(adGroupId, productGroupPromotionUpdateRequest.adGroupId) &&
        Objects.equals(productGroupPromotion, productGroupPromotionUpdateRequest.productGroupPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, productGroupPromotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionUpdateRequest {\n");
    
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
