package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionTagTypeOptimal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvertiserDefinedEvent(
    /** Standard type mapped to ADE for optimization */
    val mappedConversionType: ConversionTagTypeOptimal? = null,
    /** Raw string name of the event, usually logged as raw_event_name in our dataset */
    val name: kotlin.String? = null
)
