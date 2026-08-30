package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReportDistributionIssueFilter(
    val reportType: kotlin.String,
    /** Unique identifier of a catalog. If not given, oldest catalog will be used */
    val catalogId: kotlin.String? = null
)
