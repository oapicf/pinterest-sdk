package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PartnerMetadata(
    /** Text field value that uniquely identifies a subscriber. */
    val subscriberKey: kotlin.String? = null
)
