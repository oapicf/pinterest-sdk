package org.openapitools.server.api.model

import org.openapitools.server.api.model.UserSingleAssetBinding
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessAssetMembersGet200Response(
    val items: kotlin.collections.List<UserSingleAssetBinding>,
    val bookmark: kotlin.String? = null
)
