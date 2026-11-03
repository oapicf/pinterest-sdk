package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LeadForm
import org.openapitools.model.PinterestLibBatchItemException
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
 * @param `data` 
 * @param exceptions 
 */
data class LeadFormsCreate200ResponseItemsInner(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("data")
    @get:JsonProperty("data") val `data`: LeadForm? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<PinterestLibBatchItemException>? = null
) {

}

