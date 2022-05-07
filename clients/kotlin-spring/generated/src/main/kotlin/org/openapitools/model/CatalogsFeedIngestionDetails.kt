package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedIngestionErrors
import org.openapitools.model.CatalogsFeedIngestionInfo
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param errors 
 * @param info 
 */
data class CatalogsFeedIngestionDetails(

    @field:Valid
    @field:JsonProperty("errors", required = true) val errors: CatalogsFeedIngestionErrors,

    @field:Valid
    @field:JsonProperty("info", required = true) val info: CatalogsFeedIngestionInfo
) {

}

