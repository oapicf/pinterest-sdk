package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Lead form question type
* Values: CUSTOM,FULL_NAME,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,ZIP_CODE,AGE,GENDER,CITY,COUNTRY,PREFERRED_CONTACT_METHOD,STATE_PROVINCE,ADDRESS,DATE_OF_BIRTH
*/
enum class LeadFormQuestionType(val value: kotlin.String) {

    @JsonProperty("CUSTOM") CUSTOM("CUSTOM"),
    @JsonProperty("FULL_NAME") FULL_NAME("FULL_NAME"),
    @JsonProperty("FIRST_NAME") FIRST_NAME("FIRST_NAME"),
    @JsonProperty("LAST_NAME") LAST_NAME("LAST_NAME"),
    @JsonProperty("EMAIL") EMAIL("EMAIL"),
    @JsonProperty("PHONE_NUMBER") PHONE_NUMBER("PHONE_NUMBER"),
    @JsonProperty("ZIP_CODE") ZIP_CODE("ZIP_CODE"),
    @JsonProperty("AGE") AGE("AGE"),
    @JsonProperty("GENDER") GENDER("GENDER"),
    @JsonProperty("CITY") CITY("CITY"),
    @JsonProperty("COUNTRY") COUNTRY("COUNTRY"),
    @JsonProperty("PREFERRED_CONTACT_METHOD") PREFERRED_CONTACT_METHOD("PREFERRED_CONTACT_METHOD"),
    @JsonProperty("STATE_PROVINCE") STATE_PROVINCE("STATE_PROVINCE"),
    @JsonProperty("ADDRESS") ADDRESS("ADDRESS"),
    @JsonProperty("DATE_OF_BIRTH") DATE_OF_BIRTH("DATE_OF_BIRTH")
}

