package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.MMMReportGranularity
import org.openapitools.model.MMMReportLevel
import org.openapitools.model.MMMReportingColumn
import org.openapitools.model.MMMReportingTargetingType
import org.openapitools.model.TargetingAdvertiserCountry
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
 * @param columns Metric and entity columns
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
 * @param level Level of the report
 * @param reportName Name of the Marketing Mix Modeling (MMM) report
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param targetingTypes List of targeting types
 * @param advertiserIds Advertiser IDs for multi-advertiser report
 * @param countries A List of countries for filtering
 * @param customColumnIds List of custom column IDs
 */
data class MMMReportCreate(

    @field:Valid
    @Schema(required = true, description = "Metric and entity columns")
    @param:JsonProperty("columns")
    @get:JsonProperty("columns", required = true) val columns: kotlin.collections.List<MMMReportingColumn>,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(example = "2020-12-20", required = true, description = "Metric report end date (UTC). Format: YYYY-MM-DD")
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.")
    @param:JsonProperty("granularity")
    @get:JsonProperty("granularity", required = true) val granularity: MMMReportGranularity,

    @field:Valid
    @Schema(required = true, description = "Level of the report")
    @param:JsonProperty("level")
    @get:JsonProperty("level", required = true) val level: MMMReportLevel,

    @Schema(required = true, description = "Name of the Marketing Mix Modeling (MMM) report")
    @param:JsonProperty("report_name")
    @get:JsonProperty("report_name", required = true) val reportName: kotlin.String,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(example = "2020-12-20", required = true, description = "Metric report start date (UTC). Format: YYYY-MM-DD")
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=7) 
    @Schema(example = "[\"GENDER\"]", required = true, description = "List of targeting types")
    @param:JsonProperty("targeting_types")
    @get:JsonProperty("targeting_types", required = true) val targetingTypes: kotlin.collections.List<MMMReportingTargetingType>,

    @Schema(description = "Advertiser IDs for multi-advertiser report")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("advertiser_ids")
    @get:JsonProperty("advertiser_ids") val advertiserIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "A List of countries for filtering")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("countries")
    @get:JsonProperty("countries") val countries: kotlin.collections.List<TargetingAdvertiserCountry>? = null,

    @get:Size(max=20)
    @Schema(description = "List of custom column IDs")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_column_ids")
    @get:JsonProperty("custom_column_ids") val customColumnIds: kotlin.collections.List<kotlin.String>? = null
) {

}

