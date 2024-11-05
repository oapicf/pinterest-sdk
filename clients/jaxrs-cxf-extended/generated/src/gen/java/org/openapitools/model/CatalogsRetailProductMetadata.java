package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Retail product metadata entity
 */
@ApiModel(description="Retail product metadata entity")

public class CatalogsRetailProductMetadata  {
  
 /**
  * The user-created unique ID that represents the product.
  */
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The user-created unique ID that represents the product.")
  private String itemId;

 /**
  * The parent ID of the product.
  */
  @ApiModelProperty(example = "DS0294", required = true, value = "The parent ID of the product.")
  private String itemGroupId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableProductAvailabilityType availability;

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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableCatalogsCurrency currency;
 /**
  * The user-created unique ID that represents the product.
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public CatalogsRetailProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * The parent ID of the product.
  * @return itemGroupId
  */
  @JsonProperty("item_group_id")
  @NotNull
  public String getItemGroupId() {
    return itemGroupId;
  }

  /**
   * Sets the <code>itemGroupId</code> property.
   */
 public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  /**
   * Sets the <code>itemGroupId</code> property.
   */
  public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

 /**
  * Get availability
  * @return availability
  */
  @JsonProperty("availability")
  @NotNull
  public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
 public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
  public CatalogsRetailProductMetadata availability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
    return this;
  }

 /**
  * The price of the product.
  * @return price
  */
  @JsonProperty("price")
  @NotNull
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public CatalogsRetailProductMetadata price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * The discounted price of the product.
  * @return salePrice
  */
  @JsonProperty("sale_price")
  @NotNull
  public BigDecimal getSalePrice() {
    return salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
 public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
  public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  @NotNull
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
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
    return Objects.equals(this.itemId, catalogsRetailProductMetadata.itemId) &&
        Objects.equals(this.itemGroupId, catalogsRetailProductMetadata.itemGroupId) &&
        Objects.equals(this.availability, catalogsRetailProductMetadata.availability) &&
        Objects.equals(this.price, catalogsRetailProductMetadata.price) &&
        Objects.equals(this.salePrice, catalogsRetailProductMetadata.salePrice) &&
        Objects.equals(this.currency, catalogsRetailProductMetadata.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemGroupId, availability, price, salePrice, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductMetadata {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

