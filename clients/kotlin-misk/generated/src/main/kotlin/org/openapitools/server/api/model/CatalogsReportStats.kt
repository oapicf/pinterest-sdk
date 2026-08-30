package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsReportDistributionStats
import org.openapitools.server.api.model.CatalogsReportFeedIngestionStats
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReportStats(
    /** ID of the catalog entity. */
    val catalogId: kotlin.String? = null,
    /** The event code that a diagnostics aggregated number references */
    val code: kotlin.Int? = null,
    /** A human-friendly label for the event code (e.g, &#39;SPAM&#39;) */
    val codeLabel: kotlin.String? = null,
    /** Title message describing the diagnostic issue */
    val message: kotlin.String? = null,
    /** Number of occurrences of the issue */
    val occurrences: kotlin.Int? = null,
    val reportType: kotlin.String? = null,
    /** An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue */
    val severity: kotlin.String? = null,
    /** Indicates if issue makes items ineligible for ads distribution */
    val ineligibleForAds: kotlin.Boolean? = null,
    /** Indicates if issue makes items ineligible for organic distribution */
    val ineligibleForOrganic: kotlin.Boolean? = null
)
