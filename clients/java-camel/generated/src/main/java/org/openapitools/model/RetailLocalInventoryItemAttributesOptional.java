package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAvailability;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 */

@Schema(name = "RetailLocalInventoryItemAttributesOptional", description = "Local inventory attributes for retail items (all fields optional for update/get)")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RetailLocalInventoryItemAttributesOptional {

  private String adLink;

  private ItemAvailability availability;

  private String price;

  private String salePrice;

  public RetailLocalInventoryItemAttributesOptional adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

  /**
   * Ad link for the item
   * @return adLink
   */
  
  @Schema(name = "ad_link", example = "https://examplelink.com", description = "Ad link for the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public RetailLocalInventoryItemAttributesOptional availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Availability status of the item
   * @return availability
   */
  @Valid 
  @Schema(name = "availability", example = "in stock", description = "Availability status of the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  public RetailLocalInventoryItemAttributesOptional price(String price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
   * @return price
   */
  
  @Schema(name = "price", example = "49.99 USD", description = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public RetailLocalInventoryItemAttributesOptional salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  /**
   * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return salePrice
   */
  
  @Schema(name = "sale_price", example = "24.99 USD", description = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
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
    RetailLocalInventoryItemAttributesOptional retailLocalInventoryItemAttributesOptional = (RetailLocalInventoryItemAttributesOptional) o;
    return Objects.equals(this.adLink, retailLocalInventoryItemAttributesOptional.adLink) &&
        Objects.equals(this.availability, retailLocalInventoryItemAttributesOptional.availability) &&
        Objects.equals(this.price, retailLocalInventoryItemAttributesOptional.price) &&
        Objects.equals(this.salePrice, retailLocalInventoryItemAttributesOptional.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, availability, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailLocalInventoryItemAttributesOptional {\n");
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

