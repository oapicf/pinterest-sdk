@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MediaUpload(
    @field:JsonProperty("media_id")
    val mediaId: kotlin.String,

    @field:JsonProperty("media_type")
    val mediaType: MediaUploadType,

    @field:JsonProperty("upload_parameters")
    val uploadParameters: MediaUploadParameters? = null,

    @field:JsonProperty("upload_url")
    val uploadUrl: kotlin.String? = null,

)
