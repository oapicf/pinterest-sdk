package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelProductGroupFilters
import org.openapitools.model.CatalogsHotelProductGroupUpdateRequest
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
 * Request object for updating a hotel product group.
 * @param catalogType 
 * @param name 
 * @param description 
 * @param filters 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelProductGroupUpdateRequest::class, name = "HOTEL")
)

interface CatalogsVerticalProductGroupUpdateRequest{
                @get:Schema(example = "null", description = "")
        val catalogType: CatalogsVerticalProductGroupUpdateRequest.CatalogType? 

                @get:Schema(example = "null", description = "")
        val name: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val description: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val filters: CatalogsHotelProductGroupFilters? 


    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(val value: kotlin.String) {

        @JsonProperty("HOTEL") HOTEL("HOTEL")
    }

}

