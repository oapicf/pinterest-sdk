package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdsAnalyticsTargetingType
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
 * @param targetingTypes List of targeting types
 */
data class TargetingTypeFilter(

    @field:Valid
    @get:Size(min=1,max=5) 
    @field:JsonProperty("targeting_types") val targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType>? = null
) {

}

