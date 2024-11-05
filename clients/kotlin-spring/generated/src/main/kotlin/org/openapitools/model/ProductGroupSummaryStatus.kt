package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
* Summary status for product group
* Values: RUNNING,PAUSED,EXCLUDED,ARCHIVED
*/
enum class ProductGroupSummaryStatus(@get:JsonValue val value: kotlin.String) {

    RUNNING("RUNNING"),
    PAUSED("PAUSED"),
    EXCLUDED("EXCLUDED"),
    ARCHIVED("ARCHIVED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ProductGroupSummaryStatus {
                return values().first{it -> it.value == value}
        }
    }
}

