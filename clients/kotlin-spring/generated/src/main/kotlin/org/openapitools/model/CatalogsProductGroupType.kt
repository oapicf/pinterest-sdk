package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
* Values: MERCHANT_CREATED,ALL_PRODUCTS,BEST_DEALS,PINNER_FAVORITES,TOP_SELLERS,BACK_IN_STOCK,NEW_ARRIVALS,SHOPIFY_COLLECTIONS,I2PC
*/
enum class CatalogsProductGroupType(val value: kotlin.String) {

    @JsonProperty("MERCHANT_CREATED") MERCHANT_CREATED("MERCHANT_CREATED"),
    @JsonProperty("ALL_PRODUCTS") ALL_PRODUCTS("ALL_PRODUCTS"),
    @JsonProperty("BEST_DEALS") BEST_DEALS("BEST_DEALS"),
    @JsonProperty("PINNER_FAVORITES") PINNER_FAVORITES("PINNER_FAVORITES"),
    @JsonProperty("TOP_SELLERS") TOP_SELLERS("TOP_SELLERS"),
    @JsonProperty("BACK_IN_STOCK") BACK_IN_STOCK("BACK_IN_STOCK"),
    @JsonProperty("NEW_ARRIVALS") NEW_ARRIVALS("NEW_ARRIVALS"),
    @JsonProperty("SHOPIFY_COLLECTIONS") SHOPIFY_COLLECTIONS("SHOPIFY_COLLECTIONS"),
    @JsonProperty("I2PC") I2PC("I2PC")
}

