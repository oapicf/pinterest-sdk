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
* Entity status
* Values: ACTIVE,PAUSED,ARCHIVED,DRAFT,DELETED_DRAFT
*/
enum class EntityStatus(@get:JsonValue val value: kotlin.String) {

    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    ARCHIVED("ARCHIVED"),
    DRAFT("DRAFT"),
    DELETED_DRAFT("DELETED_DRAFT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): EntityStatus {
                return values().first{it -> it.value == value}
        }
    }
}

