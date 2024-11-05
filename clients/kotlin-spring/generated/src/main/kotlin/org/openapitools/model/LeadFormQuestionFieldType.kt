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
* Lead form question field type
* Values: TEXT_FIELD,TEXT_AREA,RADIO_LIST,CHECKBOX
*/
enum class LeadFormQuestionFieldType(@get:JsonValue val value: kotlin.String) {

    TEXT_FIELD("TEXT_FIELD"),
    TEXT_AREA("TEXT_AREA"),
    RADIO_LIST("RADIO_LIST"),
    CHECKBOX("CHECKBOX");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): LeadFormQuestionFieldType {
                return values().first{it -> it.value == value}
        }
    }
}

