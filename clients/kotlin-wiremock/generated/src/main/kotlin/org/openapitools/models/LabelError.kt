@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelError(
    @field:JsonProperty("data")
    val `data`: LabelErrorData? = null,

    @field:JsonProperty("error_messages")
    val errorMessages: kotlin.collections.List<kotlin.String>? = null,

)
