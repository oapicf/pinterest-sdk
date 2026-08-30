@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsReportFeedIngestionStats(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("code_label")
    val codeLabel: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("occurrences")
    val occurrences: kotlin.Int? = null,

    @field:JsonProperty("report_type")
    val reportType: kotlin.String? = null,

    @field:JsonProperty("severity")
    val severity: kotlin.String? = null,

)
