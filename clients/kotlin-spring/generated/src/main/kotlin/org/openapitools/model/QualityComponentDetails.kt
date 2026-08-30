package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(required = true, description = "Coverage percentage for this event type.")
    @param:JsonProperty("coverage")
    @get:JsonProperty("coverage", required = true) val coverage: java.math.BigDecimal,

    @field:Valid
    @Schema(description = "List of issues detected for this event type, if any.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("issues")
    @get:JsonProperty("issues") val issues: kotlin.collections.List<QualityComponentIssue>? = null,

    @Schema(description = "Overlap percentage for this event type. Only populated for external_event_id")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("overlap")
    @get:JsonProperty("overlap") val overlap: java.math.BigDecimal? = null
) {

}

