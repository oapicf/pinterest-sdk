@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TotalCountByEntityStatus(
    @field:JsonProperty("ACTIVE")
    val ACTIVE: kotlin.Int? = null,

    @field:JsonProperty("ARCHIVED")
    val ARCHIVED: kotlin.Int? = null,

    @field:JsonProperty("PAUSED")
    val PAUSED: kotlin.Int? = null,

)
