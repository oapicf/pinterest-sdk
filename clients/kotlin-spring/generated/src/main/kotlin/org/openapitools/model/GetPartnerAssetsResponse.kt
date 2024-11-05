package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetGroupBinding
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
 * An object containing the permissions a you/your business partner has on the asset.
 * @param assetId Unique identifier of a business asset.
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @param permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
 * @param assetGroupInfo 
 */
data class GetPartnerAssetsResponse(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(min=1,max=20)
    @Schema(example = "549755885175", description = "Unique identifier of a business asset.")
    @get:JsonProperty("asset_id") val assetId: kotlin.String? = null,

    @Schema(example = "AD_ACCOUNT", description = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
    @get:JsonProperty("asset_type") val assetType: kotlin.String? = null,

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asset_group_info") val assetGroupInfo: AssetGroupBinding? = null
    ) {

}

