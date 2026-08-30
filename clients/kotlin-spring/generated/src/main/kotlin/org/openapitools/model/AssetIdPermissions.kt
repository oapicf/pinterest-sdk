package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AssetGroupBinding
import org.openapitools.model.AssetTypeResponse
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
 * An object containing the permissions a business member has on the asset.
 * @param assetId Unique identifier of a business asset.
 * @param assetType 
 * @param permissions Permission levels member or partner has on an asset.
 * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
 */
data class AssetIdPermissions(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(min=1,max=20)
    @Schema(example = "549755885175", required = true, description = "Unique identifier of a business asset.")
    @param:JsonProperty("asset_id")
    @get:JsonProperty("asset_id", required = true) val assetId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("asset_type")
    @get:JsonProperty("asset_type", required = true) val assetType: AssetTypeResponse,

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", required = true, description = "Permission levels member or partner has on an asset.")
    @param:JsonProperty("permissions")
    @get:JsonProperty("permissions", required = true) val permissions: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(description = "An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_group_info")
    @get:JsonProperty("asset_group_info") val assetGroupInfo: AssetGroupBinding? = null
) {

}

