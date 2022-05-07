package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsDbItem
import org.openapitools.model.CatalogsFeedIngestionDetails
import org.openapitools.model.CatalogsFeedProcessingResultFields
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
 * @param createdAt 
 * @param id 
 * @param updatedAt 
 */
data class CatalogsFeedProcessingResult(

    @field:Valid
    @field:JsonProperty("ingestion_details", required = true) val ingestionDetails: CatalogsFeedIngestionDetails,

    @field:Valid
    @field:JsonProperty("status", required = true) val status: CatalogsFeedProcessingStatus,

    @field:Valid
    @field:JsonProperty("product_counts", required = true) val productCounts: CatalogsFeedProductCounts,

    @field:Valid
    @field:JsonProperty("validation_details", required = true) val validationDetails: CatalogsFeedValidationDetails,

    @field:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("updated_at") val updatedAt: java.time.OffsetDateTime? = null
) {

}

