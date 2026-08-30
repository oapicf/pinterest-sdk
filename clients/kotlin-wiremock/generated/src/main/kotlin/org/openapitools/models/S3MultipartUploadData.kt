@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class S3MultipartUploadData(
    @field:JsonProperty("file_parts")
    val fileParts: kotlin.collections.List<S3FilePart>? = null,

)
