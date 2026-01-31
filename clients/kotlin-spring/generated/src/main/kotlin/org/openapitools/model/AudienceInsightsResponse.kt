package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AudienceCategory
import org.openapitools.model.AudienceDemographics
import org.openapitools.model.AudienceInsightType
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
 * Audience interests and demographics.
 * @param categories Category interest distribution
 * @param date Generation date
 * @param demographics 
 * @param propertySize Population count.
 * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
 * @param type 
 */
data class AudienceInsightsResponse(

    @field:Valid
    @Schema(example = "null", description = "Category interest distribution")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<AudienceCategory>? = null,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(example = "2022-10-09", description = "Generation date")
    @get:JsonProperty("date") val date: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("demographics") val demographics: AudienceDemographics? = null,

    @Schema(example = "10000", description = "Population count.")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @Schema(example = "true", description = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
    @get:JsonProperty("size_is_upper_bound") val sizeIsUpperBound: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: AudienceInsightType? = AudienceInsightType.YOUR_TOTAL_AUDIENCE
) {

}

