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
* User list type
* Values: EMAIL,IDFA,MAID,LR_ID,DLX_ID,HASHED_PINNER_ID
*/
enum class UserListType(@get:JsonValue val value: kotlin.String) {

    EMAIL("EMAIL"),
    IDFA("IDFA"),
    MAID("MAID"),
    LR_ID("LR_ID"),
    DLX_ID("DLX_ID"),
    HASHED_PINNER_ID("HASHED_PINNER_ID");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): UserListType {
                return values().first{it -> it.value == value}
        }
    }
}

