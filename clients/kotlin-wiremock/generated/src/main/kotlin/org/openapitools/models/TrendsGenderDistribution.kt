@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendsGenderDistribution(
    @field:JsonProperty("gender_distribution")
    val genderDistribution: TrendsGender? = null,

)
