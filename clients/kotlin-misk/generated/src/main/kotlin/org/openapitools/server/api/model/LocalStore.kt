package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalStore(
    /** Country code where the store is located. */
    val country: Country,
    /** Creation timestamp */
    val createdAt: java.time.OffsetDateTime,
    /** The ID of the local store. */
    val id: kotlin.String,
    /** The name of the local store. */
    val name: kotlin.String,
    /** Merchant provided code for the local store. Unique within the merchant&#39;s catalog. */
    val storeCode: kotlin.String,
    /** Last update timestamp */
    val updatedAt: java.time.OffsetDateTime,
    /** Primary address line of the store. */
    val addressPrimary: kotlin.String? = null,
    /** Secondary address line of the store. */
    val addressSecondary: kotlin.String? = null,
    /** City where the store is located. */
    val city: kotlin.String? = null,
    /** Geographic latitude coordinate of the store. */
    val latitude: kotlin.Float? = null,
    /** Geographic longitude coordinate of the store. */
    val longitude: kotlin.Float? = null,
    /** Postal or ZIP code of the store. */
    val postalCode: kotlin.String? = null,
    /** State or region code where the store is located. */
    val region: kotlin.String? = null
)
