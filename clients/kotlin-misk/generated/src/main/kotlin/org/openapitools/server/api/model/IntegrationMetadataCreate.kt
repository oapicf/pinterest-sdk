package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationMetadataCreate(
    val additionalId1: kotlin.String? = null,
    val connectedAdvertiserId: kotlin.String? = null,
    val connectedLbaId: kotlin.String? = null,
    val connectedMerchantId: kotlin.String? = null,
    val connectedTagId: kotlin.String? = null,
    /** External business ID for the integration. */
    val externalBusinessId: kotlin.String? = null,
    val partnerAccessToken: kotlin.String? = null,
    val partnerAccessTokenExpiry: java.math.BigDecimal? = null,
    val partnerMetadata: kotlin.String? = null,
    val partnerPrimaryEmail: kotlin.String? = null,
    val partnerRefreshToken: kotlin.String? = null,
    val partnerRefreshTokenExpiry: java.math.BigDecimal? = null,
    val scopes: kotlin.String? = null
)
