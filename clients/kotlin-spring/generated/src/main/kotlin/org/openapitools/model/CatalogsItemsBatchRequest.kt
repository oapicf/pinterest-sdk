package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BatchOperation
import org.openapitools.model.Country
import org.openapitools.model.ItemBatchRecord
import org.openapitools.model.Language
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Request object of catalogs items batch
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
data class CatalogsItemsBatchRequest(

    @field:Valid
    @field:JsonProperty("country") val country: Country? = null,

    @field:Valid
    @field:JsonProperty("language") val language: Language? = null,

    @field:Valid
    @field:JsonProperty("operation") val operation: BatchOperation? = null,

    @field:Valid
    @field:JsonProperty("items") val items: kotlin.collections.List<ItemBatchRecord>? = null
) {

}

