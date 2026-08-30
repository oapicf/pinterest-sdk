package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadsExportStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadsExportResponseData(
    val downloadUrl: kotlin.String? = null,
    val exportStatus: LeadsExportStatus? = null
)
