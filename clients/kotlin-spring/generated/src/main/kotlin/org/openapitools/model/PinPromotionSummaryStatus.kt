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
* Summary status for pin promotions
* Values: aPPROVED,pAUSED,pENDING,rEJECTED,aDVERTISERDISABLED,aRCHIVED
*/
enum class PinPromotionSummaryStatus(val value: kotlin.String) {

    @JsonProperty("APPROVED") aPPROVED("APPROVED"),

    @JsonProperty("PAUSED") pAUSED("PAUSED"),

    @JsonProperty("PENDING") pENDING("PENDING"),

    @JsonProperty("REJECTED") rEJECTED("REJECTED"),

    @JsonProperty("ADVERTISER_DISABLED") aDVERTISERDISABLED("ADVERTISER_DISABLED"),

    @JsonProperty("ARCHIVED") aRCHIVED("ARCHIVED");

}

