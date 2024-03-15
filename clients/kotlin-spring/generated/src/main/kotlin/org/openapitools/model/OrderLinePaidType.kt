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
* Order Line Paid Type
* Values: PAID,BONUS,MAKE_GOOD,TEST,`null`
*/
enum class OrderLinePaidType(val value: kotlin.String) {

    @JsonProperty("PAID") PAID("PAID"),
    @JsonProperty("BONUS") BONUS("BONUS"),
    @JsonProperty("MAKE_GOOD") MAKE_GOOD("MAKE_GOOD"),
    @JsonProperty("TEST") TEST("TEST"),
    @JsonProperty("null") `null`("null")
}

