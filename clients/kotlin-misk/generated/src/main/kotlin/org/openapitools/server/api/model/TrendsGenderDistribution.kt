package org.openapitools.server.api.model

import org.openapitools.server.api.model.TrendsGender
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendsGenderDistribution(
    val genderDistribution: TrendsGender? = null
)
