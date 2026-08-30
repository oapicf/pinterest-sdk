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
* Values: REGULAR,VIDEO,SHOPPING,CAROUSEL,MAX_VIDEO,SHOP_THE_PIN,COLLECTION,IDEA
*/
enum class AdGroupAudienceSizingCreativeTypes(@get:JsonValue val value: kotlin.String) {

    REGULAR("REGULAR"),
    VIDEO("VIDEO"),
    SHOPPING("SHOPPING"),
    CAROUSEL("CAROUSEL"),
    MAX_VIDEO("MAX_VIDEO"),
    SHOP_THE_PIN("SHOP_THE_PIN"),
    COLLECTION("COLLECTION"),
    IDEA("IDEA");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AdGroupAudienceSizingCreativeTypes {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdGroupAudienceSizingCreativeTypes'")
        }
    }
}

