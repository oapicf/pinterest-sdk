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
 * Product metadata entity
 */

@Schema(name = "CatalogsProductMetadata", description = "Product metadata entity")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductMetadata {

  private String itemId;

  private JsonNullable<String> itemGroupId = JsonNullable.<String>undefined();

  private NonNullableProductAvailabilityType availability;

  private BigDecimal price;

  private JsonNullable<BigDecimal> salePrice = JsonNullable.<BigDecimal>undefined();

  private NonNullableCatalogsCurrency currency;

  public CatalogsProductMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductMetadata(String itemId, String itemGroupId, NonNullableProductAvailabilityType availability, BigDecimal price, BigDecimal salePrice, NonNullableCatalogsCurrency currency) {
    this.itemId = itemId;
    this.itemGroupId = JsonNullable.of(itemGroupId);
    this.availability = availability;
    this.price = price;
    this.salePrice = JsonNullable.of(salePrice);
    this.currency = currency;
  }

  public CatalogsProductMetadata itemId(String itemId) {
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

  public CatalogsProductMetadata itemGroupId(String itemGroupId) {
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

  public CatalogsProductMetadata availability(NonNullableProductAvailabilityType availability) {
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

  public CatalogsProductMetadata price(BigDecimal price) {
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

  public CatalogsProductMetadata salePrice(BigDecimal salePrice) {
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

  public CatalogsProductMetadata currency(NonNullableCatalogsCurrency currency) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

