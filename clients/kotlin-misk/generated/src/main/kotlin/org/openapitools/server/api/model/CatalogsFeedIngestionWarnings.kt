package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedIngestionWarnings(
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_INVALID_FILE: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_SITE_ERROR: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_SSL_ERROR: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: kotlin.Int? = null,
    /** Ad image files are unreadable. Please check your link and upload new files to continue. */
    val AD_IMAGE_PROCESSING_EMPTY_FILE: kotlin.Int? = null,
    /** Ad images must have a height larger than 75 pixels */
    val AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: kotlin.Int? = null,
    /** Ad images must have a maximum area (width x height) of less than 89478485 pixels */
    val AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: kotlin.Int? = null,
    /** Some ad images could not be processed due to a file type mismatch. */
    val AD_IMAGE_PROCESSING_TYPE_MISMATCH: kotlin.Int? = null,
    /** Ad images must have a width larger than 75 pixels */
    val AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_INVALID_FILE: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_SITE_ERROR: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_SSL_ERROR: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: kotlin.Int? = null,
    /** Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long. */
    val AD_VIDEO_LENGTH_TOO_SHORT: kotlin.Int? = null,
    /** Ad video files are unreadable. Please check your link and upload new files to continue. */
    val AD_VIDEO_PROCESSING_EMPTY_FILE: kotlin.Int? = null,
    /** Ad videos must have a height larger than 75 pixels */
    val AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: kotlin.Int? = null,
    /** Ad videos must have a maximum area (width x height) of less than 89478485 pixels */
    val AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: kotlin.Int? = null,
    /** Some ad videos could not be processed due to a file type mismatch. */
    val AD_VIDEO_PROCESSING_TYPE_MISMATCH: kotlin.Int? = null,
    /** Ad videos must have a width larger than 75 pixels */
    val AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: kotlin.Int? = null,
    /** Additional image files are unreadable. Please upload new files to continue. */
    val ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,
    /** Additional image files are unreadable. Please upload new files to continue. */
    val ADDITIONAL_IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,
    /** Additional image files are unreadable. Please upload new files to continue. */
    val ADDITIONAL_IMAGE_INVALID_FILE: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    val ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,
    /** Additional image files are unreadable. Please check your link and upload new files to continue. */
    val ADDITIONAL_IMAGE_MALFORMED_URL: kotlin.Int? = null,
    /** Update your Google Sheets sharing settings from &#39;Editor&#39; to &#39;Viewer&#39;. */
    val FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: kotlin.Int? = null,
    /** Price is not a supported column. Use base_price and sale_price instead. */
    val HOTEL_PRICE_HEADER_IS_PRESENT: kotlin.Int? = null,
    /** Video length is too short. Please ensure that the main video is at least 4 seconds long. */
    val VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: kotlin.Int? = null,
    /** Video files are unreadable. Please upload new files to continue. */
    val VIDEO_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,
    /** Video files are unreadable. Please upload new files to continue. */
    val VIDEO_FILE_NOT_FOUND: kotlin.Int? = null,
    /** Video files are unreadable. Please upload new files to continue. */
    val VIDEO_INVALID_FILE: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours. */
    val VIDEO_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,
    /** Video files are unreadable. Please check your link and upload new files to continue. */
    val VIDEO_MALFORMED_URL: kotlin.Int? = null
)
