package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOInsertionOrder(
    /** Salesforce order id */
    val pinOrderId: kotlin.String? = null
)
