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
* 
* Values: tOTAL,dAY,hOUR,wEEK,mONTH
*/
enum class Granularity(val value: kotlin.String) {

    @JsonProperty("TOTAL") tOTAL("TOTAL"),

    @JsonProperty("DAY") dAY("DAY"),

    @JsonProperty("HOUR") hOUR("HOUR"),

    @JsonProperty("WEEK") wEEK("WEEK"),

    @JsonProperty("MONTH") mONTH("MONTH");

}

