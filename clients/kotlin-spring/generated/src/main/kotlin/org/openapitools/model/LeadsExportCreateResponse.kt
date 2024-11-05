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
 * @param leadsExportId ID for the leads export job
 */
data class LeadsExportCreateResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "123456789012", description = "ID for the leads export job")
    @get:JsonProperty("leads_export_id") val leadsExportId: kotlin.String? = null
    ) {

}

