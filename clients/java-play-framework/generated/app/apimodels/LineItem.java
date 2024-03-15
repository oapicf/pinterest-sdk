package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LineItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

