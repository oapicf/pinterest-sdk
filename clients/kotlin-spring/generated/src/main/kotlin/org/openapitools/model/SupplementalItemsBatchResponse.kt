package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.SupplementalItemBatchOperationStatus
import org.openapitools.model.SupplementalOperationResult
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
 * Response model for supplemental items batch operation
 * @param batchId Id of the batch operation
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param operationResults Array of operation results
 * @param status Status of the batch: PROCESSING, COMPLETED, FAILED
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 */
data class SupplementalItemsBatchResponse(

    @Schema(example = "66753b9bb65c46c49bd", required = true, readOnly = true, description = "Id of the batch operation")
    @param:JsonProperty("batch_id")
    @get:JsonProperty("batch_id", required = true) val batchId: kotlin.String,

    @Schema(example = "2022-03-14T15:15:22Z", required = true, readOnly = true, description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time", required = true) val createdTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Array of operation results")
    @param:JsonProperty("operation_results")
    @get:JsonProperty("operation_results", required = true) val operationResults: kotlin.collections.List<SupplementalOperationResult>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Status of the batch: PROCESSING, COMPLETED, FAILED")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: SupplementalItemBatchOperationStatus,

    @Schema(example = "2022-03-14T15:16:34Z", readOnly = true, description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("completed_time")
    @get:JsonProperty("completed_time") val completedTime: java.time.OffsetDateTime? = null
) {

}

