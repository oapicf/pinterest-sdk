package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DeletePartnerAssetAccessItem
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
 * An object with a list of partner asset accesses to delete.
 * @param accesses List of partner asset accesses to delete.
 */
data class DeletePartnerAssetAccessBody(

    @field:Valid
    @get:Size(min=1,max=50) 
    @Schema(required = true, description = "List of partner asset accesses to delete.")
    @param:JsonProperty("accesses")
    @get:JsonProperty("accesses", required = true) val accesses: kotlin.collections.List<DeletePartnerAssetAccessItem>
) {

}

