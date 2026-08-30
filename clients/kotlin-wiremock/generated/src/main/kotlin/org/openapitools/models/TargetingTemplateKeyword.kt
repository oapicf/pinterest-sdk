@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingTemplateKeyword(
    @field:JsonProperty("match_type")
    val matchType: MatchType? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

)
