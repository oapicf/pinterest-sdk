@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LeadFormQuestionFieldType {
    @JsonProperty(value = "TEXT_FIELD") TEXT_FIELD,
    @JsonProperty(value = "TEXT_AREA") TEXT_AREA,
    @JsonProperty(value = "RADIO_LIST") RADIO_LIST,
    @JsonProperty(value = "CHECKBOX") CHECKBOX,
}
