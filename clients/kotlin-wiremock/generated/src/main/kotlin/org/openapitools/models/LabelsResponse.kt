@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelsResponse(
    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<LabelError>? = null,

    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<Label>? = null,

)
