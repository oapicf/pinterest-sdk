package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsProductGroupType {

    @JsonProperty("MERCHANT_CREATED") MERCHANT_CREATED(String.valueOf("MERCHANT_CREATED")), @JsonProperty("ALL_PRODUCTS") ALL_PRODUCTS(String.valueOf("ALL_PRODUCTS")), @JsonProperty("BEST_DEALS") BEST_DEALS(String.valueOf("BEST_DEALS")), @JsonProperty("PINNER_FAVORITES") PINNER_FAVORITES(String.valueOf("PINNER_FAVORITES")), @JsonProperty("TOP_SELLERS") TOP_SELLERS(String.valueOf("TOP_SELLERS")), @JsonProperty("BACK_IN_STOCK") BACK_IN_STOCK(String.valueOf("BACK_IN_STOCK")), @JsonProperty("NEW_ARRIVALS") NEW_ARRIVALS(String.valueOf("NEW_ARRIVALS")), @JsonProperty("SHOPIFY_COLLECTIONS") SHOPIFY_COLLECTIONS(String.valueOf("SHOPIFY_COLLECTIONS")), @JsonProperty("I2PC") I2_PC(String.valueOf("I2PC")), @JsonProperty("CATALOG_EXPANSION") CATALOG_EXPANSION(String.valueOf("CATALOG_EXPANSION"));


    private String value;

    CatalogsProductGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsProductGroupType fromValue(String value) {
        for (CatalogsProductGroupType b : CatalogsProductGroupType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



