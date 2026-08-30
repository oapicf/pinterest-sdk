package org.openapitools.server.api.model

import org.openapitools.server.api.model.TrendsAgeDistribution
import org.openapitools.server.api.model.TrendsGenderDistribution
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendingKeywordDemographics(
    val ageDistribution: TrendsAgeDistribution? = null,
    val genderDistribution: TrendsGenderDistribution? = null
)
