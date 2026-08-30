@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RecordCounts(
    @field:JsonProperty("invalid")
    val invalid: kotlin.Int,

    @field:JsonProperty("processed")
    val processed: kotlin.Int,

    @field:JsonProperty("valid")
    val valid: kotlin.Int,

)
