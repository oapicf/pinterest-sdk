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
* Ad group billable event type.
* Values: cLICKTHROUGH,iMPRESSION,vIDEOV50MRC,bILLABLEENGAGEMENT
*/
enum class ActionType(val value: kotlin.String) {

    @JsonProperty("CLICKTHROUGH") cLICKTHROUGH("CLICKTHROUGH"),

    @JsonProperty("IMPRESSION") iMPRESSION("IMPRESSION"),

    @JsonProperty("VIDEO_V_50_MRC") vIDEOV50MRC("VIDEO_V_50_MRC"),

    @JsonProperty("BILLABLE_ENGAGEMENT") bILLABLEENGAGEMENT("BILLABLE_ENGAGEMENT");

}

