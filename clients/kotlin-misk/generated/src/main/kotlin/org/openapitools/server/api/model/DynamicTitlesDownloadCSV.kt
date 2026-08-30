package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DynamicTitlesDownloadCSV(
    /** Pre-signed S3 URL to download the CSV file. */
    val downloadUrl: kotlin.String? = null
)
