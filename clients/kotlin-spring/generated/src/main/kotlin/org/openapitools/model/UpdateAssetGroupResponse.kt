package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetGroupBinding
import org.openapitools.model.UpdateAssetGroupResponseExceptionsInner
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
 * @param updatedAssetGroups A list of successfully edited asset groups.
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
 */
data class UpdateAssetGroupResponse(

    @field:Valid
    @Schema(example = "null", description = "A list of successfully edited asset groups.")
    @get:JsonProperty("updated_asset_groups") val updatedAssetGroups: kotlin.collections.List<AssetGroupBinding>? = null,

    @field:Valid
    @Schema(example = "null", description = "A list of errors associated with the asset groups. Will be returned if there is an error.")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<UpdateAssetGroupResponseExceptionsInner>? = null
    ) {

}

