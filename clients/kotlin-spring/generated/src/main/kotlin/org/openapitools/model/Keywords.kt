package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Keyword
import org.openapitools.model.KeywordError
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
 * @param errors Keyword error
 * @param keywords Keywords
 */
data class Keywords(

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Keyword error")
    @param:JsonProperty("errors")
    @get:JsonProperty("errors", required = true) val errors: kotlin.collections.List<KeywordError>,

    @field:Valid
    @Schema(required = true, description = "Keywords")
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords", required = true) val keywords: kotlin.collections.List<Keyword>
) {

}

