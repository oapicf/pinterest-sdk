package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.InviteAssetsSummaryItem
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
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 * @param adAccounts List of ad account IDs and respective permission levels that will be assigned.
 * @param profiles List of profile IDs and respective permission levels that will be assigned.
 */
data class InviteAssetsSummary(

    @field:Valid
    @Schema(description = "List of ad account IDs and respective permission levels that will be assigned.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_accounts")
    @get:JsonProperty("ad_accounts") val adAccounts: kotlin.collections.List<InviteAssetsSummaryItem>? = null,

    @field:Valid
    @Schema(description = "List of profile IDs and respective permission levels that will be assigned.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("profiles")
    @get:JsonProperty("profiles") val profiles: kotlin.collections.List<InviteAssetsSummaryItem>? = null
) {

}

