package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConversionTagConfigs
import org.openapitools.model.EnhancedMatchStatusType
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
 * @param name Conversion tag name.
 * @param codeSnippet Tag code snippet.
 * @param configs 
 * @param enhancedMatchStatus The enhanced match status of the tag
 * @param id Tag ID.
 * @param lastFiredTimeMs Time for the last event fired.
 * @param version Version number.
 */
data class ConversionTagCommon(

    @Schema(example = "download_picture", required = true, description = "Conversion tag name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "<script type=text/javascript> [...]", readOnly = true, description = "Tag code snippet.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("code_snippet")
    @get:JsonProperty("code_snippet") val codeSnippet: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("configs")
    @get:JsonProperty("configs") val configs: ConversionTagConfigs? = null,

    @field:Valid
    @Schema(example = "VALIDATION_COMPLETE", readOnly = true, description = "The enhanced match status of the tag")
    @param:JsonProperty("enhanced_match_status")
    @get:JsonProperty("enhanced_match_status") val enhancedMatchStatus: EnhancedMatchStatusType? = null,

    @Schema(example = "2617998078212", readOnly = true, description = "Tag ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "1599030000000", readOnly = true, description = "Time for the last event fired.")
    @param:JsonProperty("last_fired_time_ms")
    @get:JsonProperty("last_fired_time_ms") val lastFiredTimeMs: java.math.BigDecimal? = null,

    @Schema(example = "3", readOnly = true, description = "Version number.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("version")
    @get:JsonProperty("version") val version: kotlin.String? = null
) {

}

