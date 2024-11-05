package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BatchOperation
import org.openapitools.model.CatalogsItemsCreateBatchRequest
import org.openapitools.model.CatalogsItemsDeleteBatchRequest
import org.openapitools.model.CatalogsItemsDeleteDiscontinuedBatchRequest
import org.openapitools.model.CatalogsItemsRequestLanguage
import org.openapitools.model.CatalogsItemsUpdateBatchRequest
import org.openapitools.model.CatalogsItemsUpsertBatchRequest
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
 * Request object of catalogs items batch
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsItemsCreateBatchRequest::class, name = "CREATE"),
      JsonSubTypes.Type(value = CatalogsItemsDeleteBatchRequest::class, name = "DELETE"),
      JsonSubTypes.Type(value = CatalogsItemsDeleteDiscontinuedBatchRequest::class, name = "DELETE_DISCONTINUED"),
      JsonSubTypes.Type(value = CatalogsItemsUpdateBatchRequest::class, name = "UPDATE"),
      JsonSubTypes.Type(value = CatalogsItemsUpsertBatchRequest::class, name = "UPSERT")
)

interface CatalogsItemsBatchRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val country: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val language: CatalogsItemsRequestLanguage

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val operation: BatchOperation

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "Array with catalogs items")
        val items: kotlin.collections.List<ItemDeleteBatchRecord>


}

