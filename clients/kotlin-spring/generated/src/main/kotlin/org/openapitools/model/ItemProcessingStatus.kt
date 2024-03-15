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
* The status of the item processing record
* Values: SUCCESS,FAILURE,PROCESSING
*/
enum class ItemProcessingStatus(val value: kotlin.String) {

    @JsonProperty("SUCCESS") SUCCESS("SUCCESS"),
    @JsonProperty("FAILURE") FAILURE("FAILURE"),
    @JsonProperty("PROCESSING") PROCESSING("PROCESSING")
}

