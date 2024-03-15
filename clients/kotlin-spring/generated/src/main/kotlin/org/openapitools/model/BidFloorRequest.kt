package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BidFloorSpec
import org.openapitools.model.TargetingSpec
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
 * @param bidFloorSpecs 
 * @param targetingSpec 
 */
data class BidFloorRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bid_floor_specs", required = true) val bidFloorSpecs: kotlin.collections.List<BidFloorSpec>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpec? = null
) {

}

