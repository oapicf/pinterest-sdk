package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AmazonConnectRequest(
    /** The Amazon storefront name */
    val amazonStorefrontName: kotlin.String,
    /** The Amazon storefront url */
    val amazonStorefrontUrl: kotlin.String,
    /** The Amazon account linking status */
    val isAmazonAccountLinked: kotlin.Boolean,
    /** The Amazon storefront id */
    val amazonStorefrontId: kotlin.String? = null,
    /** The Amazon user id */
    val amazonUserId: kotlin.String? = null,
    /** The one time passcode for Pinterest-initiated linking requests */
    val oneTimePasscode: kotlin.String? = null,
    /** The Pinterest user id for Amazon-initiated linking requests */
    val pinterestUserId: kotlin.String? = null
)
