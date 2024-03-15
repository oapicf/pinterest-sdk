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
* Keyword match type
* Values: BROAD,PHRASE,EXACT,EXACT_NEGATIVE,PHRASE_NEGATIVE
*/
enum class MatchType(val value: kotlin.String) {

    @JsonProperty("BROAD") BROAD("BROAD"),
    @JsonProperty("PHRASE") PHRASE("PHRASE"),
    @JsonProperty("EXACT") EXACT("EXACT"),
    @JsonProperty("EXACT_NEGATIVE") EXACT_NEGATIVE("EXACT_NEGATIVE"),
    @JsonProperty("PHRASE_NEGATIVE") PHRASE_NEGATIVE("PHRASE_NEGATIVE")
}

