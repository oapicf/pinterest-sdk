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
 * @param generatedCount The count of generated titles.
 * @param isReady Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
 * @param reviewedCount The count of advertiser reviewed titles.
 */
data class DynamicTitlesGetStatus(

    @Schema(example = "987", description = "The count of generated titles.")
    @param:JsonProperty("generated_count")
    @get:JsonProperty("generated_count") val generatedCount: kotlin.Int? = null,

    @Schema(example = "true", description = "Whether dynamic titles have been generated and are ready to be reviewed for the ad group.")
    @param:JsonProperty("is_ready")
    @get:JsonProperty("is_ready") val isReady: kotlin.Boolean? = null,

    @Schema(example = "456", description = "The count of advertiser reviewed titles.")
    @param:JsonProperty("reviewed_count")
    @get:JsonProperty("reviewed_count") val reviewedCount: kotlin.Int? = null
) {

}

