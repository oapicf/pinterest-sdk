package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LineItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Product brand. For example, &#39;Parker&#39;.
   */
  @JsonProperty("product_brand")
  private String productBrand;

  /**
   * Product category. For example, &#39;Shoes&#39;.
   */
  @JsonProperty("product_category")
  private String productCategory;

  /**
   * Product ID. For example, 1414.
   */
  @JsonProperty("product_id")
  private Integer productId;

  /**
   * Product name. For example, &#39;Parker Boots&#39;.
   */
  @JsonProperty("product_name")
  private String productName;

  /**
   * Product price. For example, &#39;99.99&#39;.
   */
  @JsonProperty("product_price")
  private String productPrice;

  /**
   * Product quantity. For example, 2.
   */
  @JsonProperty("product_quantity")
  private Integer productQuantity;

  /**
   * Product variant. For example, &#39;Red&#39;.
   */
  @JsonProperty("product_variant")
  private String productVariant;

  /**
   * Product variant ID. For example, &#39;1414-34832&#39;.
   */
  @JsonProperty("product_variant_id")
  private String productVariantId;

  /**
   * Product brand. For example, &#39;Parker&#39;.
   * @return productBrand
   */
  public String getProductBrand() {
    return productBrand;
  }

  public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }

  /**
   * Product category. For example, &#39;Shoes&#39;.
   * @return productCategory
   */
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Product ID. For example, 1414.
   * @return productId
   */
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  /**
   * Product name. For example, &#39;Parker Boots&#39;.
   * @return productName
   */
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Product price. For example, &#39;99.99&#39;.
   * @return productPrice
   */
  public String getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

  /**
   * Product quantity. For example, 2.
   * @return productQuantity
   */
  public Integer getProductQuantity() {
    return productQuantity;
  }

  public void setProductQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
  }

  /**
   * Product variant. For example, &#39;Red&#39;.
   * @return productVariant
   */
  public String getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(String productVariant) {
    this.productVariant = productVariant;
  }

  /**
   * Product variant ID. For example, &#39;1414-34832&#39;.
   * @return productVariantId
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
