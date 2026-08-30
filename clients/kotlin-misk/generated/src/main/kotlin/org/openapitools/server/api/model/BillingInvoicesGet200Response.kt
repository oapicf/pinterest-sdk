package org.openapitools.server.api.model

import org.openapitools.server.api.model.BillingInvoice
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BillingInvoicesGet200Response(
    val items: kotlin.collections.List<BillingInvoice>,
    val bookmark: kotlin.String? = null
)
