@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAssetAccessRequestResponse(
    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<AssetAccessRequestError>? = null,

    @field:JsonProperty("invites")
    val invites: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

)
