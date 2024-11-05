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
 * Keyword metrics JSON
 * @param avgCpcInMicroCurrency Average cost per click
 * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
 */
data class KeywordMetrics(

    @Schema(example = "100000", description = "Average cost per click")
    @get:JsonProperty("avg_cpc_in_micro_currency") val avgCpcInMicroCurrency: java.math.BigDecimal? = null,

    @Schema(example = "5M+", description = "Keyword's search frequency. This value is based on keyword frequency in pepsi client response")
    @get:JsonProperty("keyword_query_volume") val keywordQueryVolume: kotlin.String? = null
    ) {

}

