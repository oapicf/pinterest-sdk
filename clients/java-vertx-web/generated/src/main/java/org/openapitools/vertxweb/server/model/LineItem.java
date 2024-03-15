package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineItem   {
  
  private String productBrand;
  private String productCategory;
  private Integer productId;
  private String productName;
  private String productPrice;
  private Integer productQuantity;
  private String productVariant;
  private String productVariantId;

  public LineItem () {

  }

  public LineItem (String productBrand, String productCategory, Integer productId, String productName, String productPrice, Integer productQuantity, String productVariant, String productVariantId) {
    this.productBrand = productBrand;
    this.productCategory = productCategory;
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
    this.productVariant = productVariant;
    this.productVariantId = productVariantId;
  }

    
  @JsonProperty("product_brand")
  public String getProductBrand() {
    return productBrand;
  }
  public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }

    
  @JsonProperty("product_category")
  public String getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

    
  @JsonProperty("product_id")
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }

    
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

    
  @JsonProperty("product_price")
  public String getProductPrice() {
    return productPrice;
  }
  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

    
  @JsonProperty("product_quantity")
  public Integer getProductQuantity() {
    return productQuantity;
  }
  public void setProductQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
  }

    
  @JsonProperty("product_variant")
  public String getProductVariant() {
    return productVariant;
  }
  public void setProductVariant(String productVariant) {
    this.productVariant = productVariant;
  }

    
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
    return Objects.equals(productBrand, lineItem.productBrand) &&
        Objects.equals(productCategory, lineItem.productCategory) &&
        Objects.equals(productId, lineItem.productId) &&
        Objects.equals(productName, lineItem.productName) &&
        Objects.equals(productPrice, lineItem.productPrice) &&
        Objects.equals(productQuantity, lineItem.productQuantity) &&
        Objects.equals(productVariant, lineItem.productVariant) &&
        Objects.equals(productVariantId, lineItem.productVariantId);
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
