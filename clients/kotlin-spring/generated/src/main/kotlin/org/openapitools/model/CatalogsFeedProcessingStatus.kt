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
* Values: cOMPLETED,cOMPLETEDEARLY,dISAPPROVED,fAILED,pROCESSING,qUEUEDFORPROCESSING,uNDERAPPEAL,uNDERREVIEW
*/
enum class CatalogsFeedProcessingStatus(val value: kotlin.String) {

    @JsonProperty("COMPLETED") cOMPLETED("COMPLETED"),

    @JsonProperty("COMPLETED_EARLY") cOMPLETEDEARLY("COMPLETED_EARLY"),

    @JsonProperty("DISAPPROVED") dISAPPROVED("DISAPPROVED"),

    @JsonProperty("FAILED") fAILED("FAILED"),

    @JsonProperty("PROCESSING") pROCESSING("PROCESSING"),

    @JsonProperty("QUEUED_FOR_PROCESSING") qUEUEDFORPROCESSING("QUEUED_FOR_PROCESSING"),

    @JsonProperty("UNDER_APPEAL") uNDERAPPEAL("UNDER_APPEAL"),

    @JsonProperty("UNDER_REVIEW") uNDERREVIEW("UNDER_REVIEW");

}

