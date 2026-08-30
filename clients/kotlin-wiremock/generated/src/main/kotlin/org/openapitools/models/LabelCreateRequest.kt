@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelCreateRequest(
    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<LabelCreateItem>,

)
