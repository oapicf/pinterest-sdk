package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
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
 * Range audience size for an ad group.
 * @param countLower Lower bound of the audience size estimate.
 * @param countUpper Upper bound of the audience size estimate.
 */
data class CampaignPlanningAdGroupAudienceSize(

    @get:Min(value=0)
    @Schema(example = "1000000", description = "Lower bound of the audience size estimate.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("count_lower")
    @get:JsonProperty("count_lower") val countLower: kotlin.Int? = null,

    @get:Min(value=0)
    @Schema(example = "2000000", description = "Upper bound of the audience size estimate.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("count_upper")
    @get:JsonProperty("count_upper") val countUpper: kotlin.Int? = null
) {

}

