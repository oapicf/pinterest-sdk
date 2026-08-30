package apimodels;

import apimodels.ProductGroupPromotion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductGroupPromotionsUpdateWithRequiredBody   {
  @JsonProperty("ad_group_id")
  @NotNull
@Pattern(regexp="^(AG)?\\d+$")

  private String adGroupId;

  @JsonProperty("product_group_promotion")
  @NotNull
@Valid

  private List<@Valid ProductGroupPromotion> productGroupPromotion = new ArrayList<>();

  public ProductGroupPromotionsUpdateWithRequiredBody adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * ID of the ad group the product group promotion belongs to.
   * @return adGroupId
  **/
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotion(List<@Valid ProductGroupPromotion> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  public ProductGroupPromotionsUpdateWithRequiredBody addProductGroupPromotionItem(ProductGroupPromotion productGroupPromotionItem) {
    if (this.productGroupPromotion == null) {
      this.productGroupPromotion = new ArrayList<>();
    }
    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

   /**
   * List of product group promotions to create or update.
   * @return productGroupPromotion
  **/
  public List<@Valid ProductGroupPromotion> getProductGroupPromotion() {
    return productGroupPromotion;
  }

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
    ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody = (ProductGroupPromotionsUpdateWithRequiredBody) o;
    return Objects.equals(adGroupId, productGroupPromotionsUpdateWithRequiredBody.adGroupId) &&
        Objects.equals(productGroupPromotion, productGroupPromotionsUpdateWithRequiredBody.productGroupPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, productGroupPromotion);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

