@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FollowUser(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("username")
    val username: kotlin.String? = null,

)
