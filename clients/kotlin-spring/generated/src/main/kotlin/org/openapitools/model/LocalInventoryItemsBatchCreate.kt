package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LocalInventoryOperation
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
 * @param operations Array of inventory operations. Up to 1000 items per request.
 */
data class LocalInventoryItemsBatchCreate(

    @field:Valid
    @get:Size(min=1,max=1000) 
    @Schema(required = true, description = "Array of inventory operations. Up to 1000 items per request.")
    @param:JsonProperty("operations")
    @get:JsonProperty("operations", required = true) val operations: kotlin.collections.List<LocalInventoryOperation>
) {

}

