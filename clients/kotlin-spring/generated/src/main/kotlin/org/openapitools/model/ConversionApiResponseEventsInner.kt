package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param status Whether the event was processed successfully.
 * @param errorMessage Error message containing more information about why the event failed to be processed.
 * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing.
 */
data class ConversionApiResponseEventsInner(

    @Schema(example = "processed", required = true, description = "Whether the event was processed successfully.")
    @get:JsonProperty("status", required = true) val status: ConversionApiResponseEventsInner.Status,

    @Schema(example = "null", description = "Error message containing more information about why the event failed to be processed.")
    @get:JsonProperty("error_message") val errorMessage: kotlin.String? = null,

    @Schema(example = "null", description = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.")
    @get:JsonProperty("warning_message") val warningMessage: kotlin.String? = null
    ) {

    /**
    * Whether the event was processed successfully.
    * Values: failed,processed
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        failed("failed"),
        processed("processed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().first{it -> it.value == value}
            }
        }
    }

}

