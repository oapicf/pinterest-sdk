package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DeletePartnerAssetAccessResult
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
 * @param items List of terminated partner asset accesses.
 */
data class DeletePartnerAssetAccessResultsResponseArray(

    @field:Valid
    @Schema(description = "List of terminated partner asset accesses.")
    @param:JsonProperty("items")
    @get:JsonProperty("items") val items: kotlin.collections.List<DeletePartnerAssetAccessResult>? = null
) {

}

