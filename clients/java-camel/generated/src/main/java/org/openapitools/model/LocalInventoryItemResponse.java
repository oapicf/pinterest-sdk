package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAvailability;
import org.openapitools.model.StoreMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Local inventory item response
 */

@Schema(name = "LocalInventoryItemResponse", description = "Local inventory item response")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemResponse {

  private String adLink;

  private ItemAvailability availability;

  private Long createdAt;

  private String itemId;

  private Long lastUpdatedTime;

  private String price;

  private String salePrice;

  private StoreMetadata storeMetadata;

  public LocalInventoryItemResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalInventoryItemResponse(Long createdAt, String itemId, Long lastUpdatedTime, StoreMetadata storeMetadata) {
    this.createdAt = createdAt;
    this.itemId = itemId;
    this.lastUpdatedTime = lastUpdatedTime;
    this.storeMetadata = storeMetadata;
  }

  public LocalInventoryItemResponse adLink(String adLink) {
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

  public LocalInventoryItemResponse availability(ItemAvailability availability) {
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

  public LocalInventoryItemResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The millisecond timestamp when the local inventory item was created
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", example = "1641483432072", description = "The millisecond timestamp when the local inventory item was created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public LocalInventoryItemResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public LocalInventoryItemResponse lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
   * @return lastUpdatedTime
   */
  @NotNull 
  @Schema(name = "last_updated_time", example = "1641483432072", description = "The millisecond timestamp when the local inventory item was lastly modified by the merchant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public LocalInventoryItemResponse price(String price) {
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

  public LocalInventoryItemResponse salePrice(String salePrice) {
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

  public LocalInventoryItemResponse storeMetadata(StoreMetadata storeMetadata) {
    this.storeMetadata = storeMetadata;
    return this;
  }

  /**
   * Store metadata for this local inventory item
   * @return storeMetadata
   */
  @NotNull @Valid 
  @Schema(name = "store_metadata", description = "Store metadata for this local inventory item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("store_metadata")
  public StoreMetadata getStoreMetadata() {
    return storeMetadata;
  }

  public void setStoreMetadata(StoreMetadata storeMetadata) {
    this.storeMetadata = storeMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalInventoryItemResponse localInventoryItemResponse = (LocalInventoryItemResponse) o;
    return Objects.equals(this.adLink, localInventoryItemResponse.adLink) &&
        Objects.equals(this.availability, localInventoryItemResponse.availability) &&
        Objects.equals(this.createdAt, localInventoryItemResponse.createdAt) &&
        Objects.equals(this.itemId, localInventoryItemResponse.itemId) &&
        Objects.equals(this.lastUpdatedTime, localInventoryItemResponse.lastUpdatedTime) &&
        Objects.equals(this.price, localInventoryItemResponse.price) &&
        Objects.equals(this.salePrice, localInventoryItemResponse.salePrice) &&
        Objects.equals(this.storeMetadata, localInventoryItemResponse.storeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, availability, createdAt, itemId, lastUpdatedTime, price, salePrice, storeMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemResponse {\n");
    sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    storeMetadata: ").append(toIndentedString(storeMetadata)).append("\n");
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

