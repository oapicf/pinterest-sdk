@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountsAudienceCreate(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("audience_type")
    val audienceType: AudienceType? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("rule")
    val rule: AdAccountsAudienceRule? = null,

)
