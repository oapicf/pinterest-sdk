@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DynamicTitlesUploadURL(
    @field:JsonProperty("request_id")
    val requestId: kotlin.String,

    @field:JsonProperty("upload_url")
    val uploadUrl: kotlin.String,

    @field:JsonProperty("existing_filename")
    val existingFilename: kotlin.String? = null,

)
