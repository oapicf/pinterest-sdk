@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaWithImage(
    @field:JsonProperty("media_type")
    val mediaType: kotlin.String,

    @field:JsonProperty("images")
    val images: ImageSize? = null,

)
