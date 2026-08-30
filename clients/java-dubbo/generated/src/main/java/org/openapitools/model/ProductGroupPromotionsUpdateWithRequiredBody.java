package org.openapitools.model;

import org.openapitools.model.ProductGroupPromotion;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class ProductGroupPromotionsUpdateWithRequiredBody implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * ID of the ad group the product group promotion belongs to.
   */
  @JsonProperty("ad_group_id")
  private String adGroupId;

  /**
   * List of product group promotions to create or update.
   */
  @JsonProperty("product_group_promotion")
  private List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

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
