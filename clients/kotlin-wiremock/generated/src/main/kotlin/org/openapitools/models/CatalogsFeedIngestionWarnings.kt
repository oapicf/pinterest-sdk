@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedIngestionWarnings(
    @field:JsonProperty("AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR")
    val AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR")
    val AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE")
    val AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND")
    val AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_400")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_403")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_404")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_405")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_410")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_429")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_500")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_502")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_503")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_504")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_507")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_508")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_520")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_521")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_522")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_525")
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR")
    val AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_ERROR")
    val AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD")
    val AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL")
    val AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED")
    val AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED")
    val AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_INVALID_FILE")
    val AD_IMAGE_DOWNLOAD_INVALID_FILE: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_SITE_ERROR")
    val AD_IMAGE_DOWNLOAD_SITE_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_SITE_TIMEOUT")
    val AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_SSL_ERROR")
    val AD_IMAGE_DOWNLOAD_SSL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR")
    val AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_PROCESSING_EMPTY_FILE")
    val AD_IMAGE_PROCESSING_EMPTY_FILE: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL")
    val AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_PROCESSING_TOO_MANY_PIXELS")
    val AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_PROCESSING_TYPE_MISMATCH")
    val AD_IMAGE_PROCESSING_TYPE_MISMATCH: kotlin.Int? = null,

    @field:JsonProperty("AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL")
    val AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR")
    val AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR")
    val AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE")
    val AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND")
    val AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_400")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_403")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_404")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_405")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_410")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_429")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_500")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_502")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_503")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_504")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_507")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_508")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_520")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_521")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_522")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_525")
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR")
    val AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_ERROR")
    val AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD")
    val AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL")
    val AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED")
    val AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED")
    val AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_INVALID_FILE")
    val AD_VIDEO_DOWNLOAD_INVALID_FILE: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_SITE_ERROR")
    val AD_VIDEO_DOWNLOAD_SITE_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_SITE_TIMEOUT")
    val AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_SSL_ERROR")
    val AD_VIDEO_DOWNLOAD_SSL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR")
    val AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_LENGTH_TOO_SHORT")
    val AD_VIDEO_LENGTH_TOO_SHORT: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_PROCESSING_EMPTY_FILE")
    val AD_VIDEO_PROCESSING_EMPTY_FILE: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL")
    val AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_PROCESSING_TOO_MANY_PIXELS")
    val AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_PROCESSING_TYPE_MISMATCH")
    val AD_VIDEO_PROCESSING_TYPE_MISMATCH: kotlin.Int? = null,

    @field:JsonProperty("AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL")
    val AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: kotlin.Int? = null,

    @field:JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")
    val ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @field:JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND")
    val ADDITIONAL_IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,

    @field:JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE")
    val ADDITIONAL_IMAGE_INVALID_FILE: kotlin.Int? = null,

    @field:JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")
    val ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL")
    val ADDITIONAL_IMAGE_MALFORMED_URL: kotlin.Int? = null,

    @field:JsonProperty("FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT")
    val FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: kotlin.Int? = null,

    @field:JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT")
    val HOTEL_PRICE_HEADER_IS_PRESENT: kotlin.Int? = null,

    @field:JsonProperty("VIDEO_DOWNLOAD_VIDEO_TOO_SHORT")
    val VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: kotlin.Int? = null,

    @field:JsonProperty("VIDEO_FILE_NOT_ACCESSIBLE")
    val VIDEO_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @field:JsonProperty("VIDEO_FILE_NOT_FOUND")
    val VIDEO_FILE_NOT_FOUND: kotlin.Int? = null,

    @field:JsonProperty("VIDEO_INVALID_FILE")
    val VIDEO_INVALID_FILE: kotlin.Int? = null,

    @field:JsonProperty("VIDEO_LEVEL_INTERNAL_ERROR")
    val VIDEO_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("VIDEO_MALFORMED_URL")
    val VIDEO_MALFORMED_URL: kotlin.Int? = null,

)
