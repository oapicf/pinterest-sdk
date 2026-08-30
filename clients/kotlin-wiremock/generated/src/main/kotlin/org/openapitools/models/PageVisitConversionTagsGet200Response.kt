@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PageVisitConversionTagsGet200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<ConversionEventResponse>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
