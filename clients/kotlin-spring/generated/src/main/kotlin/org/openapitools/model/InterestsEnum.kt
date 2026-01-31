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
* Values: ALL,ANIMALS,ARCHITECTURE,ART,BEAUTY,DIY_AND_CRAFTS,EDUCATION,EVENT_PLANNING,FASHION,FOOD_AND_DRINKS,GARDENING,HEALTH,HOME_DECOR,PARENTING,TRAVEL,WEDDING
*/
enum class InterestsEnum(@get:JsonValue val value: kotlin.String) {

    ALL("ALL"),
    ANIMALS("ANIMALS"),
    ARCHITECTURE("ARCHITECTURE"),
    ART("ART"),
    BEAUTY("BEAUTY"),
    DIY_AND_CRAFTS("DIY_AND_CRAFTS"),
    EDUCATION("EDUCATION"),
    EVENT_PLANNING("EVENT_PLANNING"),
    FASHION("FASHION"),
    FOOD_AND_DRINKS("FOOD_AND_DRINKS"),
    GARDENING("GARDENING"),
    HEALTH("HEALTH"),
    HOME_DECOR("HOME_DECOR"),
    PARENTING("PARENTING"),
    TRAVEL("TRAVEL"),
    WEDDING("WEDDING");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): InterestsEnum {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'InterestsEnum'")
        }
    }
}

