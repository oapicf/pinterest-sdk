package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ImageDetails
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param images 
 */
data class PinMediaWithImageAllOf(

    @field:Valid
    @field:JsonProperty("images") val images: kotlin.collections.Map<kotlin.String, ImageDetails>? = null
) {

}

