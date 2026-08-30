@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserAccountFollowedInterests200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<Interest>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
