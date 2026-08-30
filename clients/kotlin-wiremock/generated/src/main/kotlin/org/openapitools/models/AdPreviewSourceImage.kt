@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdPreviewSourceImage(
    @field:JsonProperty("image_url")
    val imageUrl: kotlin.String,

    @field:JsonProperty("title")
    val title: kotlin.String,

    @field:JsonProperty("promotion_id")
    val promotionId: kotlin.String? = null,

)
