package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BidFloorSpec
import org.openapitools.model.TargetingSpecOptimal
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
 * Resource create operation model.
 * @param bidFloorSpecs List of bid floor specifications.
 * @param targetingSpec Ad group targeting specification defining the ad group target audience.
 */
data class BidFloorCreate(

    @field:Valid
    @Schema(required = true, description = "List of bid floor specifications.")
    @param:JsonProperty("bid_floor_specs")
    @get:JsonProperty("bid_floor_specs", required = true) val bidFloorSpecs: kotlin.collections.List<BidFloorSpec>,

    @field:Valid
    @Schema(description = "Ad group targeting specification defining the ad group target audience.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("targeting_spec")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpecOptimal? = null
) {

}

