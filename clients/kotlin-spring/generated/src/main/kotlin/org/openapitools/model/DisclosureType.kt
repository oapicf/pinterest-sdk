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
* Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
* Values: NO_DISCLOSURE,PRESCRIBING_INFORMATION,PRESCRIBING_INFORMATION_BOX_WARNING,IMPORTANT_SAFETY_INFO,MED_GUIDE,PATIENT_INFORMATION
*/
enum class DisclosureType(@get:JsonValue val value: kotlin.String) {

    NO_DISCLOSURE("NO_DISCLOSURE"),
    PRESCRIBING_INFORMATION("PRESCRIBING_INFORMATION"),
    PRESCRIBING_INFORMATION_BOX_WARNING("PRESCRIBING_INFORMATION_BOX_WARNING"),
    IMPORTANT_SAFETY_INFO("IMPORTANT_SAFETY_INFO"),
    MED_GUIDE("MED_GUIDE"),
    PATIENT_INFORMATION("PATIENT_INFORMATION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): DisclosureType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'DisclosureType'")
        }
    }
}

