package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.KeywordCreateItem
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
 * Resource create operation model.
 * @param keywords Keywords
 * @param parentId Keyword data
 */
data class KeywordsCreate(

    @field:Valid
    @Schema(required = true, description = "Keywords")
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords", required = true) val keywords: kotlin.collections.List<KeywordCreateItem>,

    @Schema(required = true, description = "Keyword data")
    @param:JsonProperty("parent_id")
    @get:JsonProperty("parent_id", required = true) val parentId: kotlin.String
) {

}

