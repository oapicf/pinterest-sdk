package org.openapitools.server.api.model

import org.openapitools.server.api.model.CustomerListStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerList(
    /** Customer list ID. */
    val id: kotlin.String,
    /** Customer list name. */
    val name: kotlin.String,
    /** Associated ad account ID. */
    val adAccountId: kotlin.String? = null,
    /** Creation time. Unix timestamp in seconds. */
    val createdTime: java.math.BigDecimal? = null,
    /** Customer list errors. */
    val exceptions: kotlin.Any? = null,
    /** Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
    val isNca: kotlin.Boolean? = null,
    /** Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. */
    val numBatches: java.math.BigDecimal? = null,
    /** Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. */
    val numRemovedUserRecords: java.math.BigDecimal? = null,
    /** Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. */
    val numUploadedUserRecords: java.math.BigDecimal? = null,
    /** Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. */
    val status: CustomerListStatus? = null,
    /** Always &#x60;customerlist&#x60;. */
    val type: kotlin.String? = null,
    /** Last update time. Unix timestamp in seconds. */
    val updatedTime: java.math.BigDecimal? = null
)
