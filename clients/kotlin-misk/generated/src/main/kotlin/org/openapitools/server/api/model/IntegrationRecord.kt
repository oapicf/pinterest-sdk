package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationRecord(
    /** Integration record ID. */
    val id: kotlin.String,
    val additionalId1: kotlin.String? = null,
    val connectedAdvertiserId: kotlin.String? = null,
    val connectedLbaId: kotlin.String? = null,
    val connectedMerchantId: kotlin.String? = null,
    val connectedTagId: kotlin.String? = null,
    val connectedUserId: kotlin.String? = null,
    val createdTime: kotlin.Int? = null,
    val externalBusinessId: kotlin.String? = null,
    val partnerAccessToken: kotlin.String? = null,
    val partnerAccessTokenExpiry: kotlin.Int? = null,
    val partnerMetadata: kotlin.String? = null,
    val partnerPrimaryEmail: kotlin.String? = null,
    val partnerRefreshToken: kotlin.String? = null,
    val partnerRefreshTokenExpiry: kotlin.Int? = null,
    val scopes: kotlin.String? = null,
    val updatedTime: kotlin.Int? = null
)
