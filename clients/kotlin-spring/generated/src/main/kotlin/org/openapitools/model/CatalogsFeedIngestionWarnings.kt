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
 * @param ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue.
 * @param ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue.
 * @param HOTEL_PRICE_HEADER_IS_PRESENT price is not a supported column. Use base_price and sale_price instead.
 */
data class CatalogsFeedIngestionWarnings(

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR") val ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE") val ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL") val ADDITIONAL_IMAGE_MALFORMED_URL: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND") val ADDITIONAL_IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE") val ADDITIONAL_IMAGE_INVALID_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "price is not a supported column. Use base_price and sale_price instead.")
    @get:JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT") val HOTEL_PRICE_HEADER_IS_PRESENT: kotlin.Int? = null
) {

}

