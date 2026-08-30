package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.ProductAvailability;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Retail product metadata entity
 */
@ApiModel(description="Retail product metadata entity")

public class CatalogsRetailProductMetadata  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private ProductAvailability availability;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private NonNullableCatalogsCurrency currency;

 /**
  * The parent ID of the product.
  */
  @ApiModelProperty(example = "DS0294", required = true, value = "The parent ID of the product.")

  private String itemGroupId;

 /**
  * The user-created unique ID that represents the product.
  */
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The user-created unique ID that represents the product.")

  private String itemId;

 /**
  * The price of the product.
  */
  @ApiModelProperty(example = "24.99", required = true, value = "The price of the product.")

  @Valid

  private BigDecimal price;

 /**
  * The discounted price of the product.
  */
  @ApiModelProperty(example = "14.99", required = true, value = "The discounted price of the product.")

  @Valid

  private BigDecimal salePrice;
 /**
   * Get availability
   * @return availability
  **/
  @JsonProperty("availability")
  @NotNull
  public ProductAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ProductAvailability availability) {
    this.availability = availability;
  }

  public CatalogsRetailProductMetadata availability(ProductAvailability availability) {
    this.availability = availability;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  @NotNull
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

 /**
   * The parent ID of the product.
   * @return itemGroupId
  **/
  @JsonProperty("item_group_id")
  @NotNull
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

 /**
   * The user-created unique ID that represents the product.
   * @return itemId
  **/
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsRetailProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The price of the product.
   * @return price
  **/
  @JsonProperty("price")
  @NotNull
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CatalogsRetailProductMetadata price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
   * The discounted price of the product.
   * @return salePrice
  **/
  @JsonProperty("sale_price")
  @NotNull
  public BigDecimal getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

