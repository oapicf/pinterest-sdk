package org.openapitools.server.api.model

import org.openapitools.server.api.model.CustomerSegment
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerSegmentList200Response(
    val items: kotlin.collections.List<CustomerSegment>,
    val bookmark: kotlin.String? = null
)
