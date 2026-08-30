package org.openapitools.model;

import org.openapitools.model.ItemAvailability;
import org.openapitools.model.StoreMetadata;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Local inventory item response
 */
public class LocalInventoryItemResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ad link for the item
   */
  @JsonProperty("ad_link")
  private String adLink;

  /**
   * Availability status of the item
   */
  @JsonProperty("availability")
  private ItemAvailability availability;

  /**
   * The millisecond timestamp when the local inventory item was created
   */
  @JsonProperty("created_at")
  private Long createdAt;

  /**
   * The catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
   */
  @JsonProperty("last_updated_time")
  private Long lastUpdatedTime;

  /**
   * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
   */
  @JsonProperty("price")
  private String price;

  /**
   * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   */
  @JsonProperty("sale_price")
  private String salePrice;

  /**
   * Store metadata for this local inventory item
   */
  @JsonProperty("store_metadata")
  private StoreMetadata storeMetadata;

  /**
   * Ad link for the item
   * @return adLink
   */
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Availability status of the item
   * @return availability
   */
  public ItemAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  /**
   * The millisecond timestamp when the local inventory item was created
   * @return createdAt
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
   * @return lastUpdatedTime
   */
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
   * @return price
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   * @return salePrice
   */
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Store metadata for this local inventory item
   * @return storeMetadata
   */
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
