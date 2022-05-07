package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Default availability for products in a feed.
* Values: iNSTOCK,oUTOFSTOCK,pREORDER,`null`
*/
enum class ProductAvailabilityType(val value: kotlin.String) {

    @JsonProperty("IN_STOCK") iNSTOCK("IN_STOCK"),

    @JsonProperty("OUT_OF_STOCK") oUTOFSTOCK("OUT_OF_STOCK"),

    @JsonProperty("PREORDER") pREORDER("PREORDER"),

    @JsonProperty("null") `null`("null");

}

