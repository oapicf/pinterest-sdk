@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AudienceDefinition(
    @field:JsonProperty("date")
    val date: kotlin.String? = null,

    @field:JsonProperty("scope")
    val scope: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

)
