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
 * Related Keyword information of the editorial article
 * @param name Keyword Name
 * @param pctGrowthMom MoM growth as a percentage, if there is no growth rate, this field is not present
 */
data class KeywordInfo(

    @Schema(required = true, description = "Keyword Name")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(description = "MoM growth as a percentage, if there is no growth rate, this field is not present")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pct_growth_mom")
    @get:JsonProperty("pct_growth_mom") val pctGrowthMom: java.math.BigDecimal? = null
) {

}

