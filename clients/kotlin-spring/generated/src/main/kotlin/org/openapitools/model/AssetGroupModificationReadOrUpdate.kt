package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AssetGroupBinding
import org.openapitools.model.AssetGroupUpdateError
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem
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
 * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
 * @param updatedAssetGroups A list of successfully edited asset groups.
 */
data class AssetGroupModificationReadOrUpdate(

    @field:Valid
    @Schema(description = "A list of asset groups and the data that will be used to update them.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_groups_to_update")
    @get:JsonProperty("asset_groups_to_update") val assetGroupsToUpdate: kotlin.collections.List<AssetGroupUpdateItemReadOrUpdateItem>? = null,

    @field:Valid
    @Schema(readOnly = true, description = "A list of errors associated with the asset groups. Will be returned if there is an error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<AssetGroupUpdateError>? = null,

    @field:Valid
    @Schema(readOnly = true, description = "A list of successfully edited asset groups.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_asset_groups")
    @get:JsonProperty("updated_asset_groups") val updatedAssetGroups: kotlin.collections.List<AssetGroupBinding>? = null
) {

}

