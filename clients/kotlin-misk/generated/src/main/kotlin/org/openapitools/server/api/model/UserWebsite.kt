package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserWebsite(
    /** Status of the verification process */
    val status: kotlin.String? = null,
    /** UTC timestamp when the verification happened - sometimes missing */
    val verifiedAt: kotlin.String? = null,
    /** Website with path or domain only */
    val website: kotlin.String? = null
)
