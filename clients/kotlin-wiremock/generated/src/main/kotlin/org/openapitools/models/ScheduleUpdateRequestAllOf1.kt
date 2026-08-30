@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleUpdateRequestAllOf1(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("entity_id")
    val entityId: kotlin.String? = null,

    @field:JsonProperty("entity_type")
    val entityType: kotlin.String? = null,

)
