package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LineItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LineItem   {
  @JsonProperty("product_brand")
  private String productBrand;

  @JsonProperty("product_category")
  private String productCategory;

  @JsonProperty("product_id")
  private Integer productId;

  @JsonProperty("product_name")
  private String productName;

  @JsonProperty("product_price")
  private String productPrice;

  @JsonProperty("product_quantity")
  private Integer productQuantity;

  @JsonProperty("product_variant")
  private String productVariant;

  @JsonProperty("product_variant_id")
  private String productVariantId;

  public LineItem productBrand(String productBrand) {
    this.productBrand = productBrand;
    return this;
  }

   /**
   * Product brand. For example, \"Parker\".
   * @return productBrand
  **/
  @ApiModelProperty(example = "Parker", value = "Product brand. For example, \"Parker\".")
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
  **/
  @ApiModelProperty(example = "Shoes", value = "Product category. For example, \"Shoes\".")
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
  **/
  @ApiModelProperty(example = "1414", value = "Product ID. For example, 1414.")
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
  **/
  @ApiModelProperty(example = "Parker Boots", value = "Product name. For example, \"Parker Boots\".")
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
  **/
  @ApiModelProperty(example = "99.99", value = "Product price. For example, \"99.99\".")
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
  **/
  @ApiModelProperty(example = "2", value = "Product quantity. For example, 2.")
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
  **/
  @ApiModelProperty(example = "Red", value = "Product variant. For example, \"Red\".")
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
  **/
  @ApiModelProperty(example = "1414-34832", value = "Product variant ID. For example, \"1414-34832\".")
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

