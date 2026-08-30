@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaSourceImageURL(
    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("is_standard")
    val isStandard: kotlin.Boolean? = true,

)
