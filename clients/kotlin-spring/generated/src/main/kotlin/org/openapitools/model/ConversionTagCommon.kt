package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ConversionTagConfigs
import org.openapitools.model.EnhancedMatchStatusType
import org.openapitools.model.EntityStatus
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
 * @param adAccountId Ad account ID.
 * @param codeSnippet Tag code snippet.
 * @param enhancedMatchStatus 
 * @param id Tag ID.
 * @param lastFiredTimeMs Time for the last event fired.
 * @param name Conversion tag name.
 * @param status 
 * @param version Version number.
 * @param configs 
 */
data class ConversionTagCommon(

    @Schema(example = "549755885175", description = "Ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "<script type=text/javascript> [...]", description = "Tag code snippet.")
    @get:JsonProperty("code_snippet") val codeSnippet: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("enhanced_match_status") val enhancedMatchStatus: EnhancedMatchStatusType? = null,

    @Schema(example = "2617998078212", description = "Tag ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "1599030000000", description = "Time for the last event fired.")
    @get:JsonProperty("last_fired_time_ms") val lastFiredTimeMs: java.math.BigDecimal? = null,

    @Schema(example = "ACME Checkout Test Tag", description = "Conversion tag name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @Schema(example = "3", description = "Version number.")
    @get:JsonProperty("version") val version: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("configs") val configs: ConversionTagConfigs? = null
) {

}

