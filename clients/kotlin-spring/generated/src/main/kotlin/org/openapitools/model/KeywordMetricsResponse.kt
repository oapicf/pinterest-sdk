package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.KeywordMetrics
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
 * @param keyword Keyword name, e.g., \"keyword\":\"fashion outfits\"
 * @param metrics 
 */
data class KeywordMetricsResponse(

    @Schema(example = "animals", description = "Keyword name, e.g., \"keyword\":\"fashion outfits\"")
    @get:JsonProperty("keyword") val keyword: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("metrics") val metrics: KeywordMetrics? = null
    ) {

}

