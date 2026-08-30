package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOInsertionOrderStatusResponse(
    /** Salesforce insertion order creation time */
    val creationTime: kotlin.String? = null,
    /** Salesforce order id */
    val pinOrderId: kotlin.String? = null,
    /** Salesforce insertion order status */
    val status: kotlin.String? = null
)
