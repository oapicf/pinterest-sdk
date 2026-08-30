@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendsEditorial(
    @field:JsonProperty("board_url")
    val boardUrl: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String,

    @field:JsonProperty("interests")
    val interests: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("pins_url")
    val pinsUrl: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("related_keywords")
    val relatedKeywords: kotlin.collections.List<KeywordInfo>,

    @field:JsonProperty("title")
    val title: kotlin.String,

)
