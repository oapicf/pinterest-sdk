@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IneligibleProductTagErrorItem(
    @field:JsonProperty("error_message")
    val errorMessage: IneligibleProductTagReason,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.String,

)
