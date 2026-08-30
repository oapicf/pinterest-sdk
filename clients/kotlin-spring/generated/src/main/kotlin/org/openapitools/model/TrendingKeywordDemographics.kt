package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TrendsAgeDistribution
import org.openapitools.model.TrendsGenderDistribution
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
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
 * @param ageDistribution 
 * @param genderDistribution 
 */
data class TrendingKeywordDemographics(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("age_distribution")
    @get:JsonProperty("age_distribution") val ageDistribution: TrendsAgeDistribution? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("gender_distribution")
    @get:JsonProperty("gender_distribution") val genderDistribution: TrendsGenderDistribution? = null
) {

}

