@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelErrorData(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("label_type")
    val labelType: NullableLabelType? = null,

    @field:JsonProperty("status")
    val status: NullableLabelStatus? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

)
