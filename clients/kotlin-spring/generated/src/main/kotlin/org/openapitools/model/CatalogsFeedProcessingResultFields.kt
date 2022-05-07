package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedIngestionDetails
import org.openapitools.model.CatalogsFeedProcessingStatus
import org.openapitools.model.CatalogsFeedProductCounts
import org.openapitools.model.CatalogsFeedValidationDetails
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
 * @param ingestionDetails 
 * @param status 
 * @param productCounts 
 * @param validationDetails 
 */
data class CatalogsFeedProcessingResultFields(

    @field:Valid
    @field:JsonProperty("ingestion_details", required = true) val ingestionDetails: CatalogsFeedIngestionDetails,

    @field:Valid
    @field:JsonProperty("status", required = true) val status: CatalogsFeedProcessingStatus,

    @field:Valid
    @field:JsonProperty("product_counts", required = true) val productCounts: CatalogsFeedProductCounts,

    @field:Valid
    @field:JsonProperty("validation_details", required = true) val validationDetails: CatalogsFeedValidationDetails
) {

}

