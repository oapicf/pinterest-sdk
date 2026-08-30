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
* Availability of the item
* Values: in_stock,out_of_stock,preorder
*/
enum class ItemAvailability(@get:JsonValue val value: kotlin.String) {

    in_stock("in stock"),
    out_of_stock("out of stock"),
    preorder("preorder");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ItemAvailability {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ItemAvailability'")
        }
    }
}

