package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsType
import org.openapitools.model.ItemValidationEvent
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
 * Object describing a creative assets item error
 * @param catalogType 
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
data class CatalogsCreativeAssetsItemErrorResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @Schema(example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace")
    @get:JsonProperty("creative_assets_id") val creativeAssetsId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Array with the errors for the item id requested")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<ItemValidationEvent>? = null
    ) {

}

