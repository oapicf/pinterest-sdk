package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
 * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
 * @param adId ID for the ad collecting leads
 */
data class LeadsExportCreateRequest(

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "687201361754", required = true, description = "ID for the ad collecting leads")
    @get:JsonProperty("ad_id", required = true) val adId: kotlin.String
    ) {

}

