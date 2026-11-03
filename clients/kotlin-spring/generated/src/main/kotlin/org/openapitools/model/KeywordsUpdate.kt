package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.KeywordUpdateItem
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
 * Resource create or update operation model.
 * @param keywords Keywords
 */
data class KeywordsUpdate(

    @field:Valid
    @Schema(description = "Keywords")
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<KeywordUpdateItem>? = null
) {

}

