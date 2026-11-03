package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BidOptionsAgeBucketMultipliers
import org.openapitools.model.BidOptionsAppTypeMultipliers
import org.openapitools.model.BidOptionsAudienceMultipliers
import org.openapitools.model.BidOptionsGenderMultipliers
import org.openapitools.model.BidOptionsPlacementMultipliers
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
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 * @param ageBucketMultipliers 
 * @param appTypeMultipliers 
 * @param audienceMultipliers 
 * @param genderMultipliers 
 * @param placementMultipliers 
 */
data class ScheduleBidMultipliers(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("age_bucket_multipliers")
    @get:JsonProperty("age_bucket_multipliers") val ageBucketMultipliers: BidOptionsAgeBucketMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("app_type_multipliers")
    @get:JsonProperty("app_type_multipliers") val appTypeMultipliers: BidOptionsAppTypeMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("audience_multipliers")
    @get:JsonProperty("audience_multipliers") val audienceMultipliers: kotlin.collections.List<BidOptionsAudienceMultipliers>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("gender_multipliers")
    @get:JsonProperty("gender_multipliers") val genderMultipliers: BidOptionsGenderMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("placement_multipliers")
    @get:JsonProperty("placement_multipliers") val placementMultipliers: BidOptionsPlacementMultipliers? = null
) {

}

