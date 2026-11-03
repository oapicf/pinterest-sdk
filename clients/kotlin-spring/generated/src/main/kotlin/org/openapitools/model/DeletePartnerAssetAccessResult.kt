package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * The terminated asset access.
 * @param assetId Unique identifier of a business asset.
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 * @param isSharedPartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
 * @param partnerId Unique identifier of a business partner.
 * @param permissions Permission levels member or partner has on an asset.
 */
data class DeletePartnerAssetAccessResult(

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Unique identifier of a business asset.")
    @param:JsonProperty("asset_id")
    @get:JsonProperty("asset_id") val assetId: kotlin.String? = null,

    @Schema(description = "Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.")
    @param:JsonProperty("asset_type")
    @get:JsonProperty("asset_type") val assetType: kotlin.String? = null,

    @Schema(description = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.")
    @param:JsonProperty("is_shared_partner")
    @get:JsonProperty("is_shared_partner") val isSharedPartner: kotlin.Boolean? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Unique identifier of a business partner.")
    @param:JsonProperty("partner_id")
    @get:JsonProperty("partner_id") val partnerId: kotlin.String? = null,

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.")
    @param:JsonProperty("permissions")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null
) {

}

