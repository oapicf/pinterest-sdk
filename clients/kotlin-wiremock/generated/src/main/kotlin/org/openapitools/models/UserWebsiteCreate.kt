@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserWebsiteCreate(
    @field:JsonProperty("verification_method")
    val verificationMethod: WebsiteVerificationMethod? = null,

    @field:JsonProperty("website")
    val website: kotlin.String? = null,

)
