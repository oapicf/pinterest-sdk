@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleAppTypeMultipliers(
    @field:JsonProperty("APP_TYPE")
    val APP_TYPE: TargetingSpecAppType? = null,

)
