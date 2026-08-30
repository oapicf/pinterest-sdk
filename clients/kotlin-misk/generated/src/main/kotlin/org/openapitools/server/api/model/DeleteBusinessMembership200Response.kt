package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteBusinessMembership200Response(
    val deletedMembers: kotlin.collections.List<kotlin.String>? = null
)
