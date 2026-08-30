@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEvents(
    @field:JsonProperty("events")
    val events: kotlin.collections.List<ConversionApiResponseEventsItems>,

    @field:JsonProperty("num_events_processed")
    val numEventsProcessed: kotlin.Int,

    @field:JsonProperty("num_events_received")
    val numEventsReceived: kotlin.Int,

)
