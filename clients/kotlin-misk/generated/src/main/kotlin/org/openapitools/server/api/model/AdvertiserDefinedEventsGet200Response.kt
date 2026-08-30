package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvertiserDefinedEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvertiserDefinedEventsGet200Response(
    val items: kotlin.collections.List<AdvertiserDefinedEvent>
)
