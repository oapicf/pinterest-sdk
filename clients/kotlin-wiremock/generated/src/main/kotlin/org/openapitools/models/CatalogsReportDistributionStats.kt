@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsReportDistributionStats(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("code_label")
    val codeLabel: kotlin.String? = null,

    @field:JsonProperty("ineligible_for_ads")
    val ineligibleForAds: kotlin.Boolean? = null,

    @field:JsonProperty("ineligible_for_organic")
    val ineligibleForOrganic: kotlin.Boolean? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("occurrences")
    val occurrences: kotlin.Int? = null,

    @field:JsonProperty("report_type")
    val reportType: kotlin.String? = null,

)
