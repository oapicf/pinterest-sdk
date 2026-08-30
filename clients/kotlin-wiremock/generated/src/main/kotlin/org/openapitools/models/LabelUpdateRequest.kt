@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelUpdateRequest(
    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<LabelUpdateItem>,

)
