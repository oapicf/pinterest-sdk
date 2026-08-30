@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetAccessRequestError(
    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<kotlin.String>? = null,

)
