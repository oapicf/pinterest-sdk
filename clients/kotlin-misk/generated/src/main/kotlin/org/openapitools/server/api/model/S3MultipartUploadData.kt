package org.openapitools.server.api.model

import org.openapitools.server.api.model.S3FilePart
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class S3MultipartUploadData(
    /** Array of file parts with pre-signed URLs. */
    val fileParts: kotlin.collections.List<S3FilePart>? = null
)
