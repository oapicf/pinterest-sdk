package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.NonNullableCatalogsCurrency;
import org.openapitools.server.model.ProductAvailability;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Retail product metadata entity
 */
public class CatalogsRetailProductMetadata   {

    private ProductAvailability availability;
    private NonNullableCatalogsCurrency currency;
    private String itemGroupId;
    private String itemId;
    private BigDecimal price;
    private BigDecimal salePrice;

    /**
     * Default constructor.
     */
    public CatalogsRetailProductMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailProductMetadata.
     *
     * @param availability availability
     * @param currency currency
     * @param itemGroupId The parent ID of the product.
     * @param itemId The user-created unique ID that represents the product.
     * @param price The price of the product.
     * @param salePrice The discounted price of the product.
     */
    public CatalogsRetailProductMetadata(
        ProductAvailability availability, 
        NonNullableCatalogsCurrency currency, 
        String itemGroupId, 
        String itemId, 
        BigDecimal price, 
        BigDecimal salePrice
    ) {
        this.availability = availability;
        this.currency = currency;
        this.itemGroupId = itemGroupId;
        this.itemId = itemId;
        this.price = price;
        this.salePrice = salePrice;
    }



    /**
     * Get availability
     * @return availability
     */
    public ProductAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(ProductAvailability availability) {
        this.availability = availability;
    }

    /**
     * Get currency
     * @return currency
     */
    public NonNullableCatalogsCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(NonNullableCatalogsCurrency currency) {
        this.currency = currency;
    }

    /**
     * The parent ID of the product.
     * @return itemGroupId
     */
    public String getItemGroupId() {
        return itemGroupId;
    }

    public void setItemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    /**
     * The user-created unique ID that represents the product.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * The price of the product.
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * The discounted price of the product.
     * @return salePrice
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailProductMetadata {\n");
        
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

