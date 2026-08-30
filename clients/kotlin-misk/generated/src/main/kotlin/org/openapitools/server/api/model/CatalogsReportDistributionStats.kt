package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReportDistributionStats(
    /** ID of the catalog entity. */
    val catalogId: kotlin.String? = null,
    /** The event code that a diagnostics aggregated number references */
    val code: kotlin.Int? = null,
    /** A human-friendly label for the event code (e.g, &#39;SPAM&#39;) */
    val codeLabel: kotlin.String? = null,
    /** Indicates if issue makes items ineligible for ads distribution */
    val ineligibleForAds: kotlin.Boolean? = null,
    /** Indicates if issue makes items ineligible for organic distribution */
    val ineligibleForOrganic: kotlin.Boolean? = null,
    /** Title message describing the diagnostic issue */
    val message: kotlin.String? = null,
    /** Number of occurrences of the issue */
    val occurrences: kotlin.Int? = null,
    val reportType: kotlin.String? = null
)
