package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
data class AudienceInsights(

    @field:Valid
    @Schema(description = "Category interest distribution")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("categories")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<AudienceCategory>? = null,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(example = "2022-10-09", description = "Generation date")
    @param:JsonProperty("date")
    @get:JsonProperty("date") val date: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("demographics")
    @get:JsonProperty("demographics") val demographics: AudienceDemographics? = null,

    @Schema(example = "10000", description = "Population count.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @Schema(example = "true", description = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("size_is_upper_bound")
    @get:JsonProperty("size_is_upper_bound") val sizeIsUpperBound: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: AudienceInsightType? = null
) {

}

