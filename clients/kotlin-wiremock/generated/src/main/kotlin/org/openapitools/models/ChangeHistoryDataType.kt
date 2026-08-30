@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ChangeHistoryDataType {
    @JsonProperty(value = "STRING") STRING,
    @JsonProperty(value = "NUMERIC") NUMERIC,
    @JsonProperty(value = "MICROCURRENCY") MICROCURRENCY,
    @JsonProperty(value = "DATE") DATE,
    @JsonProperty(value = "BOOL") BOOL,
    @JsonProperty(value = "GENDER_LIST") GENDER_LIST,
    @JsonProperty(value = "AGE_BUCKET_LIST") AGE_BUCKET_LIST,
    @JsonProperty(value = "APPTYPE_LIST") APPTYPE_LIST,
    @JsonProperty(value = "COUNTRY_LIST") COUNTRY_LIST,
    @JsonProperty(value = "LOCALE_LIST") LOCALE_LIST,
}
