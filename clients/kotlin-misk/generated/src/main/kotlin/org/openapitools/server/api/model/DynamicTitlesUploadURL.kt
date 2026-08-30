package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DynamicTitlesUploadURL(
    /** Unique identifier for this upload session. Must be passed to the process endpoint. */
    val requestId: kotlin.String,
    /** Pre-signed S3 PUT URL to upload the reviewed CSV file. */
    val uploadUrl: kotlin.String,
    /** If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. */
    val existingFilename: kotlin.String? = null
)
