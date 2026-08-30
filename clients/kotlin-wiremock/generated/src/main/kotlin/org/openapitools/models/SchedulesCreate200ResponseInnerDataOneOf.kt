@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SchedulesCreate200ResponseInnerDataOneOf(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("schedule_id")
    val scheduleId: kotlin.String,

    @field:JsonProperty("exceptions")
    val exceptions: PinterestLibError,

)
