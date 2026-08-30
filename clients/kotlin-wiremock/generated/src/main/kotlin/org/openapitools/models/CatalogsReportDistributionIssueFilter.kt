@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsReportDistributionIssueFilter(
    @field:JsonProperty("report_type")
    val reportType: kotlin.String,

    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

)
