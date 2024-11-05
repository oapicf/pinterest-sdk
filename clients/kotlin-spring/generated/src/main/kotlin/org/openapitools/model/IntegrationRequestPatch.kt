package org.openapitools.model

import java.util.Objects
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
 * Schema used for updating the integration metadata.
 * @param connectedMerchantId 
 * @param connectedAdvertiserId 
 * @param connectedLbaId 
 * @param connectedTagId 
 * @param partnerAccessToken 
 * @param partnerRefreshToken 
 * @param partnerPrimaryEmail 
 * @param partnerAccessTokenExpiry 
 * @param partnerRefreshTokenExpiry 
 * @param scopes 
 * @param additionalId1 
 * @param partnerMetadata 
 */
data class IntegrationRequestPatch(

    @Schema(example = "null", description = "")
    @get:JsonProperty("connected_merchant_id") val connectedMerchantId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connected_advertiser_id") val connectedAdvertiserId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connected_lba_id") val connectedLbaId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connected_tag_id") val connectedTagId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_access_token") val partnerAccessToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_refresh_token") val partnerRefreshToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_primary_email") val partnerPrimaryEmail: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_access_token_expiry") val partnerAccessTokenExpiry: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_refresh_token_expiry") val partnerRefreshTokenExpiry: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scopes") val scopes: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("additional_id_1") val additionalId1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_metadata") val partnerMetadata: kotlin.String? = null
    ) {

}

