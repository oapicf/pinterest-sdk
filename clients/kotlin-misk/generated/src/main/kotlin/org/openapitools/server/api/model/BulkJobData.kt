package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkRequestStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkJobData(
    val status: BulkRequestStatus,
    /** Presigned s3 file url for the bulk request result. */
    val resultUrl: kotlin.String? = null,
    /** Bulk Workload Id. */
    val workloadId: kotlin.Int? = null
)
