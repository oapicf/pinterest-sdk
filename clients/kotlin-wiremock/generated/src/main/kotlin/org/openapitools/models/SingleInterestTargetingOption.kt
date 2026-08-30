@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SingleInterestTargetingOption(
    @field:JsonProperty("child_interests")
    val childInterests: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("level")
    val level: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
