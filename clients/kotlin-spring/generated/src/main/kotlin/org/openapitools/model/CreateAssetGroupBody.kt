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
 * @param assetGroupName Asset Group name
 * @param assetGroupDescription Asset group description
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 */
data class CreateAssetGroupBody(

    @Schema(example = "Canada Ad Accounts", required = true, description = "Asset Group name")
    @get:JsonProperty("asset_group_name", required = true) val assetGroupName: kotlin.String,

    @Schema(example = "Asset groups that has ad accounts shared in Canada", required = true, description = "Asset group description")
    @get:JsonProperty("asset_group_description", required = true) val assetGroupDescription: kotlin.String,

    @field:Valid
    @Schema(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", required = true, description = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
    @get:JsonProperty("asset_group_types", required = true) val assetGroupTypes: kotlin.collections.List<AssetGroupType>
    ) {

}

