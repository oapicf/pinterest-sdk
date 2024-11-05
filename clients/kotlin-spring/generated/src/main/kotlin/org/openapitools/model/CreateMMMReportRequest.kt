package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param reportName Name of the Marketing Mix Modeling (MMM) report
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
 * @param level Level of the report
 * @param targetingTypes List of targeting types
 * @param columns Metric and entity columns
 * @param countries A List of countries for filtering
 */
data class CreateMMMReportRequest(

    @Schema(example = "null", required = true, description = "Name of the Marketing Mix Modeling (MMM) report")
    @get:JsonProperty("report_name", required = true) val reportName: kotlin.String,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Metric report start date (UTC). Format: YYYY-MM-DD")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Metric report end date (UTC). Format: YYYY-MM-DD")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @Schema(example = "null", required = true, description = "DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.")
    @get:JsonProperty("granularity", required = true) val granularity: CreateMMMReportRequest.Granularity,

    @Schema(example = "null", required = true, description = "Level of the report")
    @get:JsonProperty("level", required = true) val level: CreateMMMReportRequest.Level,

    @field:Valid
    @get:Size(min=1,max=5) 
    @Schema(example = "[\"GENDER\"]", required = true, description = "List of targeting types")
    @get:JsonProperty("targeting_types", required = true) val targetingTypes: kotlin.collections.List<MMMReportingTargetingType>,

    @field:Valid
    @Schema(example = "null", required = true, description = "Metric and entity columns")
    @get:JsonProperty("columns", required = true) val columns: kotlin.collections.List<MMMReportingColumn>,

    @field:Valid
    @Schema(example = "null", description = "A List of countries for filtering")
    @get:JsonProperty("countries") val countries: kotlin.collections.List<TargetingAdvertiserCountry>? = null
    ) {

    /**
    * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
    * Values: DAY,WEEK
    */
    enum class Granularity(@get:JsonValue val value: kotlin.String) {

        DAY("DAY"),
        WEEK("WEEK");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Granularity {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * Level of the report
    * Values: CAMPAIGN_TARGETING,AD_GROUP_TARGETING
    */
    enum class Level(@get:JsonValue val value: kotlin.String) {

        CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
        AD_GROUP_TARGETING("AD_GROUP_TARGETING");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Level {
                return values().first{it -> it.value == value}
            }
        }
    }

}

