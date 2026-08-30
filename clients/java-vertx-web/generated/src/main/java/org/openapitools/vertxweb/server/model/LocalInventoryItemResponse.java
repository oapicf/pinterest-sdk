package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ItemAvailability;
import org.openapitools.vertxweb.server.model.StoreMetadata;

/**
 * Local inventory item response
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalInventoryItemResponse   {
  
  private String adLink;
  private ItemAvailability availability;
  private Long createdAt;
  private String itemId;
  private Long lastUpdatedTime;
  private String price;
  private String salePrice;
  private StoreMetadata storeMetadata;

  public LocalInventoryItemResponse () {

  }

  public LocalInventoryItemResponse (String adLink, ItemAvailability availability, Long createdAt, String itemId, Long lastUpdatedTime, String price, String salePrice, StoreMetadata storeMetadata) {
    this.adLink = adLink;
    this.availability = availability;
    this.createdAt = createdAt;
    this.itemId = itemId;
    this.lastUpdatedTime = lastUpdatedTime;
    this.price = price;
    this.salePrice = salePrice;
    this.storeMetadata = storeMetadata;
  }

    
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

    
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }
  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

    
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

    
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

    
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

    
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
    return Objects.equals(adLink, localInventoryItemResponse.adLink) &&
        Objects.equals(availability, localInventoryItemResponse.availability) &&
        Objects.equals(createdAt, localInventoryItemResponse.createdAt) &&
        Objects.equals(itemId, localInventoryItemResponse.itemId) &&
        Objects.equals(lastUpdatedTime, localInventoryItemResponse.lastUpdatedTime) &&
        Objects.equals(price, localInventoryItemResponse.price) &&
        Objects.equals(salePrice, localInventoryItemResponse.salePrice) &&
        Objects.equals(storeMetadata, localInventoryItemResponse.storeMetadata);
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
