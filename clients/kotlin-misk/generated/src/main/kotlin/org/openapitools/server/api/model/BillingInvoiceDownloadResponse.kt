package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BillingInvoiceDownloadResponse(
    /** The download url for the billing invoice */
    val downloadUrl: kotlin.String? = null,
    /** The billing invoice id */
    val id: kotlin.String? = null
)
