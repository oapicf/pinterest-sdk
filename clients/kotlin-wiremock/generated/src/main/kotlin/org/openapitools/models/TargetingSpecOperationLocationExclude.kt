@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingSpecOperationLocationExclude(
    @field:JsonProperty("field")
    val `field`: kotlin.String,

    @field:JsonProperty("operation")
    val operation: TargetingSpecListOperation,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<kotlin.String>,

)
