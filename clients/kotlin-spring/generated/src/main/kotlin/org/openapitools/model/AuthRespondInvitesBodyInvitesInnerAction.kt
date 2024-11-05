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
 * @param acceptInvite Whether the invite/request is accepted.
 * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
 */
data class AuthRespondInvitesBodyInvitesInnerAction(

    @Schema(example = "null", required = true, description = "Whether the invite/request is accepted.")
    @get:JsonProperty("accept_invite", required = true) val acceptInvite: kotlin.Boolean,

    @get:Size(min=1)
    @Schema(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", description = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ")
    @get:JsonProperty("asset_id_to_permissions") val assetIdToPermissions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<Permissions>>? = null
    ) {

}

