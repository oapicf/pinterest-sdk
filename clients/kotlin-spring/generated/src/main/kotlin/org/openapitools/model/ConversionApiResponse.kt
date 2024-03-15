package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionApiResponseEventsInner
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 * @param numEventsReceived Total number of events received in the request.
 * @param numEventsProcessed Number of events that were successfully processed from the events.
 * @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
 */
data class ConversionApiResponse(

    @Schema(example = "null", required = true, description = "Total number of events received in the request.")
    @get:JsonProperty("num_events_received", required = true) val numEventsReceived: kotlin.Int,

    @Schema(example = "null", required = true, description = "Number of events that were successfully processed from the events.")
    @get:JsonProperty("num_events_processed", required = true) val numEventsProcessed: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
    @get:JsonProperty("events", required = true) val events: kotlin.collections.List<ConversionApiResponseEventsInner>
) {

}

