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
* 
* Values: AD_ACCOUNT,BUSINESS_ACCOUNT
*/
enum class AudienceAccountType(@get:JsonValue val value: kotlin.String) {

    AD_ACCOUNT("AD_ACCOUNT"),
    BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AudienceAccountType {
                return values().first{it -> it.value == value}
        }
    }
}

