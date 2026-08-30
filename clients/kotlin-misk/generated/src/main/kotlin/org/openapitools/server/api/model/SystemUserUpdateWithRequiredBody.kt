package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SystemUserUpdateWithRequiredBody(
    /** New system user name */
    val name: kotlin.String
)
