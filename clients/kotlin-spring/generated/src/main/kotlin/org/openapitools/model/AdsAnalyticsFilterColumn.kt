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
* Reporting columns for sync reporting data filter
* Values: sPENDINDOLLAR,tOTALIMPRESSION
*/
enum class AdsAnalyticsFilterColumn(val value: kotlin.String) {

    @JsonProperty("SPEND_IN_DOLLAR") sPENDINDOLLAR("SPEND_IN_DOLLAR"),

    @JsonProperty("TOTAL_IMPRESSION") tOTALIMPRESSION("TOTAL_IMPRESSION");

}

