package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BulkUpsertRequestCreate
import org.openapitools.model.BulkUpsertRequestUpdate
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
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 * @param create 
 * @param update 
 */
data class BulkUpsertRequest(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("create")
    @get:JsonProperty("create") val create: BulkUpsertRequestCreate? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("update")
    @get:JsonProperty("update") val update: BulkUpsertRequestUpdate? = null
) {

}

