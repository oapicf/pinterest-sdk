package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAvailability;
import org.openapitools.model.StoreMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Local inventory item response
 */
@ApiModel(description="Local inventory item response")

public class LocalInventoryItemResponse  {
  
 /**
  * Ad link for the item
  */
  @ApiModelProperty(example = "https://examplelink.com", value = "Ad link for the item")

  private String adLink;

 /**
  * Availability status of the item
  */
  @ApiModelProperty(example = "in stock", value = "Availability status of the item")

  @Valid

  private ItemAvailability availability;

 /**
  * The millisecond timestamp when the local inventory item was created
  */
  @ApiModelProperty(example = "1641483432072", required = true, value = "The millisecond timestamp when the local inventory item was created")

  private Long createdAt;

 /**
  * The catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")

  private String itemId;

 /**
  * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
  */
  @ApiModelProperty(example = "1641483432072", required = true, value = "The millisecond timestamp when the local inventory item was lastly modified by the merchant.")

  private Long lastUpdatedTime;

 /**
  * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "49.99 USD", value = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")

  private String price;

 /**
  * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "24.99 USD", value = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")

  private String salePrice;

 /**
  * Store metadata for this local inventory item
  */
  @ApiModelProperty(required = true, value = "Store metadata for this local inventory item")

  @Valid

  private StoreMetadata storeMetadata;
 /**
   * Ad link for the item
   * @return adLink
  **/
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public LocalInventoryItemResponse adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

 /**
   * Availability status of the item
   * @return availability
  **/
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  public LocalInventoryItemResponse availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

 /**
   * The millisecond timestamp when the local inventory item was created
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public LocalInventoryItemResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The catalog item id in the merchant namespace
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

  public LocalInventoryItemResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
   * @return lastUpdatedTime
  **/
  @JsonProperty("last_updated_time")
  @NotNull
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public LocalInventoryItemResponse lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

 /**
   * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
   * @return price
  **/
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public LocalInventoryItemResponse price(String price) {
    this.price = price;
    return this;
  }

 /**
   * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   * @return salePrice
  **/
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public LocalInventoryItemResponse salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

 /**
   * Store metadata for this local inventory item
   * @return storeMetadata
  **/
  @JsonProperty("store_metadata")
  @NotNull
  public StoreMetadata getStoreMetadata() {
    return storeMetadata;
  }

  public void setStoreMetadata(StoreMetadata storeMetadata) {
    this.storeMetadata = storeMetadata;
  }

  public LocalInventoryItemResponse storeMetadata(StoreMetadata storeMetadata) {
    this.storeMetadata = storeMetadata;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

