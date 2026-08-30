package org.openapitools.server.api.model

import org.openapitools.server.api.model.UserWebsite
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserWebsitesGet200Response(
    val items: kotlin.collections.List<UserWebsite>,
    val bookmark: kotlin.String? = null
)
