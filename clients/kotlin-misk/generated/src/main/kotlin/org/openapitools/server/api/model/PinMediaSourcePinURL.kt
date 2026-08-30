package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourcePinURL(
    val sourceType: kotlin.String,
    /** This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    val isAffiliateLink: kotlin.Boolean? = false
)
