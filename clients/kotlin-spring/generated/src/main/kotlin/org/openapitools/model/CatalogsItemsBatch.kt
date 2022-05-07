package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BatchOperationStatus
import org.openapitools.model.ItemProcessingRecord
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Object describing the catalogs items batch
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 * @param batchId Id of the catalogs items batch
 * @param createdTime Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
 * @param completedTime Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
 * @param status 
 */
data class CatalogsItemsBatch(

    @field:Valid
    @field:JsonProperty("items") val items: kotlin.collections.List<ItemProcessingRecord>? = null,

    @field:JsonProperty("batch_id") val batchId: kotlin.String? = null,

    @field:JsonProperty("created_time") val createdTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("completed_time") val completedTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @field:JsonProperty("status") val status: BatchOperationStatus? = null
) {

}

