@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkJobData(
    @field:JsonProperty("status")
    val status: BulkRequestStatus,

    @field:JsonProperty("result_url")
    val resultUrl: kotlin.String? = null,

    @field:JsonProperty("workload_id")
    val workloadId: kotlin.Int? = null,

)
