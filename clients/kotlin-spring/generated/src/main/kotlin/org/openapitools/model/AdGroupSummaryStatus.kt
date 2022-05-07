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
* Summary status for ad group
* Values: rUNNING,pAUSED,nOTSTARTED,cOMPLETED,aDVERTISERDISABLED,aRCHIVED
*/
enum class AdGroupSummaryStatus(val value: kotlin.String) {

    @JsonProperty("RUNNING") rUNNING("RUNNING"),

    @JsonProperty("PAUSED") pAUSED("PAUSED"),

    @JsonProperty("NOT_STARTED") nOTSTARTED("NOT_STARTED"),

    @JsonProperty("COMPLETED") cOMPLETED("COMPLETED"),

    @JsonProperty("ADVERTISER_DISABLED") aDVERTISERDISABLED("ADVERTISER_DISABLED"),

    @JsonProperty("ARCHIVED") aRCHIVED("ARCHIVED");

}

