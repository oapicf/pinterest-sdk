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
* Specifies the type of followees to be kept when filtering them.
* Values: ALL,RANKED,CREATOR_ONLY,RANKED_CREATOR_ONLY
*/
enum class UserFollowingFeedType(@get:JsonValue val value: kotlin.String) {

    ALL("ALL"),
    RANKED("RANKED"),
    CREATOR_ONLY("CREATOR_ONLY"),
    RANKED_CREATOR_ONLY("RANKED_CREATOR_ONLY");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): UserFollowingFeedType {
                return values().first{it -> it.value == value}
        }
    }
}

