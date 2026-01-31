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
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @param genderDistribution 
 */
data class TrendingKeywordDemographicsGenderDistribution(

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender_distribution") val genderDistribution: TrendingKeywordDemographicsGenderDistribution.GenderDistribution? = null
) : kotlin.collections.HashMap<String, kotlin.Double>() {

    /**
    * 
    * Values: male,female,unspecified
    */
    enum class GenderDistribution(@get:JsonValue val value: kotlin.String) {

        male("male"),
        female("female"),
        unspecified("unspecified");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): GenderDistribution {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TrendingKeywordDemographicsGenderDistribution'")
            }
        }
    }

}

