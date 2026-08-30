@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Keyword(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("match_type")
    val matchType: MatchType,

    @field:JsonProperty("parent_id")
    val parentId: kotlin.String,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

    @field:JsonProperty("archived")
    val archived: kotlin.Boolean? = null,

    @field:JsonProperty("bid")
    val bid: kotlin.Int? = null,

    @field:JsonProperty("parent_type")
    val parentType: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

)
