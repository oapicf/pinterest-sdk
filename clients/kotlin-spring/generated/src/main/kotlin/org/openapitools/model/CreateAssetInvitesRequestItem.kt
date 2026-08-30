package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.InviteType
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
 * Object declaring an asset role update to an invite.
 * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
 * @param inviteId Unique identifier of an invite.
 * @param inviteType 
 */
data class CreateAssetInvitesRequestItem(

    @Schema(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, description = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.")
    @param:JsonProperty("asset_id_to_permissions")
    @get:JsonProperty("asset_id_to_permissions", required = true) val assetIdToPermissions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<Permissions>>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234567890123", required = true, description = "Unique identifier of an invite.")
    @param:JsonProperty("invite_id")
    @get:JsonProperty("invite_id", required = true) val inviteId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("invite_type")
    @get:JsonProperty("invite_type", required = true) val inviteType: InviteType
) {

}

