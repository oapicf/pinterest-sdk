package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class S3FilePart(
    /** Part number for upload. */
    val partNumber: kotlin.Int,
    /** Pre-signed URL. */
    val presignedUrl: kotlin.String
)
