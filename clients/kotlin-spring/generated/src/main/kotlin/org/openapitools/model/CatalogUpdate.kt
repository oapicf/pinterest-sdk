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
 * Resource create or update operation model.
 * @param catalogType 
 * @param name A human-friendly name associated to a catalog entity.
 */
data class CatalogUpdate(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type") val catalogType: CatalogsType? = null,

    @Schema(description = "A human-friendly name associated to a catalog entity.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

