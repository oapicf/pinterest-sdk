package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ScheduleAgeBucketMultipliers
import org.openapitools.model.ScheduleAppTypeMultipliers
import org.openapitools.model.ScheduleAudienceMultipliers
import org.openapitools.model.ScheduleBidOptionsGenderMultipliers
import org.openapitools.model.ScheduleBidOptionsPlacementMultipliers
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
 * Object describing the schedule level bid level changes.
 * @param ageBucketMultipliers 
 * @param appTypeMultipliers 
 * @param audienceMultipliers 
 * @param genderMultipliers 
 * @param placementMultipliers 
 */
data class ScheduleBidOptions(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("age_bucket_multipliers")
    @get:JsonProperty("age_bucket_multipliers") val ageBucketMultipliers: ScheduleAgeBucketMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("app_type_multipliers")
    @get:JsonProperty("app_type_multipliers") val appTypeMultipliers: ScheduleAppTypeMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audience_multipliers")
    @get:JsonProperty("audience_multipliers") val audienceMultipliers: ScheduleAudienceMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("gender_multipliers")
    @get:JsonProperty("gender_multipliers") val genderMultipliers: ScheduleBidOptionsGenderMultipliers? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("placement_multipliers")
    @get:JsonProperty("placement_multipliers") val placementMultipliers: ScheduleBidOptionsPlacementMultipliers? = null
) : ScheduleCommonDeltaValue {

}

