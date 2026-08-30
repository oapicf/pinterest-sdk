package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 * @param AGE_BUCKET 
 */
data class ScheduleAgeBucketMultipliers(

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AGE_BUCKET")
    @get:JsonProperty("AGE_BUCKET") val AGE_BUCKET: ScheduleAgeBucketMultipliers.AGEBUCKET? = null
) : kotlin.collections.HashMap<String, kotlin.Double>() {

    /**
    * 
    * Values: _18Minus24,_25Minus34,_35Minus44,_45Minus49,_50Minus54,_55Minus64,_65Plus
    */
    enum class AGEBUCKET(@get:JsonValue val value: kotlin.String) {

        _18Minus24("18-24"),
        _25Minus34("25-34"),
        _35Minus44("35-44"),
        _45Minus49("45-49"),
        _50Minus54("50-54"),
        _55Minus64("55-64"),
        _65Plus("65+");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AGEBUCKET {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AGEBUCKET'")
            }
        }
    }

}

