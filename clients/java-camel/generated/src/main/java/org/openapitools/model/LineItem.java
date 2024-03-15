package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LineItem
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LineItem {

  private String productBrand;

  private String productCategory;

  private Integer productId;

  private String productName;

  private String productPrice;

  private Integer productQuantity;

  private String productVariant;

  private String productVariantId;

  public LineItem productBrand(String productBrand) {
    this.productBrand = productBrand;
    return this;
  }

  /**
   * Product brand. For example, \"Parker\".
   * @return productBrand
  */
  
  @Schema(name = "product_brand", example = "Parker", description = "Product brand. For example, \"Parker\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_brand")
  public String getProductBrand() {
    return productBrand;
  }

  public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }

  public LineItem productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Product category. For example, \"Shoes\".
   * @return productCategory
  */
  
  @Schema(name = "product_category", example = "Shoes", description = "Product category. For example, \"Shoes\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_category")
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public LineItem productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product ID. For example, 1414.
   * @return productId
  */
  
  @Schema(name = "product_id", example = "1414", description = "Product ID. For example, 1414.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_id")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public LineItem productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Product name. For example, \"Parker Boots\".
   * @return productName
  */
  
  @Schema(name = "product_name", example = "Parker Boots", description = "Product name. For example, \"Parker Boots\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public LineItem productPrice(String productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * Product price. For example, \"99.99\".
   * @return productPrice
  */
  
  @Schema(name = "product_price", example = "99.99", description = "Product price. For example, \"99.99\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_price")
  public String getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

  public LineItem productQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
    return this;
  }

  /**
   * Product quantity. For example, 2.
   * @return productQuantity
  */
  
  @Schema(name = "product_quantity", example = "2", description = "Product quantity. For example, 2.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_quantity")
  public Integer getProductQuantity() {
    return productQuantity;
  }

  public void setProductQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
  }

  public LineItem productVariant(String productVariant) {
    this.productVariant = productVariant;
    return this;
  }

  /**
   * Product variant. For example, \"Red\".
   * @return productVariant
  */
  
  @Schema(name = "product_variant", example = "Red", description = "Product variant. For example, \"Red\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_variant")
  public String getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(String productVariant) {
    this.productVariant = productVariant;
  }

  public LineItem productVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
    return this;
  }

  /**
   * Product variant ID. For example, \"1414-34832\".
   * @return productVariantId
  */
  
  @Schema(name = "product_variant_id", example = "1414-34832", description = "Product variant ID. For example, \"1414-34832\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_variant_id")
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.productBrand, lineItem.productBrand) &&
        Objects.equals(this.productCategory, lineItem.productCategory) &&
        Objects.equals(this.productId, lineItem.productId) &&
        Objects.equals(this.productName, lineItem.productName) &&
        Objects.equals(this.productPrice, lineItem.productPrice) &&
        Objects.equals(this.productQuantity, lineItem.productQuantity) &&
        Objects.equals(this.productVariant, lineItem.productVariant) &&
        Objects.equals(this.productVariantId, lineItem.productVariantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productBrand, productCategory, productId, productName, productPrice, productQuantity, productVariant, productVariantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    productBrand: ").append(toIndentedString(productBrand)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productQuantity: ").append(toIndentedString(productQuantity)).append("\n");
    sb.append("    productVariant: ").append(toIndentedString(productVariant)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
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

