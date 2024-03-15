package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param LINE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
 * @param LARGE_PRODUCT_COUNT_DECREASE The product count has decreased by more than 99% compared to the last successful ingestion.
 * @param ACCOUNT_FLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
 * @param IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
 * @param IMAGE_FILE_NOT_ACCESSIBLE Image files are unreadable. Please upload new files to continue.
 * @param IMAGE_MALFORMED_URL Image files are unreadable. Please check your link and upload new files to continue.
 * @param IMAGE_FILE_NOT_FOUND Image files are unreadable. Please upload new files to continue.
 * @param IMAGE_INVALID_FILE Image files are unreadable. Please upload new files to continue.
 */
data class CatalogsFeedIngestionErrors(

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.")
    @get:JsonProperty("LINE_LEVEL_INTERNAL_ERROR") val LINE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "The product count has decreased by more than 99% compared to the last successful ingestion.")
    @get:JsonProperty("LARGE_PRODUCT_COUNT_DECREASE") val LARGE_PRODUCT_COUNT_DECREASE: CatalogsFeedIngestionErrors.LARGEPRODUCTCOUNTDECREASE? = null,

    @Schema(example = "null", description = "We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.")
    @get:JsonProperty("ACCOUNT_FLAGGED") val ACCOUNT_FLAGGED: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR") val IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE") val IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @Schema(example = "null", description = "Image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("IMAGE_MALFORMED_URL") val IMAGE_MALFORMED_URL: kotlin.Int? = null,

    @Schema(example = "null", description = "Image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("IMAGE_FILE_NOT_FOUND") val IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,

    @Schema(example = "null", description = "Image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("IMAGE_INVALID_FILE") val IMAGE_INVALID_FILE: kotlin.Int? = null
) {

    /**
    * The product count has decreased by more than 99% compared to the last successful ingestion.
    * Values: _1
    */
    enum class LARGEPRODUCTCOUNTDECREASE(val value: kotlin.Int) {

        @JsonProperty(1) _1(1)
    }

}

