package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LeadsExportStatus
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
 * @param exportStatus 
 * @param downloadUrl 
 */
data class LeadsExportResponseData(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("export_status") val exportStatus: LeadsExportStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("download_url") val downloadUrl: kotlin.String? = null
    ) {

}

