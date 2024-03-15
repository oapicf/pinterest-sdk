package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LineItem  {
  
 /**
  * Product brand. For example, \"Parker\".
  */
  @ApiModelProperty(example = "Parker", value = "Product brand. For example, \"Parker\".")
  private String productBrand;

 /**
  * Product category. For example, \"Shoes\".
  */
  @ApiModelProperty(example = "Shoes", value = "Product category. For example, \"Shoes\".")
  private String productCategory;

 /**
  * Product ID. For example, 1414.
  */
  @ApiModelProperty(example = "1414", value = "Product ID. For example, 1414.")
  private Integer productId;

 /**
  * Product name. For example, \"Parker Boots\".
  */
  @ApiModelProperty(example = "Parker Boots", value = "Product name. For example, \"Parker Boots\".")
  private String productName;

 /**
  * Product price. For example, \"99.99\".
  */
  @ApiModelProperty(example = "99.99", value = "Product price. For example, \"99.99\".")
  private String productPrice;

 /**
  * Product quantity. For example, 2.
  */
  @ApiModelProperty(example = "2", value = "Product quantity. For example, 2.")
  private Integer productQuantity;

 /**
  * Product variant. For example, \"Red\".
  */
  @ApiModelProperty(example = "Red", value = "Product variant. For example, \"Red\".")
  private String productVariant;

 /**
  * Product variant ID. For example, \"1414-34832\".
  */
  @ApiModelProperty(example = "1414-34832", value = "Product variant ID. For example, \"1414-34832\".")
  private String productVariantId;
 /**
  * Product brand. For example, \&quot;Parker\&quot;.
  * @return productBrand
  */
  @JsonProperty("product_brand")
  public String getProductBrand() {
    return productBrand;
  }

  /**
   * Sets the <code>productBrand</code> property.
   */
 public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }

  /**
   * Sets the <code>productBrand</code> property.
   */
  public LineItem productBrand(String productBrand) {
    this.productBrand = productBrand;
    return this;
  }

 /**
  * Product category. For example, \&quot;Shoes\&quot;.
  * @return productCategory
  */
  @JsonProperty("product_category")
  public String getProductCategory() {
    return productCategory;
  }

  /**
   * Sets the <code>productCategory</code> property.
   */
 public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Sets the <code>productCategory</code> property.
   */
  public LineItem productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

 /**
  * Product ID. For example, 1414.
  * @return productId
  */
  @JsonProperty("product_id")
  public Integer getProductId() {
    return productId;
  }

  /**
   * Sets the <code>productId</code> property.
   */
 public void setProductId(Integer productId) {
    this.productId = productId;
  }

  /**
   * Sets the <code>productId</code> property.
   */
  public LineItem productId(Integer productId) {
    this.productId = productId;
    return this;
  }

 /**
  * Product name. For example, \&quot;Parker Boots\&quot;.
  * @return productName
  */
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  /**
   * Sets the <code>productName</code> property.
   */
 public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Sets the <code>productName</code> property.
   */
  public LineItem productName(String productName) {
    this.productName = productName;
    return this;
  }

 /**
  * Product price. For example, \&quot;99.99\&quot;.
  * @return productPrice
  */
  @JsonProperty("product_price")
  public String getProductPrice() {
    return productPrice;
  }

  /**
   * Sets the <code>productPrice</code> property.
   */
 public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

  /**
   * Sets the <code>productPrice</code> property.
   */
  public LineItem productPrice(String productPrice) {
    this.productPrice = productPrice;
    return this;
  }

 /**
  * Product quantity. For example, 2.
  * @return productQuantity
  */
  @JsonProperty("product_quantity")
  public Integer getProductQuantity() {
    return productQuantity;
  }

  /**
   * Sets the <code>productQuantity</code> property.
   */
 public void setProductQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
  }

  /**
   * Sets the <code>productQuantity</code> property.
   */
  public LineItem productQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
    return this;
  }

 /**
  * Product variant. For example, \&quot;Red\&quot;.
  * @return productVariant
  */
  @JsonProperty("product_variant")
  public String getProductVariant() {
    return productVariant;
  }

  /**
   * Sets the <code>productVariant</code> property.
   */
 public void setProductVariant(String productVariant) {
    this.productVariant = productVariant;
  }

  /**
   * Sets the <code>productVariant</code> property.
   */
  public LineItem productVariant(String productVariant) {
    this.productVariant = productVariant;
    return this;
  }

 /**
  * Product variant ID. For example, \&quot;1414-34832\&quot;.
  * @return productVariantId
  */
  @JsonProperty("product_variant_id")
  public String getProductVariantId() {
    return productVariantId;
  }

  /**
   * Sets the <code>productVariantId</code> property.
   */
 public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  /**
   * Sets the <code>productVariantId</code> property.
   */
  public LineItem productVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

