@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrackingUrls(
    @field:JsonProperty("audience_verification")
    val audienceVerification: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("buyable_button")
    val buyableButton: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("click")
    val click: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("engagement")
    val engagement: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("impression")
    val impression: kotlin.collections.List<kotlin.String>? = null,

)
