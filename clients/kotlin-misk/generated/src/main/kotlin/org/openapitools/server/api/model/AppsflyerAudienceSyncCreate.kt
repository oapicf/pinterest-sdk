package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AppsflyerAudienceSyncCreate(
    /** The container ID of the audience */
    val containerId: kotlin.String,
    /** The pre-signed URL for SHA256 hashed GAID/IDFA file */
    val urlAdidSha256: kotlin.String? = null,
    /** The pre-signed URL for SHA256 hashed email file */
    val urlEmailSha256: kotlin.String? = null
)
