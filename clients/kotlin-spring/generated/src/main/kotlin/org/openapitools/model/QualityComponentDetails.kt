package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.QualityComponentIssue
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
 * Metrics for a specific event type within a quality component.
 * @param coverage Coverage percentage for this event type.
 * @param issues List of issues detected for this event type, if any.
 * @param overlap Overlap percentage for this event type. Only populated for external_event_id
 */
data class QualityComponentDetails(

    @Schema(example = "null", required = true, description = "Coverage percentage for this event type.")
    @get:JsonProperty("coverage", required = true) val coverage: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", description = "List of issues detected for this event type, if any.")
    @get:JsonProperty("issues") val issues: kotlin.collections.List<QualityComponentIssue>? = null,

    @Schema(example = "null", description = "Overlap percentage for this event type. Only populated for external_event_id")
    @get:JsonProperty("overlap") val overlap: java.math.BigDecimal? = null
) {

}

