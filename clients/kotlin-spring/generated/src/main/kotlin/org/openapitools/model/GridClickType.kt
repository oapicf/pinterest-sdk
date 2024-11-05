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
* Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
* Values: CLOSEUP,DIRECT_TO_DESTINATION
*/
enum class GridClickType(@get:JsonValue val value: kotlin.String) {

    CLOSEUP("CLOSEUP"),
    DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): GridClickType {
                return values().first{it -> it.value == value}
        }
    }
}

