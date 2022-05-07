package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria
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
 * @param ITEM_GROUP_ID 
 */
data class ItemGroupIdFilter(

    @field:Valid
    @field:JsonProperty("ITEM_GROUP_ID", required = true) val ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria
) {

}

