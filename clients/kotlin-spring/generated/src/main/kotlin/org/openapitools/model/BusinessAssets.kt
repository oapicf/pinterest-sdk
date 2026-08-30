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
import org.openapitools.model.CatalogBinding
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
 * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
 * @param assetId Unique identifier of a business asset.
 * @param assetType 
 * @param permissions Permission levels the requesting business has on an asset.
 * @param catalogInfo An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 */
data class BusinessAssets(

    @field:Valid
    @Schema(description = "An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_group_info")
    @get:JsonProperty("asset_group_info") val assetGroupInfo: AssetGroupBinding? = null,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(min=1,max=20)
    @Schema(example = "549755885175", description = "Unique identifier of a business asset.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_id")
    @get:JsonProperty("asset_id") val assetId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_type")
    @get:JsonProperty("asset_type") val assetType: AssetTypeResponse? = null,

    @Schema(example = "[FINANCE_MANAGER, CATALOGS_MANAGER, AUDIENCE_MANAGER]", description = "Permission levels the requesting business has on an asset.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("permissions")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_info")
    @get:JsonProperty("catalog_info") val catalogInfo: CatalogBinding? = null
) {

}

