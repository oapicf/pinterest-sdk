package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreativeAssetsVisibilityType
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
 * Creative assets product metadata entity
 * @param creativeAssetsId The user-created unique ID that represents the creative assets item.
 * @param visibility 
 */
data class CatalogsCreativeAssetsProductMetadata(

    @Schema(example = "123abc", required = true, description = "The user-created unique ID that represents the creative assets item.")
    @get:JsonProperty("creative_assets_id", required = true) val creativeAssetsId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("visibility", required = true) val visibility: CreativeAssetsVisibilityType
    ) {

}

