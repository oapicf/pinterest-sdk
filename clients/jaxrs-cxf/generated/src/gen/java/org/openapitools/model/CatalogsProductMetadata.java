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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Product metadata entity
 **/
@ApiModel(description="Product metadata entity")

public class CatalogsProductMetadata  {
  
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The user-created unique ID that represents the product.")
 /**
   * The user-created unique ID that represents the product.
  **/
  private String itemId;

  @ApiModelProperty(example = "DS0294", required = true, value = "The parent ID of the product.")
 /**
   * The parent ID of the product.
  **/
  private String itemGroupId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableProductAvailabilityType availability;

  @ApiModelProperty(example = "24.99", required = true, value = "The price of the product.")
  @Valid
 /**
   * The price of the product.
  **/
  private BigDecimal price;

  @ApiModelProperty(example = "14.99", required = true, value = "The discounted price of the product.")
  @Valid
 /**
   * The discounted price of the product.
  **/
  private BigDecimal salePrice;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableCatalogsCurrency currency;
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

  public CatalogsProductMetadata itemId(String itemId) {
    this.itemId = itemId;
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

  public CatalogsProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

 /**
   * Get availability
   * @return availability
  **/
  @JsonProperty("availability")
  @NotNull
  public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }

  public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

  public CatalogsProductMetadata availability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
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

  public CatalogsProductMetadata price(BigDecimal price) {
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

  public CatalogsProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
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

  public CatalogsProductMetadata currency(NonNullableCatalogsCurrency currency) {
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
    CatalogsProductMetadata catalogsProductMetadata = (CatalogsProductMetadata) o;
    return Objects.equals(this.itemId, catalogsProductMetadata.itemId) &&
        Objects.equals(this.itemGroupId, catalogsProductMetadata.itemGroupId) &&
        Objects.equals(this.availability, catalogsProductMetadata.availability) &&
        Objects.equals(this.price, catalogsProductMetadata.price) &&
        Objects.equals(this.salePrice, catalogsProductMetadata.salePrice) &&
        Objects.equals(this.currency, catalogsProductMetadata.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemGroupId, availability, price, salePrice, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductMetadata {\n");
    
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

