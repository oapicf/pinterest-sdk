@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordUpdateItem(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("archived")
    val archived: kotlin.Boolean? = null,

    @field:JsonProperty("bid")
    val bid: kotlin.Int? = null,

)
