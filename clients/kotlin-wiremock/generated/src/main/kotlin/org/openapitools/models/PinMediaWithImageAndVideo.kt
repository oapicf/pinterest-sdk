@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaWithImageAndVideo(
    @field:JsonProperty("media_type")
    val mediaType: kotlin.String,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<PinMediaMetadata>? = null,

)
