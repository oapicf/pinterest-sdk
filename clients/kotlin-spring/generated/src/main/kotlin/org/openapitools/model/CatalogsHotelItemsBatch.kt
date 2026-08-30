package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BatchOperationStatus
import org.openapitools.model.HotelProcessingRecord
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * Object describing the catalogs hotel items batch. If specified, you must provide all properties.
 * @param catalogType 
 * @param batchId Id of the catalogs items batch
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 * @param status 
 */
data class CatalogsHotelItemsBatch(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsHotelItemsBatch.CatalogType = kotlin.String.HOTEL,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "595953100599279259", description = "Id of the catalogs items batch")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("batch_id")
    @get:JsonProperty("batch_id") val batchId: kotlin.String? = null,

    @Schema(example = "2024-01-01T20:20Z", description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
    @param:JsonProperty("completed_time")
    @get:JsonProperty("completed_time") val completedTime: java.time.OffsetDateTime? = null,

    @Schema(example = "2024-01-01T20:10:40Z", description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(description = "Array with the catalogs items processing records part of the catalogs items batch")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("items")
    @get:JsonProperty("items") val items: kotlin.collections.List<HotelProcessingRecord>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: BatchOperationStatus? = null
) : CatalogsItemsBatch {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        HOTEL("HOTEL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

