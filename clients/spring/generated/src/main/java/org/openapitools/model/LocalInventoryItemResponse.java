package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAvailability;
import org.openapitools.model.StoreMetadata;
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adLink;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ItemAvailability availability;

  private Long createdAt;

  private String itemId;

  private Long lastUpdatedTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String price;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String salePrice;

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

  public LocalInventoryItemResponse adLink(@Nullable String adLink) {
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

  public LocalInventoryItemResponse availability(@Nullable ItemAvailability availability) {
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
  public @Nullable ItemAvailability getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(@Nullable ItemAvailability availability) {
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

  @JsonProperty("created_at")
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

  @JsonProperty("item_id")
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

  @JsonProperty("last_updated_time")
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public LocalInventoryItemResponse price(@Nullable String price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
   * @return price
   */
  
  @Schema(name = "price", example = "49.99 USD", description = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable String getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(@Nullable String price) {
    this.price = price;
  }

  public LocalInventoryItemResponse salePrice(@Nullable String salePrice) {
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

  @JsonProperty("store_metadata")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

