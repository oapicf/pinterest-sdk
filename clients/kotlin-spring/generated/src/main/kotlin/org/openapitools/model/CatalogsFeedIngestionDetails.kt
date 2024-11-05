package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedIngestionErrors
import org.openapitools.model.CatalogsFeedIngestionInfo
import org.openapitools.model.CatalogsFeedIngestionWarnings
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
 * @param errors 
 * @param info 
 * @param warnings 
 */
data class CatalogsFeedIngestionDetails(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("errors", required = true) val errors: CatalogsFeedIngestionErrors,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("info", required = true) val info: CatalogsFeedIngestionInfo,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("warnings", required = true) val warnings: CatalogsFeedIngestionWarnings
    ) {

}

