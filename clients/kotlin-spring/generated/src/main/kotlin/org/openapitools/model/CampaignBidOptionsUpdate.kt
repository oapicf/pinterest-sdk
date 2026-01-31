package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AppTypeMultipliers
import org.openapitools.model.CampaignAudienceMultipliers
import org.openapitools.model.PlacementMultipliers
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
 * Object describing an update to the campaign level bid multipliers.
 * @param updateMask List of fields to update, only the fields in the list will be updated.
 * @param appTypeMultipliers 
 * @param audienceMultipliers 
 * @param placementMultipliers 
 */
data class CampaignBidOptionsUpdate(

    @Schema(example = "null", required = true, description = "List of fields to update, only the fields in the list will be updated.")
    @get:JsonProperty("update_mask", required = true) val updateMask: kotlin.collections.List<CampaignBidOptionsUpdate.UpdateMask>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("app_type_multipliers") val appTypeMultipliers: AppTypeMultipliers? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audience_multipliers") val audienceMultipliers: CampaignAudienceMultipliers? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placement_multipliers") val placementMultipliers: PlacementMultipliers? = null
) {

    /**
    * List of fields to update, only the fields in the list will be updated.
    * Values: AUDIENCE,APP_TYPE,PLACEMENT,GENDER,AGE_BUCKET
    */
    enum class UpdateMask(@get:JsonValue val value: kotlin.String) {

        AUDIENCE("AUDIENCE"),
        APP_TYPE("APP_TYPE"),
        PLACEMENT("PLACEMENT"),
        GENDER("GENDER"),
        AGE_BUCKET("AGE_BUCKET");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): UpdateMask {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CampaignBidOptionsUpdate'")
            }
        }
    }

}

