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
 * @param downloadUrl 
 * @param exportStatus 
 */
data class LeadsExportResponseData(

    @Schema(description = "")
    @param:JsonProperty("download_url")
    @get:JsonProperty("download_url") val downloadUrl: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("export_status")
    @get:JsonProperty("export_status") val exportStatus: LeadsExportStatus? = null
) {

}

