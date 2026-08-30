@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AmazonConnectRequest(
    @field:JsonProperty("amazon_storefront_name")
    val amazonStorefrontName: kotlin.String,

    @field:JsonProperty("amazon_storefront_url")
    val amazonStorefrontUrl: kotlin.String,

    @field:JsonProperty("is_amazon_account_linked")
    val isAmazonAccountLinked: kotlin.Boolean,

    @field:JsonProperty("amazon_storefront_id")
    val amazonStorefrontId: kotlin.String? = null,

    @field:JsonProperty("amazon_user_id")
    val amazonUserId: kotlin.String? = null,

    @field:JsonProperty("one_time_passcode")
    val oneTimePasscode: kotlin.String? = null,

    @field:JsonProperty("pinterest_user_id")
    val pinterestUserId: kotlin.String? = null,

)
