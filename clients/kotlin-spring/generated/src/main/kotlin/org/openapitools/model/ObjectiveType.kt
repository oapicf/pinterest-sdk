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
* Campaign objective type.
* Values: aWARENESS,cONSIDERATION,vIDEOVIEW,wEBCONVERSION,cATALOGSALES,wEBSESSIONS,aWARENESSRESERVED,eNGAGEMENT
*/
enum class ObjectiveType(val value: kotlin.String) {

    @JsonProperty("AWARENESS") aWARENESS("AWARENESS"),

    @JsonProperty("CONSIDERATION") cONSIDERATION("CONSIDERATION"),

    @JsonProperty("VIDEO_VIEW") vIDEOVIEW("VIDEO_VIEW"),

    @JsonProperty("WEB_CONVERSION") wEBCONVERSION("WEB_CONVERSION"),

    @JsonProperty("CATALOG_SALES") cATALOGSALES("CATALOG_SALES"),

    @JsonProperty("WEB_SESSIONS") wEBSESSIONS("WEB_SESSIONS"),

    @JsonProperty("AWARENESS_RESERVED") aWARENESSRESERVED("AWARENESS_RESERVED"),

    @JsonProperty("ENGAGEMENT") eNGAGEMENT("ENGAGEMENT");

}

