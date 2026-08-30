package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
* Estimation type for campaign planning estimated curve
* Values: IMPRESSION,CLICK,CONVERSION,WEEKLY_FREQUENCY,WEEKLY_REACH,LIFETIME_FREQUENCY,LIFETIME_REACH,CPM,CPC,CPA
*/
enum class CampaignPlanningEstimationType(@get:JsonValue val value: kotlin.String) {

    IMPRESSION("IMPRESSION"),
    CLICK("CLICK"),
    CONVERSION("CONVERSION"),
    WEEKLY_FREQUENCY("WEEKLY_FREQUENCY"),
    WEEKLY_REACH("WEEKLY_REACH"),
    LIFETIME_FREQUENCY("LIFETIME_FREQUENCY"),
    LIFETIME_REACH("LIFETIME_REACH"),
    CPM("CPM"),
    CPC("CPC"),
    CPA("CPA");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CampaignPlanningEstimationType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CampaignPlanningEstimationType'")
        }
    }
}

