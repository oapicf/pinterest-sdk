package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ItemAvailability;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Local inventory attributes for retail items (required fields for create/upsert)
 */
public class RetailLocalInventoryItemAttributes   {

    private String adLink;
    private ItemAvailability availability;
    private String price;
    private String salePrice;

    /**
     * Default constructor.
     */
    public RetailLocalInventoryItemAttributes() {
    // JSON-B / Jackson
    }

    /**
     * Create RetailLocalInventoryItemAttributes.
     *
     * @param adLink Ad link for the item
     * @param availability Availability status of the item
     * @param price The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
     * @param salePrice The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     */
    public RetailLocalInventoryItemAttributes(
        String adLink, 
        ItemAvailability availability, 
        String price, 
        String salePrice
    ) {
        this.adLink = adLink;
        this.availability = availability;
        this.price = price;
        this.salePrice = salePrice;
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
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

