package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailReportAllItemsFilter(
    val reportType: kotlin.String,
    /** Unique identifier of a catalog. If not given, oldest catalog will be used */
    val catalogId: kotlin.String? = null,
    /** Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
    val productGroupId: kotlin.String? = null
)
