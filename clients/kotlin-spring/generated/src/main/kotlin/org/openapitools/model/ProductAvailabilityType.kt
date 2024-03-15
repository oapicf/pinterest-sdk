package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Values: IN_STOCK,OUT_OF_STOCK,PREORDER,`null`
*/
enum class ProductAvailabilityType(val value: kotlin.String) {

    @JsonProperty("IN_STOCK") IN_STOCK("IN_STOCK"),
    @JsonProperty("OUT_OF_STOCK") OUT_OF_STOCK("OUT_OF_STOCK"),
    @JsonProperty("PREORDER") PREORDER("PREORDER"),
    @JsonProperty("null") `null`("null")
}

