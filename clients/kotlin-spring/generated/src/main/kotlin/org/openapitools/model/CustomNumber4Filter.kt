package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupUint32Criteria
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
 * @param CUSTOM_NUMBER_4 
 */
data class CustomNumber4Filter(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_NUMBER_4")
    @get:JsonProperty("CUSTOM_NUMBER_4", required = true) val CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria
) {

}

