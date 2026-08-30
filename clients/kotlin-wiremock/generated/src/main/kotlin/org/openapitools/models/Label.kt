@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Label(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("label_type")
    val labelType: NullableLabelType,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

    @field:JsonProperty("status")
    val status: NullableLabelStatus? = null,

)
