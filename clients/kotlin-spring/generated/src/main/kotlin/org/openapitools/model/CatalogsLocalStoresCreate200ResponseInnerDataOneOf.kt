package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PinterestLibError
import com.fasterxml.jackson.annotation.JsonCreator
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
 * 
 * @param id The ID of the local store.
 * @param exceptions 
 */
data class CatalogsLocalStoresCreate200ResponseInnerDataOneOf(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234567890", required = true, description = "The ID of the local store.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("exceptions", required = true)
    @get:JsonProperty("exceptions", required = true) val exceptions: PinterestLibError
) : CatalogsLocalStoresCreate200ResponseInnerData {

}

