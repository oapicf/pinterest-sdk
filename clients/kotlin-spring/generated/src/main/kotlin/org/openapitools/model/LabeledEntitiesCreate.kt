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
 * @param entityIds Entity IDs to apply label to.
 */
data class LabeledEntitiesCreate(

    @Schema(required = true, description = "Entity IDs to apply label to.")
    @param:JsonProperty("entity_ids")
    @get:JsonProperty("entity_ids", required = true) val entityIds: kotlin.collections.List<kotlin.String>
) {

}

