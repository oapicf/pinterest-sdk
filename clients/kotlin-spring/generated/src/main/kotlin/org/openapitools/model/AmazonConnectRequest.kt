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
 * Request containing OTP and Amazon storefront info called by Amazon
 * @param amazonStorefrontName The Amazon storefront name
 * @param amazonStorefrontUrl The Amazon storefront url
 * @param isAmazonAccountLinked The Amazon account linking status
 * @param amazonStorefrontId The Amazon storefront id
 * @param amazonUserId The Amazon user id
 * @param oneTimePasscode The one time passcode for Pinterest-initiated linking requests
 * @param pinterestUserId The Pinterest user id for Amazon-initiated linking requests
 */
data class AmazonConnectRequest(

    @Schema(example = "null", required = true, description = "The Amazon storefront name")
    @get:JsonProperty("amazon_storefront_name", required = true) val amazonStorefrontName: kotlin.String,

    @Schema(example = "null", required = true, description = "The Amazon storefront url")
    @get:JsonProperty("amazon_storefront_url", required = true) val amazonStorefrontUrl: kotlin.String,

    @Schema(example = "null", required = true, description = "The Amazon account linking status")
    @get:JsonProperty("is_amazon_account_linked", required = true) val isAmazonAccountLinked: kotlin.Boolean,

    @Schema(example = "null", description = "The Amazon storefront id")
    @get:JsonProperty("amazon_storefront_id") val amazonStorefrontId: kotlin.String? = null,

    @Schema(example = "null", description = "The Amazon user id")
    @get:JsonProperty("amazon_user_id") val amazonUserId: kotlin.String? = null,

    @Schema(example = "089aee0d-92d3-4f8f-a947-6dc016d85bf0", description = "The one time passcode for Pinterest-initiated linking requests")
    @get:JsonProperty("one_time_passcode") val oneTimePasscode: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "902057137772013006", description = "The Pinterest user id for Amazon-initiated linking requests")
    @get:JsonProperty("pinterest_user_id") val pinterestUserId: kotlin.String? = null
) {

}

