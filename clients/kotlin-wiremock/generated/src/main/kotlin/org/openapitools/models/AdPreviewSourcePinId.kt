@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdPreviewSourcePinId(
    @field:JsonProperty("pin_id")
    val pinId: kotlin.String,

    @field:JsonProperty("creative_type")
    val creativeType: AdPinPreviewCreativeType? = null,

)
