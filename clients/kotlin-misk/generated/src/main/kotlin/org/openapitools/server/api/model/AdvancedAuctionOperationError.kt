package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionOperationError(
    /** The error code for the item bid option operation validation error */
    val code: kotlin.Int? = null,
    /** Message describing the item bid option operation validation error */
    val message: kotlin.String? = null
)
