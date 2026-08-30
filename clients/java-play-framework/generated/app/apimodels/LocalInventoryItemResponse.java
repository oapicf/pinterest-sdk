package apimodels;

import apimodels.ItemAvailability;
import apimodels.StoreMetadata;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Local inventory item response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalInventoryItemResponse   {
  @JsonProperty("ad_link")
  
  private String adLink;

  @JsonProperty("availability")
  @Valid

  private ItemAvailability availability;

  @JsonProperty("created_at")
  @NotNull

  private Long createdAt;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("last_updated_time")
  @NotNull

  private Long lastUpdatedTime;

  @JsonProperty("price")
  
  private String price;

  @JsonProperty("sale_price")
  
  private String salePrice;

  @JsonProperty("store_metadata")
  @NotNull
@Valid

  private StoreMetadata storeMetadata;

  public LocalInventoryItemResponse adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

   /**
   * Ad link for the item
   * @return adLink
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

