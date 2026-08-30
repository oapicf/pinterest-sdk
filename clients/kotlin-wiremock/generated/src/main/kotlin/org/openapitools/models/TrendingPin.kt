@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendingPin(
    @field:JsonProperty("color")
    val color: kotlin.String,

    @field:JsonProperty("height")
    val height: kotlin.Int,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("src")
    val src: kotlin.String,

    @field:JsonProperty("width")
    val width: kotlin.Int,

    @field:JsonProperty("vertical_offset")
    val verticalOffset: kotlin.Double? = null,

)
