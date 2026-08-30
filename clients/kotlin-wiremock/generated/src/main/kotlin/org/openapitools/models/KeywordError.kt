@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordError(
    @field:JsonProperty("data")
    val `data`: Keyword? = null,

    @field:JsonProperty("error_messages")
    val errorMessages: kotlin.collections.List<kotlin.String>? = null,

)
