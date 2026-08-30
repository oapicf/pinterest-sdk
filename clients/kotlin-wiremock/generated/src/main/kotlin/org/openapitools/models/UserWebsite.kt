@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserWebsite(
    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("verified_at")
    val verifiedAt: kotlin.String? = null,

    @field:JsonProperty("website")
    val website: kotlin.String? = null,

)
