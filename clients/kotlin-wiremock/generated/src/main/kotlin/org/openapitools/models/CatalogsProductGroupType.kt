@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CatalogsProductGroupType {
    @JsonProperty(value = "MERCHANT_CREATED") MERCHANT_CREATED,
    @JsonProperty(value = "ALL_PRODUCTS") ALL_PRODUCTS,
    @JsonProperty(value = "BEST_DEALS") BEST_DEALS,
    @JsonProperty(value = "PINNER_FAVORITES") PINNER_FAVORITES,
    @JsonProperty(value = "TOP_SELLERS") TOP_SELLERS,
    @JsonProperty(value = "BACK_IN_STOCK") BACK_IN_STOCK,
    @JsonProperty(value = "NEW_ARRIVALS") NEW_ARRIVALS,
    @JsonProperty(value = "SHOPIFY_COLLECTIONS") SHOPIFY_COLLECTIONS,
    @JsonProperty(value = "I2PC") I2PC,
    @JsonProperty(value = "CATALOG_EXPANSION") CATALOG_EXPANSION,
}
