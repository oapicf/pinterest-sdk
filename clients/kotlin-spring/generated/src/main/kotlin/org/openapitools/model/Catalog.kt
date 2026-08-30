package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsType
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
 * Catalog entity
 * @param catalogType 
 * @param createdAt 
 * @param id ID of the catalog entity.
 * @param name A human-friendly name associated to a catalog entity.
 * @param updatedAt 
 */
data class Catalog(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @Schema(example = "2022-03-14T15:15:22Z", required = true, readOnly = true, description = "")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: java.time.OffsetDateTime,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "864344156814050986", required = true, description = "ID of the catalog entity.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "A human-friendly name associated to a catalog entity.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "2022-03-14T15:16:34Z", required = true, readOnly = true, description = "")
    @param:JsonProperty("updated_at")
    @get:JsonProperty("updated_at", required = true) val updatedAt: java.time.OffsetDateTime
) {

}

