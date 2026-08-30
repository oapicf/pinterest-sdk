@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductTagsError(
    @field:JsonProperty("code")
    val code: kotlin.Int,

    @field:JsonProperty("message")
    val message: kotlin.String,

    @field:JsonProperty("details")
    val details: IneligibleProductTagsErrorDetails? = null,

)
