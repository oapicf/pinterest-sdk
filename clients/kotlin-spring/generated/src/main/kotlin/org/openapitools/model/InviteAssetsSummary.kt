package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.InviteAssetsSummaryAdAccountsInner
import org.openapitools.model.InviteAssetsSummaryProfilesInner
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
    @Schema(example = "null", description = "List of ad account IDs and respective permission levels that will be assigned.")
    @get:JsonProperty("ad_accounts") val adAccounts: kotlin.collections.List<InviteAssetsSummaryAdAccountsInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "List of profile IDs and respective permission levels that will be assigned.")
    @get:JsonProperty("profiles") val profiles: kotlin.collections.List<InviteAssetsSummaryProfilesInner>? = null
    ) {

}

