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
 * 
 * @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
data class CampaignsAnalyticsMetrics(

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("CAMPAIGN_ID")
    @get:JsonProperty("CAMPAIGN_ID") val CAMPAIGN_ID: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DATE")
    @get:JsonProperty("DATE") val DATE: java.time.LocalDate? = null
) {

}

