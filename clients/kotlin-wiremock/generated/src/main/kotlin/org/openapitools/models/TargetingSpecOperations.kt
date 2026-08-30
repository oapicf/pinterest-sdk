@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingSpecOperations(
    @field:JsonProperty("field")
    val `field`: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<TargetingSpecShoppingRetargeting>,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
