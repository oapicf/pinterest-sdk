@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingSpecOperationMinimumAge(
    @field:JsonProperty("field")
    val `field`: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
