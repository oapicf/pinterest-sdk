@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BillingInvoiceDownloadResponse(
    @field:JsonProperty("download_url")
    val downloadUrl: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

)
