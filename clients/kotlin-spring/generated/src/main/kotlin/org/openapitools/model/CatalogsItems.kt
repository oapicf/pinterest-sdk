package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemBatchRecord
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Response object of catalogs items
 * @param items Array with catalogs items
 */
data class CatalogsItems(

    @field:Valid
    @field:JsonProperty("items") val items: kotlin.collections.List<ItemBatchRecord>? = null
) {

}

