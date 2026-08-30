@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionDeletionRequestCreate(
    @field:JsonProperty("deletion_targets")
    val deletionTargets: ConversionDeletionRequestTargets,

)
