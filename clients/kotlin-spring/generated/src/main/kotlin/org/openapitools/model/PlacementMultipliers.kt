package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 * @param PLACEMENT 
 */
data class PlacementMultipliers(

    @Schema(example = "null", description = "")
    @get:JsonProperty("PLACEMENT") val PLACEMENT: PlacementMultipliers.PLACEMENT? = null
    ) : kotlin.collections.HashMap<String, kotlin.Double>{

    /**
    * 
    * Values: SEARCH,BROWSE
    */
    enum class PLACEMENT(@get:JsonValue val value: kotlin.String) {

        SEARCH("SEARCH"),
        BROWSE("BROWSE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PLACEMENT {
                return values().first{it -> it.value == value}
            }
        }
    }

}

