package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAvailability;
import org.openapitools.model.StoreMetadata;
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
 * Local inventory item response
 **/
@ApiModel(description = "Local inventory item response")
@JsonTypeName("LocalInventoryItemResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemResponse   {
  private String adLink;
  private ItemAvailability availability;
  private Long createdAt;
  private String itemId;
  private Long lastUpdatedTime;
  private String price;
  private String salePrice;
  private StoreMetadata storeMetadata;

  public LocalInventoryItemResponse() {
  }

  @JsonCreator
  public LocalInventoryItemResponse(
    @JsonProperty(required = true, value = "created_at") Long createdAt,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "last_updated_time") Long lastUpdatedTime,
    @JsonProperty(required = true, value = "store_metadata") StoreMetadata storeMetadata
  ) {
    this.createdAt = createdAt;
    this.itemId = itemId;
    this.lastUpdatedTime = lastUpdatedTime;
    this.storeMetadata = storeMetadata;
  }

  /**
   * Ad link for the item
   **/
  public LocalInventoryItemResponse adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://examplelink.com", value = "Ad link for the item")
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  @JsonProperty("ad_link")
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Availability status of the item
   **/
  public LocalInventoryItemResponse availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(example = "in stock", value = "Availability status of the item")
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  /**
   * The millisecond timestamp when the local inventory item was created
   **/
  public LocalInventoryItemResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "1641483432072", required = true, value = "The millisecond timestamp when the local inventory item was created")
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Long getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The catalog item id in the merchant namespace
   **/
  public LocalInventoryItemResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
   **/
  public LocalInventoryItemResponse lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "1641483432072", required = true, value = "The millisecond timestamp when the local inventory item was lastly modified by the merchant.")
  @JsonProperty(required = true, value = "last_updated_time")
  @NotNull public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  @JsonProperty(required = true, value = "last_updated_time")
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  public LocalInventoryItemResponse price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "49.99 USD", value = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  public LocalInventoryItemResponse salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "24.99 USD", value = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  @JsonProperty("sale_price")
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Store metadata for this local inventory item
   **/
  public LocalInventoryItemResponse storeMetadata(StoreMetadata storeMetadata) {
    this.storeMetadata = storeMetadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Store metadata for this local inventory item")
  @JsonProperty(required = true, value = "store_metadata")
  @NotNull @Valid public StoreMetadata getStoreMetadata() {
    return storeMetadata;
  }

  @JsonProperty(required = true, value = "store_metadata")
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
