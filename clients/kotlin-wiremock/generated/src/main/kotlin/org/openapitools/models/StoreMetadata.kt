@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StoreMetadata(
    @field:JsonProperty("store_code")
    val storeCode: kotlin.String,

    @field:JsonProperty("store_id")
    val storeId: kotlin.String,

    @field:JsonProperty("geohash")
    val geohash: kotlin.String? = null,

    @field:JsonProperty("latitude")
    val latitude: kotlin.Double? = null,

    @field:JsonProperty("longitude")
    val longitude: kotlin.Double? = null,

    @field:JsonProperty("store_name")
    val storeName: kotlin.String? = null,

)
