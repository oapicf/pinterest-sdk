@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordsCommon(
    @field:JsonProperty("match_type")
    val matchType: MatchTypeResponse,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

    @field:JsonProperty("bid")
    val bid: kotlin.Int? = null,

)
