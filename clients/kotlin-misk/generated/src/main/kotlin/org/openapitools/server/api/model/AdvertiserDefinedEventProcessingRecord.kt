package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvertiserDefinedEventProcessingRecord(
    /** Name of the advertiser defined event */
    val name: kotlin.String,
    /** Processing status (success or failure) */
    val status: kotlin.String,
    /** List of exception messages if the operation failed */
    val exceptions: kotlin.collections.List<kotlin.String>? = null
)
