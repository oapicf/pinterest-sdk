package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsReportDistributionIssueFilter
import org.openapitools.server.api.model.CatalogsReportFeedIngestionFilter
import org.openapitools.server.api.model.CatalogsRetailReportAllItemsFilter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailReportParametersReport(
    /** ID of the feed entity. */
    val feedId: kotlin.String,
    val reportType: kotlin.String,
    /** Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    val processingResultId: kotlin.String? = null,
    /** Unique identifier of a catalog. If not given, oldest catalog will be used */
    val catalogId: kotlin.String? = null,
    /** Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
    val productGroupId: kotlin.String? = null
)
