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
* A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
* Values: ALL,TWO_COLUMN_FEED,FULLSCREEN_FEED
*/
enum class PlacementTrafficType(@get:JsonValue val value: kotlin.String) {

    ALL("ALL"),
    TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
    FULLSCREEN_FEED("FULLSCREEN_FEED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PlacementTrafficType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PlacementTrafficType'")
        }
    }
}

