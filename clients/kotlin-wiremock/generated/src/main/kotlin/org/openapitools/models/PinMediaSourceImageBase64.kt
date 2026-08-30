@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaSourceImageBase64(
    @field:JsonProperty("content_type")
    val contentType: ContentType,

    @field:JsonProperty("data")
    val `data`: kotlin.String,

    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("is_standard")
    val isStandard: kotlin.Boolean? = true,

)
