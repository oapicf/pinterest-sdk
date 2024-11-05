package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Retail product metadata entity
 */

@Schema(name = "CatalogsRetailProductMetadata", description = "Retail product metadata entity")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailProductMetadata {

  private String itemId;

  private JsonNullable<String> itemGroupId = JsonNullable.<String>undefined();

  private NonNullableProductAvailabilityType availability;

  private BigDecimal price;

  private JsonNullable<BigDecimal> salePrice = JsonNullable.<BigDecimal>undefined();

  private NonNullableCatalogsCurrency currency;

  public CatalogsRetailProductMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailProductMetadata(String itemId, String itemGroupId, NonNullableProductAvailabilityType availability, BigDecimal price, BigDecimal salePrice, NonNullableCatalogsCurrency currency) {
    this.itemId = itemId;
    this.itemGroupId = JsonNullable.of(itemGroupId);
    this.availability = availability;
    this.price = price;
    this.salePrice = JsonNullable.of(salePrice);
    this.currency = currency;
  }

  public CatalogsRetailProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The user-created unique ID that represents the product.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", example = "DS0294-L", description = "The user-created unique ID that represents the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = JsonNullable.of(itemGroupId);
    return this;
  }

  /**
   * The parent ID of the product.
   * @return itemGroupId
   */
  @NotNull 
  @Schema(name = "item_group_id", example = "DS0294", description = "The parent ID of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_group_id")
  public JsonNullable<String> getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(JsonNullable<String> itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public CatalogsRetailProductMetadata availability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @NotNull @Valid 
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availability")
  public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }

  public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

  public CatalogsRetailProductMetadata price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the product.
   * @return price
   */
  @NotNull @Valid 
  @Schema(name = "price", example = "24.99", description = "The price of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = JsonNullable.of(salePrice);
    return this;
  }

  /**
   * The discounted price of the product.
   * @return salePrice
   */
  @NotNull @Valid 
  @Schema(name = "sale_price", example = "14.99", description = "The discounted price of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sale_price")
  public JsonNullable<BigDecimal> getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(JsonNullable<BigDecimal> salePrice) {
    this.salePrice = salePrice;
  }

  public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @NotNull @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

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

