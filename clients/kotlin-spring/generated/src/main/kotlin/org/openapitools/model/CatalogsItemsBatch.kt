package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BatchOperationStatus
import org.openapitools.model.CatalogsCreativeAssetsItemsBatch
import org.openapitools.model.CatalogsHotelItemsBatch
import org.openapitools.model.CatalogsRetailItemsBatch
import org.openapitools.model.CatalogsType
import org.openapitools.model.CreativeAssetsProcessingRecord
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
 * Object describing the catalogs items batch
 * @param catalogType 
 * @param batchId Id of the catalogs items batch
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param status 
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsItemsBatch::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelItemsBatch::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailItemsBatch::class, name = "RETAIL")
)

interface CatalogsItemsBatch{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", description = "Id of the catalogs items batch")
        val batchId: kotlin.String? 

                @get:Schema(example = "null", readOnly = true, description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
        val createdTime: java.time.OffsetDateTime? 

                @get:Schema(example = "null", readOnly = true, description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
        val completedTime: java.time.OffsetDateTime? 

                @get:Schema(example = "null", description = "")
        val status: BatchOperationStatus? 

                @get:Schema(example = "null", description = "Array with the catalogs items processing records part of the catalogs items batch")
        val items: kotlin.collections.List<CreativeAssetsProcessingRecord>? 


}

