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
 * Breakdown of asset counts by entity status.
 * @param ACTIVE Count of ACTIVE assets
 * @param ARCHIVED Count of ARCHIVED assets
 * @param PAUSED Count of PAUSED assets
 */
data class TotalCountByEntityStatus(

    @Schema(description = "Count of ACTIVE assets")
    @param:JsonProperty("ACTIVE")
    @get:JsonProperty("ACTIVE") val ACTIVE: kotlin.Int? = null,

    @Schema(description = "Count of ARCHIVED assets")
    @param:JsonProperty("ARCHIVED")
    @get:JsonProperty("ARCHIVED") val ARCHIVED: kotlin.Int? = null,

    @Schema(description = "Count of PAUSED assets")
    @param:JsonProperty("PAUSED")
    @get:JsonProperty("PAUSED") val PAUSED: kotlin.Int? = null
) {

}

