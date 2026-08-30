@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionDeletionRequestEPIKTargets(
    @field:JsonProperty("epiks")
    val epiks: kotlin.collections.List<kotlin.String>,

)
