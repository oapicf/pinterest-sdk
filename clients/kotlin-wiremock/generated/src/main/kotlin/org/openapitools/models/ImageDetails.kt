@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ImageDetails(
    @field:JsonProperty("height")
    val height: kotlin.Int,

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("width")
    val width: kotlin.Int,

)
