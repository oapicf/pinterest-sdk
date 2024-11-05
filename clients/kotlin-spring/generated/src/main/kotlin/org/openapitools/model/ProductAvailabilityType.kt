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
* Default availability for products in a feed.
* Values: IN_STOCK,OUT_OF_STOCK,PREORDER
*/
enum class ProductAvailabilityType(@get:JsonValue val value: kotlin.String) {

    IN_STOCK("IN_STOCK"),
    OUT_OF_STOCK("OUT_OF_STOCK"),
    PREORDER("PREORDER");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ProductAvailabilityType {
                return values().first{it -> it.value == value}
        }
    }
}

