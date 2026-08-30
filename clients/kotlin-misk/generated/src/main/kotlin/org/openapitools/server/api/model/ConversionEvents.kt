package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionApiResponseEventsItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEvents(
    /** Specific messages for each event received. The order will match the order in which the events were received in the request. */
    val events: kotlin.collections.List<ConversionApiResponseEventsItems>,
    /** Number of events that were successfully processed from the events. */
    val numEventsProcessed: kotlin.Int,
    /** Total number of events received in the request. */
    val numEventsReceived: kotlin.Int
)
