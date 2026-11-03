package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdgroupTrackingFeatureType
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
 * 
 * @param enabled Tracking features. To clear this field, set to null.
 */
data class AdgroupTrackingFeatures(

    @field:Valid
    @Schema(description = "Tracking features. To clear this field, set to null.")
    @param:JsonProperty("enabled")
    @get:JsonProperty("enabled") val enabled: kotlin.collections.List<AdgroupTrackingFeatureType>? = null
) {

}

