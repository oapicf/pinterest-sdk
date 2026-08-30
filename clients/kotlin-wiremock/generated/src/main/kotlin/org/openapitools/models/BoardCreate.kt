@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BoardCreate(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("is_ads_only")
    val isAdsOnly: kotlin.Boolean? = false,

    @field:JsonProperty("privacy")
    val privacy: BoardPrivacy? = null,

)
