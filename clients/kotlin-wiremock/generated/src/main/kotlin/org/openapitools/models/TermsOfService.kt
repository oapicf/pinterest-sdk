@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TermsOfService(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("has_accepted")
    val hasAccepted: kotlin.Boolean? = null,

    @field:JsonProperty("html")
    val html: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

)
