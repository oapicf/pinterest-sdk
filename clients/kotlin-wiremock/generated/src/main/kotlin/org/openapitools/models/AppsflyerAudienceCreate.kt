@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AppsflyerAudienceCreate(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("platform")
    val platform: AppsflyerPlatform,

)
