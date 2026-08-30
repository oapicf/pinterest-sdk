@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class DisclosureType {
    @JsonProperty(value = "NO_DISCLOSURE") NO_DISCLOSURE,
    @JsonProperty(value = "PRESCRIBING_INFORMATION") PRESCRIBING_INFORMATION,
    @JsonProperty(value = "PRESCRIBING_INFORMATION_BOX_WARNING") PRESCRIBING_INFORMATION_BOX_WARNING,
    @JsonProperty(value = "IMPORTANT_SAFETY_INFO") IMPORTANT_SAFETY_INFO,
    @JsonProperty(value = "MED_GUIDE") MED_GUIDE,
    @JsonProperty(value = "PATIENT_INFORMATION") PATIENT_INFORMATION,
}
