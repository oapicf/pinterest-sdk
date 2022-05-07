package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param imageDownloadError 
 * @param imageDownloadConnectionTimeout 
 * @param imageFormatUnrecognize 
 * @param lineLevelInternalError 
 * @param largeProductCountDecrease 
 */
data class CatalogsFeedIngestionErrors(

    @field:JsonProperty("image_download_error") val imageDownloadError: kotlin.Int? = null,

    @field:JsonProperty("image_download_connection_timeout") val imageDownloadConnectionTimeout: kotlin.Int? = null,

    @field:JsonProperty("image_format_unrecognize") val imageFormatUnrecognize: kotlin.Int? = null,

    @field:JsonProperty("line_level_internal_error") val lineLevelInternalError: kotlin.Int? = null,

    @field:JsonProperty("large_product_count_decrease") val largeProductCountDecrease: CatalogsFeedIngestionErrors.LargeProductCountDecrease? = null
) {

    /**
    * 
    * Values: _1
    */
    enum class LargeProductCountDecrease(val value: kotlin.Int) {
    
        @JsonProperty(1) _1(1);
    
    }

}

