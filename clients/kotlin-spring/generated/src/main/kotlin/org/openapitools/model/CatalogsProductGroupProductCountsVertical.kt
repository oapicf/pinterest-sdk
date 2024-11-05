package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsProductGroupProductCounts
import org.openapitools.model.CatalogsHotelProductGroupProductCounts
import org.openapitools.model.CatalogsRetailProductGroupProductCounts
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
 * Product counts for a CatalogsProductGroup
 * @param catalogType 
 * @param inStock 
 * @param outOfStock 
 * @param preorder 
 * @param total 
 * @param videos 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupProductCounts::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelProductGroupProductCounts::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailProductGroupProductCounts::class, name = "RETAIL")
)

interface CatalogsProductGroupProductCountsVertical{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val inStock: java.math.BigDecimal

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val outOfStock: java.math.BigDecimal

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val preorder: java.math.BigDecimal

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val total: java.math.BigDecimal

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val videos: java.math.BigDecimal


}

