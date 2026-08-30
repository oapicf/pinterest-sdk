package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvertiserDefinedEventInput
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvertiserDefinedEventsCreateRequest(
    /** List of advertiser defined events to create or update */
    val items: kotlin.collections.List<AdvertiserDefinedEventInput>
)
