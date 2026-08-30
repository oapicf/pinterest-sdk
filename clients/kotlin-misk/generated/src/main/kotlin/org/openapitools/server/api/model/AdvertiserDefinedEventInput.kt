package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvertiserDefinedEventMappingType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvertiserDefinedEventInput(
    /** Pinterest standard event type to map this custom event to for campaign optimization and reporting */
    val mappedConversionType: AdvertiserDefinedEventMappingType,
    /** Raw string name of the event */
    val name: kotlin.String
)
