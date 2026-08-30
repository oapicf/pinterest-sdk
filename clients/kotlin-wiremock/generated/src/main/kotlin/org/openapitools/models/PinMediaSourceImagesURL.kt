@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaSourceImagesURL(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<PinMediaSourceImagesURLItem>,

    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("index")
    val index: kotlin.Int? = null,

)
