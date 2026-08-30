package org.openapitools.server.api.model

import org.openapitools.server.api.model.UserBusinessRoleBinding
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetBusinessEmployers200Response(
    val items: kotlin.collections.List<UserBusinessRoleBinding>,
    val bookmark: kotlin.String? = null
)
