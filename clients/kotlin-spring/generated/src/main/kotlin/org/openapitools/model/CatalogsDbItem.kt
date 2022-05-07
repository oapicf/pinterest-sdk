package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param createdAt 
 * @param id 
 * @param updatedAt 
 */
data class CatalogsDbItem(

    @field:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("updated_at") val updatedAt: java.time.OffsetDateTime? = null
) {

}

