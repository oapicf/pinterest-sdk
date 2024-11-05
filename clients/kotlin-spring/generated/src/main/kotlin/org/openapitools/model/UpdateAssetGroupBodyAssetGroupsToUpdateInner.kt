package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetGroupType
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
 * @param assetGroupId Unique identifier of the asset group to update.
 * @param name Asset Group name
 * @param description Asset group description
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @param assetsToAdd A list of asset ids to add to the asset group.
 * @param assetsToRemove A list of asset ids to remove from the asset group.
 */
data class UpdateAssetGroupBodyAssetGroupsToUpdateInner(

    @Schema(example = "666791336903426391", required = true, description = "Unique identifier of the asset group to update.")
    @get:JsonProperty("asset_group_id", required = true) val assetGroupId: kotlin.String,

    @Schema(example = "Canada Ad Accounts", description = "Asset Group name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "Asset groups that has ad accounts shared in Canada", description = "Asset group description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", description = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
    @get:JsonProperty("asset_group_types") val assetGroupTypes: kotlin.collections.List<AssetGroupType>? = null,

    @Schema(example = "null", description = "A list of asset ids to add to the asset group.")
    @get:JsonProperty("assets_to_add") val assetsToAdd: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "A list of asset ids to remove from the asset group.")
    @get:JsonProperty("assets_to_remove") val assetsToRemove: kotlin.collections.List<kotlin.String>? = null
    ) {

}

