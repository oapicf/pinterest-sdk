package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TrendingKeywordDemographicsAgeDistribution
import org.openapitools.model.TrendingKeywordDemographicsGenderDistribution
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
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.
 * @param ageDistribution 
 * @param genderDistribution 
 */
data class TrendingKeywordDemographics(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("age_distribution") val ageDistribution: TrendingKeywordDemographicsAgeDistribution? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("gender_distribution") val genderDistribution: TrendingKeywordDemographicsGenderDistribution? = null
) {

}

