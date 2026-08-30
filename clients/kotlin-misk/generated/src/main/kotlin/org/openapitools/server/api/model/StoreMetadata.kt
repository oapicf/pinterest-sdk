package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StoreMetadata(
    /** Merchant provided store code */
    val storeCode: kotlin.String,
    /** Internal store code */
    val storeId: kotlin.String,
    /** Geohash of the store location */
    val geohash: kotlin.String? = null,
    /** Geographic latitude coordinate of the store */
    val latitude: kotlin.Double? = null,
    /** Geographic longitude coordinate of the store */
    val longitude: kotlin.Double? = null,
    /** Store name */
    val storeName: kotlin.String? = null
)
