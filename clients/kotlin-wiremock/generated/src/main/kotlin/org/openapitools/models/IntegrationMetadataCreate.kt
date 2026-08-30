@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationMetadataCreate(
    @field:JsonProperty("additional_id_1")
    val additionalId1: kotlin.String? = null,

    @field:JsonProperty("connected_advertiser_id")
    val connectedAdvertiserId: kotlin.String? = null,

    @field:JsonProperty("connected_lba_id")
    val connectedLbaId: kotlin.String? = null,

    @field:JsonProperty("connected_merchant_id")
    val connectedMerchantId: kotlin.String? = null,

    @field:JsonProperty("connected_tag_id")
    val connectedTagId: kotlin.String? = null,

    @field:JsonProperty("external_business_id")
    val externalBusinessId: kotlin.String? = null,

    @field:JsonProperty("partner_access_token")
    val partnerAccessToken: kotlin.String? = null,

    @field:JsonProperty("partner_access_token_expiry")
    val partnerAccessTokenExpiry: java.math.BigDecimal? = null,

    @field:JsonProperty("partner_metadata")
    val partnerMetadata: kotlin.String? = null,

    @field:JsonProperty("partner_primary_email")
    val partnerPrimaryEmail: kotlin.String? = null,

    @field:JsonProperty("partner_refresh_token")
    val partnerRefreshToken: kotlin.String? = null,

    @field:JsonProperty("partner_refresh_token_expiry")
    val partnerRefreshTokenExpiry: java.math.BigDecimal? = null,

    @field:JsonProperty("scopes")
    val scopes: kotlin.String? = null,

)
