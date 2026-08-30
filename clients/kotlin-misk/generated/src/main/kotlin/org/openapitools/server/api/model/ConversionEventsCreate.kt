package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionEventsDataItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventsCreate(
    /** A list of events (one or more) encapsulated by a data object. */
    val `data`: kotlin.collections.List<ConversionEventsDataItems>
)
