package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetGroupBinding
import org.openapitools.model.AssetGroupUpdateError
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
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
 * @param updatedAssetGroups A list of successfully edited asset groups.
 */
data class AssetGroupModification(

    @field:Valid
    @Schema(readOnly = true, description = "A list of errors associated with the asset groups. Will be returned if there is an error.")
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<AssetGroupUpdateError>? = null,

    @field:Valid
    @Schema(readOnly = true, description = "A list of successfully edited asset groups.")
    @param:JsonProperty("updated_asset_groups")
    @get:JsonProperty("updated_asset_groups") val updatedAssetGroups: kotlin.collections.List<AssetGroupBinding>? = null
) {

}

