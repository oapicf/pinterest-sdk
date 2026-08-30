@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LeadFormQuestionType {
    @JsonProperty(value = "CUSTOM") CUSTOM,
    @JsonProperty(value = "FULL_NAME") FULL_NAME,
    @JsonProperty(value = "FIRST_NAME") FIRST_NAME,
    @JsonProperty(value = "LAST_NAME") LAST_NAME,
    @JsonProperty(value = "EMAIL") EMAIL,
    @JsonProperty(value = "PHONE_NUMBER") PHONE_NUMBER,
    @JsonProperty(value = "ZIP_CODE") ZIP_CODE,
    @JsonProperty(value = "GENDER") GENDER,
    @JsonProperty(value = "CITY") CITY,
    @JsonProperty(value = "COUNTRY") COUNTRY,
    @JsonProperty(value = "STATE_PROVINCE") STATE_PROVINCE,
    @JsonProperty(value = "ADDRESS") ADDRESS,
    @JsonProperty(value = "DATE_OF_BIRTH") DATE_OF_BIRTH,
    @JsonProperty(value = "AGE") AGE,
}
