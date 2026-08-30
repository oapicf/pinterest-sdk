package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param audienceId Unique identifier of an audience
 * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
 * @param permissions Permissions granted to the recipients.
 */
data class AdAccountToAdAccountSharedAudience(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2542621871096", required = true, description = "Unique identifier of an audience")
    @param:JsonProperty("audience_id")
    @get:JsonProperty("audience_id", required = true) val audienceId: kotlin.String,

    @Schema(required = true, description = "Ad account IDs to share with or revoke from (request) / that received the audience (response).")
    @param:JsonProperty("recipient_account_ids")
    @get:JsonProperty("recipient_account_ids", required = true) val recipientAccountIds: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(example = "[\"RESOURCE_PINNER_LIST_READER\",\"RESOURCE_PINNER_LIST_OWNER\"]", readOnly = true, description = "Permissions granted to the recipients.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("permissions")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<Role>? = null
) {

}

