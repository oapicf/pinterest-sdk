package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Resource create operation model.
 * @param name 
 * @param id 
 */
data class BoardSectionCreate(

    @get:Size(min=1,max=180)
    @Schema(example = "Salads", required = true, description = "")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "549755885175", description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null
) {

}

