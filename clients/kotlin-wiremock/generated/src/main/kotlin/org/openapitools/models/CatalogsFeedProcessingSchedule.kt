@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedProcessingSchedule(
    @field:JsonProperty("time")
    val time: kotlin.String,

    @field:JsonProperty("timezone")
    val timezone: CatalogsFeedProcessingScheduleTimezone,

)
