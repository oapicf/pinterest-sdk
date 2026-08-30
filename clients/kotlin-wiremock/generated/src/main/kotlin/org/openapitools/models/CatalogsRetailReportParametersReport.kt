@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailReportParametersReport(
    @field:JsonProperty("feed_id")
    val feedId: kotlin.String,

    @field:JsonProperty("report_type")
    val reportType: kotlin.String,

    @field:JsonProperty("processing_result_id")
    val processingResultId: kotlin.String? = null,

    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

    @field:JsonProperty("product_group_id")
    val productGroupId: kotlin.String? = null,

)
