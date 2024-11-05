package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Request object for creating a catalog.
 * @param catalogType Type of the catalog entity.
 * @param name A human-friendly name associated to a given catalog.
 */
data class CatalogsCreateRequest(

    @Schema(example = "null", required = true, description = "Type of the catalog entity.")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsCreateRequest.CatalogType,

    @Schema(example = "null", required = true, description = "A human-friendly name associated to a given catalog.")
    @get:JsonProperty("name", required = true) val name: kotlin.String
    ) {

    /**
    * Type of the catalog entity.
    * Values: HOTEL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        HOTEL("HOTEL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

