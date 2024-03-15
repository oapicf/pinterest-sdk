package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param createdAt 
 * @param id 
 * @param updatedAt 
 */
data class CatalogsDbItem(

    @Schema(example = "2022-03-14T15:15:22Z", description = "")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "2022-03-14T15:16:34Z", description = "")
    @get:JsonProperty("updated_at") val updatedAt: java.time.OffsetDateTime? = null
) {

}

