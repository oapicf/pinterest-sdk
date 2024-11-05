package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Role
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
 * @param audienceId Audience ID that was shared
 * @param permissions 
 * @param recipientAccountIds Account IDs that received the audience
 */
data class SharedAudienceResponse(

    @Schema(example = "2542621871096", description = "Audience ID that was shared")
    @get:JsonProperty("audience_id") val audienceId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]", description = "")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<Role>? = null,

    @Schema(example = "[\"549755885175\"]", description = "Account IDs that received the audience")
    @get:JsonProperty("recipient_account_ids") val recipientAccountIds: kotlin.collections.List<kotlin.String>? = null
    ) {

}

