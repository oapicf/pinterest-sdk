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
* Whether the data is owned by the partner (1p) or by the data provider (3p)
* Values: _1p,_3p
*/
enum class AudienceDataParty(val value: kotlin.String) {

    @JsonProperty("1p") _1p("1p"),
    @JsonProperty("3p") _3p("3p")
}

