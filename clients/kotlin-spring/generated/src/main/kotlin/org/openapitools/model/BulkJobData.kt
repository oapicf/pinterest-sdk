package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BulkRequestStatus
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Bulk request result data.
 * @param status 
 * @param resultUrl Presigned s3 file url for the bulk request result.
 * @param workloadId Bulk Workload Id.
 */
data class BulkJobData(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("status", required = true)
    @get:JsonProperty("status", required = true) val status: BulkRequestStatus,

    @Schema(description = "Presigned s3 file url for the bulk request result.")
    @param:JsonProperty("result_url")
    @get:JsonProperty("result_url") val resultUrl: kotlin.String? = null,

    @Schema(description = "Bulk Workload Id.")
    @param:JsonProperty("workload_id")
    @get:JsonProperty("workload_id") val workloadId: kotlin.Int? = null
) {

}

