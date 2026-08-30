package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.KeywordInfo
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
 * Information of the published editorial article.
 * @param boardUrl URL of the editorial board
 * @param description Description of the editorial article
 * @param interests List of interests related to the editorial article
 * @param pinsUrl URL of the pins related to the editorial article
 * @param relatedKeywords List of keywords related to the editorial article
 * @param title Title of the editorial article
 */
data class TrendsEditorial(

    @Schema(required = true, description = "URL of the editorial board")
    @param:JsonProperty("board_url")
    @get:JsonProperty("board_url", required = true) val boardUrl: kotlin.String,

    @Schema(required = true, description = "Description of the editorial article")
    @param:JsonProperty("description")
    @get:JsonProperty("description", required = true) val description: kotlin.String,

    @Schema(required = true, description = "List of interests related to the editorial article")
    @param:JsonProperty("interests")
    @get:JsonProperty("interests", required = true) val interests: kotlin.collections.List<kotlin.String>,

    @Schema(required = true, description = "URL of the pins related to the editorial article")
    @param:JsonProperty("pins_url")
    @get:JsonProperty("pins_url", required = true) val pinsUrl: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(required = true, description = "List of keywords related to the editorial article")
    @param:JsonProperty("related_keywords")
    @get:JsonProperty("related_keywords", required = true) val relatedKeywords: kotlin.collections.List<KeywordInfo>,

    @Schema(required = true, description = "Title of the editorial article")
    @param:JsonProperty("title")
    @get:JsonProperty("title", required = true) val title: kotlin.String
) {

}

