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
 * @param AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_400 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_403 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_404 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_405 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_410 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_429 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_500 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_502 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_503 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_504 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_507 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_508 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_520 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_521 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_522 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_525 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_IMAGE_DOWNLOAD_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_IMAGE_DOWNLOAD_INVALID_FILE Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_SITE_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_SITE_TIMEOUT Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_SSL_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_PROCESSING_EMPTY_FILE Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL Ad images must have a height larger than 75 pixels
 * @param AD_IMAGE_PROCESSING_TOO_MANY_PIXELS Ad images must have a maximum area (width x height) of less than 89478485 pixels
 * @param AD_IMAGE_PROCESSING_TYPE_MISMATCH Some ad images could not be processed due to a file type mismatch.
 * @param AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL Ad images must have a width larger than 75 pixels
 * @param AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_400 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_403 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_404 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_405 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_410 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_429 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_500 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_502 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_503 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_504 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_507 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_508 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_520 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_521 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_522 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_525 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_VIDEO_DOWNLOAD_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param AD_VIDEO_DOWNLOAD_INVALID_FILE Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_SITE_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_SITE_TIMEOUT Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_SSL_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_LENGTH_TOO_SHORT Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
 * @param AD_VIDEO_PROCESSING_EMPTY_FILE Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL Ad videos must have a height larger than 75 pixels
 * @param AD_VIDEO_PROCESSING_TOO_MANY_PIXELS Ad videos must have a maximum area (width x height) of less than 89478485 pixels
 * @param AD_VIDEO_PROCESSING_TYPE_MISMATCH Some ad videos could not be processed due to a file type mismatch.
 * @param AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL Ad videos must have a width larger than 75 pixels
 * @param ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue.
 * @param FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.
 * @param HOTEL_PRICE_HEADER_IS_PRESENT Price is not a supported column. Use base_price and sale_price instead.
 * @param VIDEO_DOWNLOAD_VIDEO_TOO_SHORT Video length is too short. Please ensure that the main video is at least 4 seconds long.
 * @param VIDEO_FILE_NOT_ACCESSIBLE Video files are unreadable. Please upload new files to continue.
 * @param VIDEO_FILE_NOT_FOUND Video files are unreadable. Please upload new files to continue.
 * @param VIDEO_INVALID_FILE Video files are unreadable. Please upload new files to continue.
 * @param VIDEO_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
 * @param VIDEO_MALFORMED_URL Video files are unreadable. Please check your link and upload new files to continue.
 */
data class CatalogsFeedIngestionWarnings(

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR") val AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR") val AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE") val AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND") val AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_400") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_403") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_404") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_405") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_410") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_429") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_500") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_502") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_503") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_504") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_507") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_508") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_520") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_521") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_522") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_525") val AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR") val AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_ERROR") val AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD") val AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL") val AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED") val AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED") val AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_INVALID_FILE") val AD_IMAGE_DOWNLOAD_INVALID_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_SITE_ERROR") val AD_IMAGE_DOWNLOAD_SITE_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_SITE_TIMEOUT") val AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_SSL_ERROR") val AD_IMAGE_DOWNLOAD_SSL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR") val AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_IMAGE_PROCESSING_EMPTY_FILE") val AD_IMAGE_PROCESSING_EMPTY_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad images must have a height larger than 75 pixels")
    @get:JsonProperty("AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL") val AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad images must have a maximum area (width x height) of less than 89478485 pixels")
    @get:JsonProperty("AD_IMAGE_PROCESSING_TOO_MANY_PIXELS") val AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: kotlin.Int? = null,

    @Schema(example = "null", description = "Some ad images could not be processed due to a file type mismatch.")
    @get:JsonProperty("AD_IMAGE_PROCESSING_TYPE_MISMATCH") val AD_IMAGE_PROCESSING_TYPE_MISMATCH: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad images must have a width larger than 75 pixels")
    @get:JsonProperty("AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL") val AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR") val AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR") val AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE") val AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND") val AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_400") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_403") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_404") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_405") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_410") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_429") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_500") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_502") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_503") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_504") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_507") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_508") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_520") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_521") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_522") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_525") val AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR") val AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_ERROR") val AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD") val AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL") val AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED") val AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED") val AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_INVALID_FILE") val AD_VIDEO_DOWNLOAD_INVALID_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_SITE_ERROR") val AD_VIDEO_DOWNLOAD_SITE_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_SITE_TIMEOUT") val AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_SSL_ERROR") val AD_VIDEO_DOWNLOAD_SSL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR") val AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.")
    @get:JsonProperty("AD_VIDEO_LENGTH_TOO_SHORT") val AD_VIDEO_LENGTH_TOO_SHORT: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("AD_VIDEO_PROCESSING_EMPTY_FILE") val AD_VIDEO_PROCESSING_EMPTY_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad videos must have a height larger than 75 pixels")
    @get:JsonProperty("AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL") val AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad videos must have a maximum area (width x height) of less than 89478485 pixels")
    @get:JsonProperty("AD_VIDEO_PROCESSING_TOO_MANY_PIXELS") val AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: kotlin.Int? = null,

    @Schema(example = "null", description = "Some ad videos could not be processed due to a file type mismatch.")
    @get:JsonProperty("AD_VIDEO_PROCESSING_TYPE_MISMATCH") val AD_VIDEO_PROCESSING_TYPE_MISMATCH: kotlin.Int? = null,

    @Schema(example = "null", description = "Ad videos must have a width larger than 75 pixels")
    @get:JsonProperty("AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL") val AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE") val ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND") val ADDITIONAL_IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE") val ADDITIONAL_IMAGE_INVALID_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR") val ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Additional image files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL") val ADDITIONAL_IMAGE_MALFORMED_URL: kotlin.Int? = null,

    @Schema(example = "null", description = "Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.")
    @get:JsonProperty("FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT") val FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: kotlin.Int? = null,

    @Schema(example = "null", description = "Price is not a supported column. Use base_price and sale_price instead.")
    @get:JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT") val HOTEL_PRICE_HEADER_IS_PRESENT: kotlin.Int? = null,

    @Schema(example = "null", description = "Video length is too short. Please ensure that the main video is at least 4 seconds long.")
    @get:JsonProperty("VIDEO_DOWNLOAD_VIDEO_TOO_SHORT") val VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: kotlin.Int? = null,

    @Schema(example = "null", description = "Video files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("VIDEO_FILE_NOT_ACCESSIBLE") val VIDEO_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @Schema(example = "null", description = "Video files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("VIDEO_FILE_NOT_FOUND") val VIDEO_FILE_NOT_FOUND: kotlin.Int? = null,

    @Schema(example = "null", description = "Video files are unreadable. Please upload new files to continue.")
    @get:JsonProperty("VIDEO_INVALID_FILE") val VIDEO_INVALID_FILE: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.")
    @get:JsonProperty("VIDEO_LEVEL_INTERNAL_ERROR") val VIDEO_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Video files are unreadable. Please check your link and upload new files to continue.")
    @get:JsonProperty("VIDEO_MALFORMED_URL") val VIDEO_MALFORMED_URL: kotlin.Int? = null
) {

}

