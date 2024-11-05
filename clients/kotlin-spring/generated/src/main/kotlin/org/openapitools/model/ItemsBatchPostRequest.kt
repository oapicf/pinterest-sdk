package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BatchOperation
import org.openapitools.model.CatalogsItemsBatchRequest
import org.openapitools.model.CatalogsItemsRequestLanguage
import org.openapitools.model.CatalogsVerticalBatchRequest
import org.openapitools.model.Country
import org.openapitools.model.ItemDeleteBatchRecord
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
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
data class ItemsBatchPostRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: CatalogsItemsRequestLanguage,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: BatchOperation,

    @field:Valid
    @Schema(example = "null", required = true, description = "Array with catalogs items")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<ItemDeleteBatchRecord>,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: ItemsBatchPostRequest.CatalogType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
    @get:JsonProperty("catalog_id") override val catalogId: kotlin.String? = null
    ) {

}

