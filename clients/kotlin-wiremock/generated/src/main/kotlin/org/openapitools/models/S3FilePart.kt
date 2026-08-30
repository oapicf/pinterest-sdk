@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class S3FilePart(
    @field:JsonProperty("part_number")
    val partNumber: kotlin.Int,

    @field:JsonProperty("presigned_url")
    val presignedUrl: kotlin.String,

)
