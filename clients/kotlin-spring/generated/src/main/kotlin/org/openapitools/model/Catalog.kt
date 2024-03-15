package org.openapitools.model

import java.util.Objects
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
 * @param id ID of the catalog entity.
 * @param name A human-friendly name associated to a catalog entity.
 * @param catalogType 
 * @param createdAt 
 * @param updatedAt 
 */
data class Catalog(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "864344156814050986", required = true, description = "ID of the catalog entity.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "A human-friendly name associated to a catalog entity.")
    @get:JsonProperty("name", required = true) val name: kotlin.String?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @Schema(example = "2022-03-14T15:15:22Z", description = "")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "2022-03-14T15:16:34Z", description = "")
    @get:JsonProperty("updated_at") val updatedAt: java.time.OffsetDateTime? = null
) {

}

