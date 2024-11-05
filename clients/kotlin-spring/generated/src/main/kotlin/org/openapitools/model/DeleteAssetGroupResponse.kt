package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner
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
 * @param deletedAssetGroups A list of ids of successfully deleted asset groups.
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
 */
data class DeleteAssetGroupResponse(

    @Schema(example = "null", description = "A list of ids of successfully deleted asset groups.")
    @get:JsonProperty("deleted_asset_groups") val deletedAssetGroups: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "A list of errors associated with the asset groups. Will be returned if there is an error.")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<DeleteAssetGroupResponseExceptionsInner>? = null
    ) {

}

