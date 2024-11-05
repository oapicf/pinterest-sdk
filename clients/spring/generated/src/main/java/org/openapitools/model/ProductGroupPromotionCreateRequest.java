package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotionCreateRequestElement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductGroupPromotionCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductGroupPromotionCreateRequest {

  private String adGroupId;

  @Valid
  private List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion = new ArrayList<>();

  public ProductGroupPromotionCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductGroupPromotionCreateRequest(String adGroupId, List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion) {
    this.adGroupId = adGroupId;
    this.productGroupPromotion = productGroupPromotion;
  }

  public ProductGroupPromotionCreateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the Ad Group the Product Group Promotion belongs to.
   * @return adGroupId
   */
  @NotNull @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", example = "2680059592705", description = "ID of the Ad Group the Product Group Promotion belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionCreateRequest productGroupPromotion(List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion) {
    this.productGroupPromotion = productGroupPromotion;
    return this;
  }

  public ProductGroupPromotionCreateRequest addProductGroupPromotionItem(ProductGroupPromotionCreateRequestElement productGroupPromotionItem) {
    if (this.productGroupPromotion == null) {
      this.productGroupPromotion = new ArrayList<>();
    }
    this.productGroupPromotion.add(productGroupPromotionItem);
    return this;
  }

  /**
   * Get productGroupPromotion
   * @return productGroupPromotion
   */
  @NotNull @Valid 
  @Schema(name = "product_group_promotion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_group_promotion")
  public List<@Valid ProductGroupPromotionCreateRequestElement> getProductGroupPromotion() {
    return productGroupPromotion;
  }

  public void setProductGroupPromotion(List<@Valid ProductGroupPromotionCreateRequestElement> productGroupPromotion) {
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

