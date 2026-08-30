package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * Resource create operation model.
 * @param additionalId1 
 * @param connectedAdvertiserId 
 * @param connectedLbaId 
 * @param connectedMerchantId 
 * @param connectedTagId 
 * @param externalBusinessId External business ID for the integration.
 * @param partnerAccessToken 
 * @param partnerAccessTokenExpiry 
 * @param partnerMetadata 
 * @param partnerPrimaryEmail 
 * @param partnerRefreshToken 
 * @param partnerRefreshTokenExpiry 
 * @param scopes 
 */
data class IntegrationMetadataCreate(

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("additional_id_1")
    @get:JsonProperty("additional_id_1") val additionalId1: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("connected_advertiser_id")
    @get:JsonProperty("connected_advertiser_id") val connectedAdvertiserId: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("connected_lba_id")
    @get:JsonProperty("connected_lba_id") val connectedLbaId: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("connected_merchant_id")
    @get:JsonProperty("connected_merchant_id") val connectedMerchantId: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("connected_tag_id")
    @get:JsonProperty("connected_tag_id") val connectedTagId: kotlin.String? = null,

    @Schema(description = "External business ID for the integration.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("external_business_id")
    @get:JsonProperty("external_business_id") val externalBusinessId: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_access_token")
    @get:JsonProperty("partner_access_token") val partnerAccessToken: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_access_token_expiry")
    @get:JsonProperty("partner_access_token_expiry") val partnerAccessTokenExpiry: java.math.BigDecimal? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_metadata")
    @get:JsonProperty("partner_metadata") val partnerMetadata: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_primary_email")
    @get:JsonProperty("partner_primary_email") val partnerPrimaryEmail: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_refresh_token")
    @get:JsonProperty("partner_refresh_token") val partnerRefreshToken: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_refresh_token_expiry")
    @get:JsonProperty("partner_refresh_token_expiry") val partnerRefreshTokenExpiry: java.math.BigDecimal? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scopes")
    @get:JsonProperty("scopes") val scopes: kotlin.String? = null
) {

}

