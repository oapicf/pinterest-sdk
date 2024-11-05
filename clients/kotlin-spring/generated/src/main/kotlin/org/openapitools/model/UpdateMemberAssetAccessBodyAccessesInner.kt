package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Permissions
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
 * @param assetId Id of the asset to update.
 * @param memberId Unique identifier of the member on which to perform the update
 * @param permissions A non-empty array of permissions to assign to the member.
 */
data class UpdateMemberAssetAccessBodyAccessesInner(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "549755885175", required = true, description = "Id of the asset to update.")
    @get:JsonProperty("asset_id", required = true) val assetId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "140943737684417", required = true, description = "Unique identifier of the member on which to perform the update")
    @get:JsonProperty("member_id", required = true) val memberId: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=50) 
    @Schema(example = "[\"ANALYST\",\"ADMIN\"]", required = true, description = "A non-empty array of permissions to assign to the member.")
    @get:JsonProperty("permissions", required = true) val permissions: kotlin.collections.List<Permissions>
    ) {

}

