@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AppsflyerAudience(
    @field:JsonProperty("container_id")
    val containerId: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("platform")
    val platform: AppsflyerPlatform,

)
