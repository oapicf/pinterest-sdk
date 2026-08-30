@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupAudienceSizingKeyword(
    @field:JsonProperty("match_type")
    val matchType: MatchType,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
