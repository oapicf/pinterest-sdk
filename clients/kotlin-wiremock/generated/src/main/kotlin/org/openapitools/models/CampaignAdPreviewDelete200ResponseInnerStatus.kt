@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignAdPreviewDelete200ResponseInnerStatus(
    @field:JsonProperty("statusCode")
    val statusCode: java.math.BigDecimal,

    @field:JsonProperty("code")
    val code: kotlin.Int,

    @field:JsonProperty("message")
    val message: kotlin.String,

)
