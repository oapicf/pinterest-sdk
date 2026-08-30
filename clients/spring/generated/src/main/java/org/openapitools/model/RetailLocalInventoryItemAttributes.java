package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAvailability;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Local inventory attributes for retail items (required fields for create/upsert)
 */

@Schema(name = "RetailLocalInventoryItemAttributes", description = "Local inventory attributes for retail items (required fields for create/upsert)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RetailLocalInventoryItemAttributes {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adLink;

  private ItemAvailability availability;

  private String price;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String salePrice;

  public RetailLocalInventoryItemAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RetailLocalInventoryItemAttributes(ItemAvailability availability, String price) {
    this.availability = availability;
    this.price = price;
  }

  public RetailLocalInventoryItemAttributes adLink(@Nullable String adLink) {
    this.adLink = adLink;
    return this;
  }

  /**
   * Ad link for the item
   * @return adLink
   */
  
  @Schema(name = "ad_link", example = "https://examplelink.com", description = "Ad link for the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_link")
  public @Nullable String getAdLink() {
    return adLink;
  }

  @JsonProperty("ad_link")
  public void setAdLink(@Nullable String adLink) {
    this.adLink = adLink;
  }

  public RetailLocalInventoryItemAttributes availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Availability status of the item
   * @return availability
   */
  @NotNull @Valid 
  @Schema(name = "availability", example = "in stock", description = "Availability status of the item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  public RetailLocalInventoryItemAttributes price(String price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
   * @return price
   */
  @NotNull 
  @Schema(name = "price", example = "49.99 USD", description = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(String price) {
    this.price = price;
  }

  public RetailLocalInventoryItemAttributes salePrice(@Nullable String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  /**
   * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return salePrice
   */
  
  @Schema(name = "sale_price", example = "24.99 USD", description = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sale_price")
  public @Nullable String getSalePrice() {
    return salePrice;
  }

  @JsonProperty("sale_price")
  public void setSalePrice(@Nullable String salePrice) {
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
    RetailLocalInventoryItemAttributes retailLocalInventoryItemAttributes = (RetailLocalInventoryItemAttributes) o;
    return Objects.equals(this.adLink, retailLocalInventoryItemAttributes.adLink) &&
        Objects.equals(this.availability, retailLocalInventoryItemAttributes.availability) &&
        Objects.equals(this.price, retailLocalInventoryItemAttributes.price) &&
        Objects.equals(this.salePrice, retailLocalInventoryItemAttributes.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, availability, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailLocalInventoryItemAttributes {\n");
    sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

