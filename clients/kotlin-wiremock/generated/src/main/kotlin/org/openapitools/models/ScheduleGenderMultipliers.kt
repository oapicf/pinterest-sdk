@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleGenderMultipliers(
    @field:JsonProperty("GENDER")
    val GENDER: TargetingSpecGender? = null,

)
