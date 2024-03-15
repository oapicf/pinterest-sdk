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
* Where a user is taken after clicking on an ad in grid.
* Values: CLOSEUP,DIRECT_TO_DESTINATION
*/
enum class GridClickType(val value: kotlin.String) {

    @JsonProperty("CLOSEUP") CLOSEUP("CLOSEUP"),
    @JsonProperty("DIRECT_TO_DESTINATION") DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION")
}

