@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaSourcePinURL(
    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("is_affiliate_link")
    val isAffiliateLink: kotlin.Boolean? = false,

)
