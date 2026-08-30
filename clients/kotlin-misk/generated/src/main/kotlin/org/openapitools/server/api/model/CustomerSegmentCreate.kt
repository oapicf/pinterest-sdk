package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerSegmentCreate(
    /** Audience IDs included in the customer segment. */
    val audienceIds: kotlin.collections.List<kotlin.String>,
    /** Customer segment name. */
    val name: kotlin.String
)
