@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendsAgeDistribution(
    @field:JsonProperty("age_distribution")
    val ageDistribution: TrendsAgeBucket? = null,

)
