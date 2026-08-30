@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CarouselSlot(
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
