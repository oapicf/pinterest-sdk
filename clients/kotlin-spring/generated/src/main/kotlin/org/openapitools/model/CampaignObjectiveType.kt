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
* Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
* Values: AWARENESS,CONSIDERATION,VIDEO_VIEW,WEB_CONVERSION,CATALOG_SALES,WEB_SESSIONS,VIDEO_COMPLETION,APP_INSTALL,SALES,LEADS,CTV_CONSIDERATION
*/
enum class CampaignObjectiveType(@get:JsonValue val value: kotlin.String) {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    VIDEO_VIEW("VIDEO_VIEW"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    WEB_SESSIONS("WEB_SESSIONS"),
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    APP_INSTALL("APP_INSTALL"),
    SALES("SALES"),
    LEADS("LEADS"),
    CTV_CONSIDERATION("CTV_CONSIDERATION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CampaignObjectiveType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CampaignObjectiveType'")
        }
    }
}

