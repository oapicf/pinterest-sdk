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
 * An object containing the permissions a business member has on the asset.
 * @param assetId Unique identifier of a business asset.
 * @param memberId Unique identifier of the business member with asset access.
 * @param permissions Permission levels member or partner has on an asset.
 */
data class UsersForIndividualAssetResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Unique identifier of a business asset.")
    @get:JsonProperty("asset_id") val assetId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "140943737684417", description = "Unique identifier of the business member with asset access.")
    @get:JsonProperty("member_id") val memberId: kotlin.String? = null,

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null
    ) {

}

