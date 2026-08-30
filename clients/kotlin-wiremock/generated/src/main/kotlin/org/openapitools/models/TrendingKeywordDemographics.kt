@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendingKeywordDemographics(
    @field:JsonProperty("age_distribution")
    val ageDistribution: TrendsAgeDistribution? = null,

    @field:JsonProperty("gender_distribution")
    val genderDistribution: TrendsGenderDistribution? = null,

)
