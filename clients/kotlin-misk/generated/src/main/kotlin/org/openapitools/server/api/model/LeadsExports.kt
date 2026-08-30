package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadsExports(
    /** ID for the leads export job. */
    val leadsExportId: kotlin.String? = null
)
