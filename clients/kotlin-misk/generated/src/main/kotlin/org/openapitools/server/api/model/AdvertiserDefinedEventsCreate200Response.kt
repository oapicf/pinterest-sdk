package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvertiserDefinedEventProcessingRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvertiserDefinedEventsCreate200Response(
    val items: kotlin.collections.List<AdvertiserDefinedEventProcessingRecord>
)
