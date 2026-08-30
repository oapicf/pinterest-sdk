package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @param assetsToAdd A list of asset ids to add to the asset group.
 * @param assetsToRemove A list of asset ids to remove from the asset group.
 * @param description Asset group description.
 * @param name Asset Group name.
 */
data class AssetGroupUpdateItemReadOrUpdateItem(

    @Schema(required = true, description = "Unique identifier of the asset group to update.")
    @param:JsonProperty("asset_group_id")
    @get:JsonProperty("asset_group_id", required = true) val assetGroupId: kotlin.String,

    @field:Valid
    @Schema(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", description = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_group_types")
    @get:JsonProperty("asset_group_types") val assetGroupTypes: kotlin.collections.List<AssetGroupType>? = null,

    @Schema(description = "A list of asset ids to add to the asset group.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("assets_to_add")
    @get:JsonProperty("assets_to_add") val assetsToAdd: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "A list of asset ids to remove from the asset group.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("assets_to_remove")
    @get:JsonProperty("assets_to_remove") val assetsToRemove: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Asset group description.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(description = "Asset Group name.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

