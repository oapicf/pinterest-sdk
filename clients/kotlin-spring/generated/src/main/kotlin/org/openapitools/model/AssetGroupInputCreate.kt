package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AssetGroupBinding
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
 * @param assetGroupDescription Asset group description.
 * @param assetGroupName Asset Group name.
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @param assetGroup 
 */
data class AssetGroupInputCreate(

    @Schema(example = "Asset groups that has ad accounts shared in Canada", required = true, description = "Asset group description.")
    @param:JsonProperty("asset_group_description")
    @get:JsonProperty("asset_group_description", required = true) val assetGroupDescription: kotlin.String,

    @Schema(example = "Canada Ad Accounts", required = true, description = "Asset Group name.")
    @param:JsonProperty("asset_group_name")
    @get:JsonProperty("asset_group_name", required = true) val assetGroupName: kotlin.String,

    @field:Valid
    @Schema(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", required = true, description = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
    @param:JsonProperty("asset_group_types")
    @get:JsonProperty("asset_group_types", required = true) val assetGroupTypes: kotlin.collections.List<AssetGroupType>,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_group")
    @get:JsonProperty("asset_group") val assetGroup: AssetGroupBinding? = null
) {

}

