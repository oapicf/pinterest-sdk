package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BatchOperationStatus
import org.openapitools.model.CatalogsType
import org.openapitools.model.ItemProcessingRecord
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
 * Object describing the catalogs retail items batch
 * @param catalogType 
 * @param batchId Id of the catalogs items batch
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param status 
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 */
data class CatalogsRetailItemsBatch(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @Schema(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", description = "Id of the catalogs items batch")
    @get:JsonProperty("batch_id") val batchId: kotlin.String? = null,

    @Schema(example = "null", readOnly = true, description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
    @get:JsonProperty("created_time") val createdTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", readOnly = true, description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
    @get:JsonProperty("completed_time") val completedTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: BatchOperationStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "Array with the catalogs items processing records part of the catalogs items batch")
    @get:JsonProperty("items") val items: kotlin.collections.List<ItemProcessingRecord>? = null
    ) {

}

