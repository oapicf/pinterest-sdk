@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FollowUserCreate(
    @field:JsonProperty("auto_follow")
    val autoFollow: kotlin.Boolean? = null,

)
