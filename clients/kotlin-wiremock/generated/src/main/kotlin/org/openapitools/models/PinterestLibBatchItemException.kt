@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinterestLibBatchItemException(
    @field:JsonProperty("message")
    val message: kotlin.String,

    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

)
