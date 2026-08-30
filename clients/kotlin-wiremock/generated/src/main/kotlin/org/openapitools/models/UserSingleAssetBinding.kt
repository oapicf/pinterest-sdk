@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserSingleAssetBinding(
    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("user")
    val user: BusinessAccessUserSummary? = null,

)
