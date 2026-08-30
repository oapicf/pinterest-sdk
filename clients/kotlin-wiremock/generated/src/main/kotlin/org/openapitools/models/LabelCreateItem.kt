@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelCreateItem(
    @field:JsonProperty("label_type")
    val labelType: LabelType,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
