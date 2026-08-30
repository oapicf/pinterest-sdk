package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
* Values: MERCHANT_CREATED,ALL_PRODUCTS,BEST_DEALS,PINNER_FAVORITES,TOP_SELLERS,BACK_IN_STOCK,NEW_ARRIVALS,SHOPIFY_COLLECTIONS,I2PC,CATALOG_EXPANSION
*/
enum class CatalogsProductGroupType(@get:JsonValue val value: kotlin.String) {

    MERCHANT_CREATED("MERCHANT_CREATED"),
    ALL_PRODUCTS("ALL_PRODUCTS"),
    BEST_DEALS("BEST_DEALS"),
    PINNER_FAVORITES("PINNER_FAVORITES"),
    TOP_SELLERS("TOP_SELLERS"),
    BACK_IN_STOCK("BACK_IN_STOCK"),
    NEW_ARRIVALS("NEW_ARRIVALS"),
    SHOPIFY_COLLECTIONS("SHOPIFY_COLLECTIONS"),
    I2PC("I2PC"),
    CATALOG_EXPANSION("CATALOG_EXPANSION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CatalogsProductGroupType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsProductGroupType'")
        }
    }
}

