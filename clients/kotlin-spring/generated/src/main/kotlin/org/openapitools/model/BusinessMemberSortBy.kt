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
* The name of field that businesses are sorted by
* Values: FULL_NAME,BUSINESS_ROLES,CREATED_TIME
*/
enum class BusinessMemberSortBy(@get:JsonValue val value: kotlin.String) {

    FULL_NAME("FULL_NAME"),
    BUSINESS_ROLES("BUSINESS_ROLES"),
    CREATED_TIME("CREATED_TIME");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): BusinessMemberSortBy {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BusinessMemberSortBy'")
        }
    }
}

