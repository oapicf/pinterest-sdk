/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Retail product metadata entity
 */
@JsonPropertyOrder({
  CatalogsRetailProductMetadata.JSON_PROPERTY_ITEM_ID,
  CatalogsRetailProductMetadata.JSON_PROPERTY_ITEM_GROUP_ID,
  CatalogsRetailProductMetadata.JSON_PROPERTY_AVAILABILITY,
  CatalogsRetailProductMetadata.JSON_PROPERTY_PRICE,
  CatalogsRetailProductMetadata.JSON_PROPERTY_SALE_PRICE,
  CatalogsRetailProductMetadata.JSON_PROPERTY_CURRENCY
})
@JsonTypeName("CatalogsRetailProductMetadata")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsRetailProductMetadata {
    public static final String JSON_PROPERTY_ITEM_ID = "item_id";
    private String itemId;

    public static final String JSON_PROPERTY_ITEM_GROUP_ID = "item_group_id";
    private String itemGroupId;

    public static final String JSON_PROPERTY_AVAILABILITY = "availability";
    private NonNullableProductAvailabilityType availability;

    public static final String JSON_PROPERTY_PRICE = "price";
    private BigDecimal price;

    public static final String JSON_PROPERTY_SALE_PRICE = "sale_price";
    private BigDecimal salePrice;

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    private NonNullableCatalogsCurrency currency;

    public CatalogsRetailProductMetadata(String itemId, String itemGroupId, NonNullableProductAvailabilityType availability, BigDecimal price, BigDecimal salePrice, NonNullableCatalogsCurrency currency) {
        this.itemId = itemId;
        this.itemGroupId = itemGroupId;
        this.availability = availability;
        this.price = price;
        this.salePrice = salePrice;
        this.currency = currency;
    }

    public CatalogsRetailProductMetadata itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * The user-created unique ID that represents the product.
     * @return itemId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ITEM_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getItemId() {
        return itemId;
    }

    @JsonProperty(JSON_PROPERTY_ITEM_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    /**
     * The parent ID of the product.
     * @return itemGroupId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ITEM_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getItemGroupId() {
        return itemGroupId;
    }

    @JsonProperty(JSON_PROPERTY_ITEM_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    public CatalogsRetailProductMetadata availability(NonNullableProductAvailabilityType availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Get availability
     * @return availability
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_AVAILABILITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public NonNullableProductAvailabilityType getAvailability() {
        return availability;
    }

    @JsonProperty(JSON_PROPERTY_AVAILABILITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAvailability(NonNullableProductAvailabilityType availability) {
        this.availability = availability;
    }

    public CatalogsRetailProductMetadata price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * The price of the product.
     * @return price
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    /**
     * The discounted price of the product.
     * @return salePrice
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SALE_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    @JsonProperty(JSON_PROPERTY_SALE_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * @return currency
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public NonNullableCatalogsCurrency getCurrency() {
        return currency;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCurrency(NonNullableCatalogsCurrency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsRetailProductMetadata catalogsRetailProductMetadata = (CatalogsRetailProductMetadata) o;
        return Objects.equals(this.itemId, catalogsRetailProductMetadata.itemId) &&
            Objects.equals(this.itemGroupId, catalogsRetailProductMetadata.itemGroupId) &&
            Objects.equals(this.availability, catalogsRetailProductMetadata.availability) &&
            Objects.equals(this.price, catalogsRetailProductMetadata.price) &&
            Objects.equals(this.salePrice, catalogsRetailProductMetadata.salePrice) &&
            Objects.equals(this.currency, catalogsRetailProductMetadata.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemGroupId, availability, price, salePrice, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailProductMetadata {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

