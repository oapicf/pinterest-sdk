package org.openapitools.server.api.model

import org.openapitools.server.api.model.TrendsAgeBucket
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendsAgeDistribution(
    val ageDistribution: TrendsAgeBucket? = null
)
