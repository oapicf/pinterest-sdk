@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SharedAudienceAccount(
    @field:JsonProperty("account_id")
    val accountId: kotlin.String,

    @field:JsonProperty("account_name")
    val accountName: kotlin.String,

    @field:JsonProperty("account_type")
    val accountType: AudienceAccountType,

    @field:JsonProperty("shared_on_timestamp")
    val sharedOnTimestamp: kotlin.Int,

)
