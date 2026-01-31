package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @param ageDistribution 
 */
data class TrendingKeywordDemographicsAgeDistribution(

    @Schema(example = "null", description = "")
    @get:JsonProperty("age_distribution") val ageDistribution: TrendingKeywordDemographicsAgeDistribution.AgeDistribution? = null
) : kotlin.collections.HashMap<String, kotlin.Double>() {

    /**
    * 
    * Values: _18Minus24,_25Minus34,_35Minus44,_45Minus49,_50Minus54,_55Minus64,_65Plus
    */
    enum class AgeDistribution(@get:JsonValue val value: kotlin.String) {

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
            fun forValue(value: kotlin.String): AgeDistribution {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TrendingKeywordDemographicsAgeDistribution'")
            }
        }
    }

}

