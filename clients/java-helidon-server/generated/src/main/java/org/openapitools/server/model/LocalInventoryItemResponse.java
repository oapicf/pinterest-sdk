package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ItemAvailability;
import org.openapitools.server.model.StoreMetadata;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Local inventory item response
 */
public class LocalInventoryItemResponse   {

    private String adLink;
    private ItemAvailability availability;
    private Long createdAt;
    private String itemId;
    private Long lastUpdatedTime;
    private String price;
    private String salePrice;
    private StoreMetadata storeMetadata;

    /**
     * Default constructor.
     */
    public LocalInventoryItemResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryItemResponse.
     *
     * @param adLink Ad link for the item
     * @param availability Availability status of the item
     * @param createdAt The millisecond timestamp when the local inventory item was created
     * @param itemId The catalog item id in the merchant namespace
     * @param lastUpdatedTime The millisecond timestamp when the local inventory item was lastly modified by the merchant.
     * @param price The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
     * @param salePrice The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @param storeMetadata Store metadata for this local inventory item
     */
    public LocalInventoryItemResponse(
        String adLink, 
        ItemAvailability availability, 
        Long createdAt, 
        String itemId, 
        Long lastUpdatedTime, 
        String price, 
        String salePrice, 
        StoreMetadata storeMetadata
    ) {
        this.adLink = adLink;
        this.availability = availability;
        this.createdAt = createdAt;
        this.itemId = itemId;
        this.lastUpdatedTime = lastUpdatedTime;
        this.price = price;
        this.salePrice = salePrice;
        this.storeMetadata = storeMetadata;
    }



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
     * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
     * @return price
     */
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
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

    /**
      * Create a string representation of this pojo.
    **/
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

