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
* Summary status for product group
* Values: rUNNING,pAUSED,eXCLUDED,aRCHIVED
*/
enum class ProductGroupSummaryStatus(val value: kotlin.String) {

    @JsonProperty("RUNNING") rUNNING("RUNNING"),

    @JsonProperty("PAUSED") pAUSED("PAUSED"),

    @JsonProperty("EXCLUDED") eXCLUDED("EXCLUDED"),

    @JsonProperty("ARCHIVED") aRCHIVED("ARCHIVED");

}

