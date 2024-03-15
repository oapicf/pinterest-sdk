package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LineItem   {
  
  private String productBrand;
  private String productCategory;
  private Integer productId;
  private String productName;
  private String productPrice;
  private Integer productQuantity;
  private String productVariant;
  private String productVariantId;

  /**
   * Product brand. For example, \&quot;Parker\&quot;.
   **/
  
  @ApiModelProperty(example = "Parker", value = "Product brand. For example, \"Parker\".")
  @JsonProperty("product_brand")
  public String getProductBrand() {
    return productBrand;
  }
  public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }

  /**
   * Product category. For example, \&quot;Shoes\&quot;.
   **/
  
  @ApiModelProperty(example = "Shoes", value = "Product category. For example, \"Shoes\".")
  @JsonProperty("product_category")
  public String getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Product ID. For example, 1414.
   **/
  
  @ApiModelProperty(example = "1414", value = "Product ID. For example, 1414.")
  @JsonProperty("product_id")
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  /**
   * Product name. For example, \&quot;Parker Boots\&quot;.
   **/
  
  @ApiModelProperty(example = "Parker Boots", value = "Product name. For example, \"Parker Boots\".")
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Product price. For example, \&quot;99.99\&quot;.
   **/
  
  @ApiModelProperty(example = "99.99", value = "Product price. For example, \"99.99\".")
  @JsonProperty("product_price")
  public String getProductPrice() {
    return productPrice;
  }
  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

  /**
   * Product quantity. For example, 2.
   **/
  
  @ApiModelProperty(example = "2", value = "Product quantity. For example, 2.")
  @JsonProperty("product_quantity")
  public Integer getProductQuantity() {
    return productQuantity;
  }
  public void setProductQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
  }

  /**
   * Product variant. For example, \&quot;Red\&quot;.
   **/
  
  @ApiModelProperty(example = "Red", value = "Product variant. For example, \"Red\".")
  @JsonProperty("product_variant")
  public String getProductVariant() {
    return productVariant;
  }
  public void setProductVariant(String productVariant) {
    this.productVariant = productVariant;
  }

  /**
   * Product variant ID. For example, \&quot;1414-34832\&quot;.
   **/
  
  @ApiModelProperty(example = "1414-34832", value = "Product variant ID. For example, \"1414-34832\".")
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

