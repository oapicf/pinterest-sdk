@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaWithImages(
    @field:JsonProperty("media_type")
    val mediaType: kotlin.String,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<ImageMetadata>? = null,

)
