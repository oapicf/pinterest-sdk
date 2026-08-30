@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SummaryPin(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("alt_text")
    val altText: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("media")
    val media: PinMedia? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
