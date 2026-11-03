package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.model.TopPinsAnalyticsResponsePinsItems
import org.openapitools.model.TopPinsSortBy
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
 * @param dateAvailability 
 * @param pins 
 * @param sortBy 
 */
data class TopPinsAnalyticsResponse(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("date_availability")
    @get:JsonProperty("date_availability") val dateAvailability: TopPinsAnalyticsResponseDateAvailability? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("pins")
    @get:JsonProperty("pins") val pins: kotlin.collections.List<TopPinsAnalyticsResponsePinsItems>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("sort_by")
    @get:JsonProperty("sort_by") val sortBy: TopPinsSortBy? = null
) {

}

