package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReportFeedIngestionFilter(
    /** ID of the feed entity. */
    val feedId: kotlin.String,
    val reportType: kotlin.String,
    /** Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    val processingResultId: kotlin.String? = null
)
