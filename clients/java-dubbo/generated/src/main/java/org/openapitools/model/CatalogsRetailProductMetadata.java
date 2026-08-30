package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.ProductAvailability;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Retail product metadata entity
 */
public class CatalogsRetailProductMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("availability")
  private ProductAvailability availability;

  @JsonProperty("currency")
  private NonNullableCatalogsCurrency currency;

  /**
   * The parent ID of the product.
   */
  @JsonProperty("item_group_id")
  private String itemGroupId;

  /**
   * The user-created unique ID that represents the product.
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * The price of the product.
   */
  @JsonProperty("price")
  private BigDecimal price;

  /**
   * The discounted price of the product.
   */
  @JsonProperty("sale_price")
  private BigDecimal salePrice;

  /**
   * 
   * @return availability
   */
  public ProductAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ProductAvailability availability) {
    this.availability = availability;
  }

  /**
   * 
   * @return currency
   */
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  /**
   * The parent ID of the product.
   * @return itemGroupId
   */
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  /**
   * The user-created unique ID that represents the product.
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The price of the product.
   * @return price
   */
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * The discounted price of the product.
   * @return salePrice
   */
  public BigDecimal getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProductMetadata catalogsRetailProductMetadata = (CatalogsRetailProductMetadata) o;
    return Objects.equals(this.availability, catalogsRetailProductMetadata.availability) &&
        Objects.equals(this.currency, catalogsRetailProductMetadata.currency) &&
        Objects.equals(this.itemGroupId, catalogsRetailProductMetadata.itemGroupId) &&
        Objects.equals(this.itemId, catalogsRetailProductMetadata.itemId) &&
        Objects.equals(this.price, catalogsRetailProductMetadata.price) &&
        Objects.equals(this.salePrice, catalogsRetailProductMetadata.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, currency, itemGroupId, itemId, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductMetadata {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
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
