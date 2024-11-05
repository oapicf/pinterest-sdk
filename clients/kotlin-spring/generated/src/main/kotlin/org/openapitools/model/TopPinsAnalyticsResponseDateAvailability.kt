package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param latestAvailableTimestamp 
 * @param isRealtime 
 */
data class TopPinsAnalyticsResponseDateAvailability(

    @Schema(example = "1649116799000", description = "")
    @get:JsonProperty("latest_available_timestamp") val latestAvailableTimestamp: java.math.BigDecimal? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("is_realtime") val isRealtime: kotlin.Boolean? = null
    ) {

}

