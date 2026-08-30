@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleCreateRequestAllOf1(
    @field:JsonProperty("entity_id")
    val entityId: kotlin.String,

    @field:JsonProperty("entity_type")
    val entityType: kotlin.String,

)
