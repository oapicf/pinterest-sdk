package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsProduct
import org.openapitools.model.CatalogsCreativeAssetsProductMetadata
import org.openapitools.model.CatalogsHotelProduct
import org.openapitools.model.CatalogsRetailProduct
import org.openapitools.model.CatalogsType
import org.openapitools.model.Pin
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
 * Catalogs product for all verticals
 * @param catalogType 
 * @param metadata 
 * @param pin 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsProduct::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelProduct::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailProduct::class, name = "RETAIL")
)

interface CatalogsProduct{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val metadata: CatalogsCreativeAssetsProductMetadata

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val pin: Pin


}

