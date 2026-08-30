@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelUpdateItem(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("status")
    val status: LabelStatus? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

)
