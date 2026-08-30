package org.openapitools.server.api.model

import org.openapitools.server.api.model.EventProcessingStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionApiResponseEventsItems(
    /** Whether the event was processed successfully. */
    val status: EventProcessingStatus,
    /** Error message containing more information about why the event failed to be processed. */
    val errorMessage: kotlin.String? = null,
    /** Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
    val warningMessage: kotlin.String? = null
)
