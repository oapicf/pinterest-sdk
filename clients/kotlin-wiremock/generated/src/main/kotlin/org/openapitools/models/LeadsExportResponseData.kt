@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadsExportResponseData(
    @field:JsonProperty("download_url")
    val downloadUrl: kotlin.String? = null,

    @field:JsonProperty("export_status")
    val exportStatus: LeadsExportStatus? = null,

)
