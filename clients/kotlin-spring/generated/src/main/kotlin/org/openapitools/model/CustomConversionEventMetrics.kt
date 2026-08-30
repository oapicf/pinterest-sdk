package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdeColumnType
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
 * @param customEventMetricsType 
 * @param customEventName Name of the advertiser-defined custom conversion event
 */
data class CustomConversionEventMetrics(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("custom_event_metrics_type")
    @get:JsonProperty("custom_event_metrics_type", required = true) val customEventMetricsType: AdeColumnType,

    @Schema(required = true, description = "Name of the advertiser-defined custom conversion event")
    @param:JsonProperty("custom_event_name")
    @get:JsonProperty("custom_event_name", required = true) val customEventName: kotlin.String
) {

}

