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
 * Campaign ad preview record.
 * @param adAccountId Advertiser ID for this preview.
 * @param adGroupId Ad group ID to create a preview record for.
 * @param expiresAt Unix timestamp in milliseconds for preview expiration.
 * @param isActive Whether preview link is active.
 * @param url Campaign ad preview URL.
 * @param userId User ID that created preview.
 * @param uuid Pin promotion preview key.
 * @param clientId Client ID that created preview.
 * @param pinId Pin ID for pin promotion preview.
 * @param pinPromotionId Pin promotion ID for this preview.
 * @param promotedProductGroupId Promoted product group ID for catalog previews.
 */
data class CampaignAdPreview(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", required = true, readOnly = true, description = "Advertiser ID for this preview.")
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id", required = true) val adAccountId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "1234567890", required = true, description = "Ad group ID to create a preview record for.")
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @Schema(required = true, readOnly = true, description = "Unix timestamp in milliseconds for preview expiration.")
    @param:JsonProperty("expires_at")
    @get:JsonProperty("expires_at", required = true) val expiresAt: kotlin.Int,

    @Schema(required = true, readOnly = true, description = "Whether preview link is active.")
    @param:JsonProperty("is_active")
    @get:JsonProperty("is_active", required = true) val isActive: kotlin.Boolean,

    @Schema(example = "https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/", required = true, readOnly = true, description = "Campaign ad preview URL.")
    @param:JsonProperty("url")
    @get:JsonProperty("url", required = true) val url: kotlin.String,

    @Schema(required = true, readOnly = true, description = "User ID that created preview.")
    @param:JsonProperty("user_id")
    @get:JsonProperty("user_id", required = true) val userId: kotlin.Int,

    @Schema(required = true, readOnly = true, description = "Pin promotion preview key.")
    @param:JsonProperty("uuid")
    @get:JsonProperty("uuid", required = true) val uuid: kotlin.String,

    @Schema(readOnly = true, description = "Client ID that created preview.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("client_id")
    @get:JsonProperty("client_id") val clientId: kotlin.Int? = null,

    @Schema(readOnly = true, description = "Pin ID for pin promotion preview.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id") val pinId: kotlin.Int? = null,

    @Schema(readOnly = true, description = "Pin promotion ID for this preview.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pin_promotion_id")
    @get:JsonProperty("pin_promotion_id") val pinPromotionId: kotlin.Int? = null,

    @Schema(readOnly = true, description = "Promoted product group ID for catalog previews.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promoted_product_group_id")
    @get:JsonProperty("promoted_product_group_id") val promotedProductGroupId: kotlin.Int? = null
) : CampaignAdPreviewCreate200ResponseInnerData {

}

