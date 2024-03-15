package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelBatchItem
import org.openapitools.model.CatalogsHotelBatchRequest
import org.openapitools.model.CatalogsRetailBatchRequest
import org.openapitools.model.CatalogsType
import org.openapitools.model.Country
import org.openapitools.model.Language
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
 * A request object that can have multiple operations on a single batch
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with catalogs item operations
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelBatchRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailBatchRequest::class, name = "RETAIL")
)

interface CatalogsVerticalBatchRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val country: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val language: Language

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "Array with catalogs item operations")
        val items: kotlin.collections.List<CatalogsHotelBatchItem>

                @get:Schema(example = "2680059592705", description = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
        val catalogId: kotlin.String? 


}

