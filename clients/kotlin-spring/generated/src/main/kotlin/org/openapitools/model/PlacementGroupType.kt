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
* Campaign placement group type
* Values: aLL,sEARCH,bROWSE,oTHER
*/
enum class PlacementGroupType(val value: kotlin.String) {

    @JsonProperty("ALL") aLL("ALL"),

    @JsonProperty("SEARCH") sEARCH("SEARCH"),

    @JsonProperty("BROWSE") bROWSE("BROWSE"),

    @JsonProperty("OTHER") oTHER("OTHER");

}

