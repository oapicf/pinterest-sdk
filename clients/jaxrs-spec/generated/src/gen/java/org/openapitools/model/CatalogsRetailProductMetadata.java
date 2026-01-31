package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Retail product metadata entity
 **/
@ApiModel(description = "Retail product metadata entity")
@JsonTypeName("CatalogsRetailProductMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-26T05:38:03.166641305Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsRetailProductMetadata   {
  private String itemId;
  private String itemGroupId;
  private NonNullableProductAvailabilityType availability;
  private BigDecimal price;
  private BigDecimal salePrice;
  private NonNullableCatalogsCurrency currency;

  public CatalogsRetailProductMetadata() {
  }

  @JsonCreator
  public CatalogsRetailProductMetadata(
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "item_group_id") String itemGroupId,
    @JsonProperty(required = true, value = "availability") NonNullableProductAvailabilityType availability,
    @JsonProperty(required = true, value = "price") BigDecimal price,
    @JsonProperty(required = true, value = "sale_price") BigDecimal salePrice,
    @JsonProperty(required = true, value = "currency") NonNullableCatalogsCurrency currency
  ) {
    this.itemId = itemId;
    this.itemGroupId = itemGroupId;
    this.availability = availability;
    this.price = price;
    this.salePrice = salePrice;
    this.currency = currency;
  }

  /**
   * The user-created unique ID that represents the product.
   **/
  public CatalogsRetailProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The user-created unique ID that represents the product.")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The parent ID of the product.
   **/
  public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294", required = true, value = "The parent ID of the product.")
  @JsonProperty(required = true, value = "item_group_id")
  @NotNull public String getItemGroupId() {
    return itemGroupId;
  }

  @JsonProperty(required = true, value = "item_group_id")
  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  /**
   **/
  public CatalogsRetailProductMetadata availability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "availability")
  @NotNull public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }

  @JsonProperty(required = true, value = "availability")
  public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

  /**
   * The price of the product.
   **/
  public CatalogsRetailProductMetadata price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "24.99", required = true, value = "The price of the product.")
  @JsonProperty(required = true, value = "price")
  @NotNull @Valid public BigDecimal getPrice() {
    return price;
  }

  @JsonProperty(required = true, value = "price")
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * The discounted price of the product.
   **/
  public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "14.99", required = true, value = "The discounted price of the product.")
  @JsonProperty(required = true, value = "sale_price")
  @NotNull @Valid public BigDecimal getSalePrice() {
    return salePrice;
  }

  @JsonProperty(required = true, value = "sale_price")
  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  /**
   **/
  public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "currency")
  @NotNull public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  @JsonProperty(required = true, value = "currency")
  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

