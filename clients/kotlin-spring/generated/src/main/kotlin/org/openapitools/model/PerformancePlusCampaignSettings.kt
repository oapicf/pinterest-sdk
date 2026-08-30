package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * Pinterest Performance+ campaign settings.
 * @param boostProspectingAdGroupBid Whether to boost prospecting ad group bid.
 * @param pinnerListExclusions List of campaign-level exclusion pinner list IDs.
 */
data class PerformancePlusCampaignSettings(

    @Schema(description = "Whether to boost prospecting ad group bid.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("boost_prospecting_ad_group_bid")
    @get:JsonProperty("boost_prospecting_ad_group_bid") val boostProspectingAdGroupBid: kotlin.Boolean? = null,

    @Schema(description = "List of campaign-level exclusion pinner list IDs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pinner_list_exclusions")
    @get:JsonProperty("pinner_list_exclusions") val pinnerListExclusions: kotlin.collections.List<kotlin.String>? = null
) {

}

