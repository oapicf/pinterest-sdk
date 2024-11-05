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
* Lead form question type
* Values: CUSTOM,FULL_NAME,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,ZIP_CODE,GENDER,CITY,COUNTRY,STATE_PROVINCE,ADDRESS,DATE_OF_BIRTH,AGE
*/
enum class LeadFormQuestionType(@get:JsonValue val value: kotlin.String) {

    CUSTOM("CUSTOM"),
    FULL_NAME("FULL_NAME"),
    FIRST_NAME("FIRST_NAME"),
    LAST_NAME("LAST_NAME"),
    EMAIL("EMAIL"),
    PHONE_NUMBER("PHONE_NUMBER"),
    ZIP_CODE("ZIP_CODE"),
    GENDER("GENDER"),
    CITY("CITY"),
    COUNTRY("COUNTRY"),
    STATE_PROVINCE("STATE_PROVINCE"),
    ADDRESS("ADDRESS"),
    DATE_OF_BIRTH("DATE_OF_BIRTH"),
    AGE("AGE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): LeadFormQuestionType {
                return values().first{it -> it.value == value}
        }
    }
}

