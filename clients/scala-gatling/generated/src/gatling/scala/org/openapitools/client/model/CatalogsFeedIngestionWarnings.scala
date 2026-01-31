
package org.openapitools.client.model


case class CatalogsFeedIngestionWarnings (
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_INVALID_FILE: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_SITE_ERROR: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_SSL_ERROR: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: Option[Integer],
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    _AD_IMAGE_PROCESSING_EMPTY_FILE: Option[Integer],
    /* Ad images must have a height larger than 75 pixels */
    _AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: Option[Integer],
    /* Ad images must have a maximum area (width x height) of less than 89478485 pixels */
    _AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: Option[Integer],
    /* Some ad images could not be processed due to a file type mismatch. */
    _AD_IMAGE_PROCESSING_TYPE_MISMATCH: Option[Integer],
    /* Ad images must have a width larger than 75 pixels */
    _AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_INVALID_FILE: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_SITE_ERROR: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_SSL_ERROR: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: Option[Integer],
    /* Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long. */
    _AD_VIDEO_LENGTH_TOO_SHORT: Option[Integer],
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    _AD_VIDEO_PROCESSING_EMPTY_FILE: Option[Integer],
    /* Ad videos must have a height larger than 75 pixels */
    _AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: Option[Integer],
    /* Ad videos must have a maximum area (width x height) of less than 89478485 pixels */
    _AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: Option[Integer],
    /* Some ad videos could not be processed due to a file type mismatch. */
    _AD_VIDEO_PROCESSING_TYPE_MISMATCH: Option[Integer],
    /* Ad videos must have a width larger than 75 pixels */
    _AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: Option[Integer],
    /* Additional image files are unreadable. Please upload new files to continue. */
    _ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Additional image files are unreadable. Please upload new files to continue. */
    _ADDITIONAL_IMAGE_FILE_NOT_FOUND: Option[Integer],
    /* Additional image files are unreadable. Please upload new files to continue. */
    _ADDITIONAL_IMAGE_INVALID_FILE: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Option[Integer],
    /* Additional image files are unreadable. Please check your link and upload new files to continue. */
    _ADDITIONAL_IMAGE_MALFORMED_URL: Option[Integer],
    /* Update your Google Sheets sharing settings from 'Editor' to 'Viewer'. */
    _FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: Option[Integer],
    /* Price is not a supported column. Use base_price and sale_price instead. */
    _HOTEL_PRICE_HEADER_IS_PRESENT: Option[Integer],
    /* Video length is too short. Please ensure that the main video is at least 4 seconds long. */
    _VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: Option[Integer],
    /* Video files are unreadable. Please upload new files to continue. */
    _VIDEO_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Video files are unreadable. Please upload new files to continue. */
    _VIDEO_FILE_NOT_FOUND: Option[Integer],
    /* Video files are unreadable. Please upload new files to continue. */
    _VIDEO_INVALID_FILE: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours. */
    _VIDEO_LEVEL_INTERNAL_ERROR: Option[Integer],
    /* Video files are unreadable. Please check your link and upload new files to continue. */
    _VIDEO_MALFORMED_URL: Option[Integer]
)
object CatalogsFeedIngestionWarnings {
    def toStringBody(var_AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: Object, var_AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: Object, var_AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: Object, var_AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: Object, var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: Object, var_AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: Object, var_AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: Object, var_AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: Object, var_AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: Object, var_AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: Object, var_AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: Object, var_AD_IMAGE_DOWNLOAD_INVALID_FILE: Object, var_AD_IMAGE_DOWNLOAD_SITE_ERROR: Object, var_AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: Object, var_AD_IMAGE_DOWNLOAD_SSL_ERROR: Object, var_AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: Object, var_AD_IMAGE_PROCESSING_EMPTY_FILE: Object, var_AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: Object, var_AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: Object, var_AD_IMAGE_PROCESSING_TYPE_MISMATCH: Object, var_AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: Object, var_AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: Object, var_AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: Object, var_AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: Object, var_AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: Object, var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: Object, var_AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: Object, var_AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: Object, var_AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: Object, var_AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: Object, var_AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: Object, var_AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: Object, var_AD_VIDEO_DOWNLOAD_INVALID_FILE: Object, var_AD_VIDEO_DOWNLOAD_SITE_ERROR: Object, var_AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: Object, var_AD_VIDEO_DOWNLOAD_SSL_ERROR: Object, var_AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: Object, var_AD_VIDEO_LENGTH_TOO_SHORT: Object, var_AD_VIDEO_PROCESSING_EMPTY_FILE: Object, var_AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: Object, var_AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: Object, var_AD_VIDEO_PROCESSING_TYPE_MISMATCH: Object, var_AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: Object, var_ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Object, var_ADDITIONAL_IMAGE_FILE_NOT_FOUND: Object, var_ADDITIONAL_IMAGE_INVALID_FILE: Object, var_ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Object, var_ADDITIONAL_IMAGE_MALFORMED_URL: Object, var_FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: Object, var_HOTEL_PRICE_HEADER_IS_PRESENT: Object, var_VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: Object, var_VIDEO_FILE_NOT_ACCESSIBLE: Object, var_VIDEO_FILE_NOT_FOUND: Object, var_VIDEO_INVALID_FILE: Object, var_VIDEO_LEVEL_INTERNAL_ERROR: Object, var_VIDEO_MALFORMED_URL: Object) =
        s"""
        | {
        | "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR":$var_AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR,"AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR":$var_AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR,"AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE":$var_AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE,"AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND":$var_AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_400":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_400,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_403":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_403,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_404":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_404,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_405":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_405,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_410":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_410,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_429":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_429,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_500":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_500,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_502":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_502,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_503":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_503,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_504":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_504,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_507":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_507,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_508":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_508,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_520":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_520,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_521":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_521,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_522":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_522,"AD_IMAGE_DOWNLOAD_HTTP_STATUS_525":$var_AD_IMAGE_DOWNLOAD_HTTP_STATUS_525,"AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR":$var_AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR,"AD_IMAGE_DOWNLOAD_INTERNAL_ERROR":$var_AD_IMAGE_DOWNLOAD_INTERNAL_ERROR,"AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD":$var_AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD,"AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL":$var_AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL,"AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED":$var_AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED,"AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED":$var_AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED,"AD_IMAGE_DOWNLOAD_INVALID_FILE":$var_AD_IMAGE_DOWNLOAD_INVALID_FILE,"AD_IMAGE_DOWNLOAD_SITE_ERROR":$var_AD_IMAGE_DOWNLOAD_SITE_ERROR,"AD_IMAGE_DOWNLOAD_SITE_TIMEOUT":$var_AD_IMAGE_DOWNLOAD_SITE_TIMEOUT,"AD_IMAGE_DOWNLOAD_SSL_ERROR":$var_AD_IMAGE_DOWNLOAD_SSL_ERROR,"AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR":$var_AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR,"AD_IMAGE_PROCESSING_EMPTY_FILE":$var_AD_IMAGE_PROCESSING_EMPTY_FILE,"AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL":$var_AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL,"AD_IMAGE_PROCESSING_TOO_MANY_PIXELS":$var_AD_IMAGE_PROCESSING_TOO_MANY_PIXELS,"AD_IMAGE_PROCESSING_TYPE_MISMATCH":$var_AD_IMAGE_PROCESSING_TYPE_MISMATCH,"AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL":$var_AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL,"AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR":$var_AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR,"AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR":$var_AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR,"AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE":$var_AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE,"AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND":$var_AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_400":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_400,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_403":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_403,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_404":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_404,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_405":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_405,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_410":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_410,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_429":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_429,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_500":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_500,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_502":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_502,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_503":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_503,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_504":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_504,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_507":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_507,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_508":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_508,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_520":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_520,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_521":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_521,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_522":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_522,"AD_VIDEO_DOWNLOAD_HTTP_STATUS_525":$var_AD_VIDEO_DOWNLOAD_HTTP_STATUS_525,"AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR":$var_AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR,"AD_VIDEO_DOWNLOAD_INTERNAL_ERROR":$var_AD_VIDEO_DOWNLOAD_INTERNAL_ERROR,"AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD":$var_AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD,"AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL":$var_AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL,"AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED":$var_AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED,"AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED":$var_AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED,"AD_VIDEO_DOWNLOAD_INVALID_FILE":$var_AD_VIDEO_DOWNLOAD_INVALID_FILE,"AD_VIDEO_DOWNLOAD_SITE_ERROR":$var_AD_VIDEO_DOWNLOAD_SITE_ERROR,"AD_VIDEO_DOWNLOAD_SITE_TIMEOUT":$var_AD_VIDEO_DOWNLOAD_SITE_TIMEOUT,"AD_VIDEO_DOWNLOAD_SSL_ERROR":$var_AD_VIDEO_DOWNLOAD_SSL_ERROR,"AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR":$var_AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR,"AD_VIDEO_LENGTH_TOO_SHORT":$var_AD_VIDEO_LENGTH_TOO_SHORT,"AD_VIDEO_PROCESSING_EMPTY_FILE":$var_AD_VIDEO_PROCESSING_EMPTY_FILE,"AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL":$var_AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL,"AD_VIDEO_PROCESSING_TOO_MANY_PIXELS":$var_AD_VIDEO_PROCESSING_TOO_MANY_PIXELS,"AD_VIDEO_PROCESSING_TYPE_MISMATCH":$var_AD_VIDEO_PROCESSING_TYPE_MISMATCH,"AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL":$var_AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL,"ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE":$var_ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE,"ADDITIONAL_IMAGE_FILE_NOT_FOUND":$var_ADDITIONAL_IMAGE_FILE_NOT_FOUND,"ADDITIONAL_IMAGE_INVALID_FILE":$var_ADDITIONAL_IMAGE_INVALID_FILE,"ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR":$var_ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR,"ADDITIONAL_IMAGE_MALFORMED_URL":$var_ADDITIONAL_IMAGE_MALFORMED_URL,"FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT":$var_FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT,"HOTEL_PRICE_HEADER_IS_PRESENT":$var_HOTEL_PRICE_HEADER_IS_PRESENT,"VIDEO_DOWNLOAD_VIDEO_TOO_SHORT":$var_VIDEO_DOWNLOAD_VIDEO_TOO_SHORT,"VIDEO_FILE_NOT_ACCESSIBLE":$var_VIDEO_FILE_NOT_ACCESSIBLE,"VIDEO_FILE_NOT_FOUND":$var_VIDEO_FILE_NOT_FOUND,"VIDEO_INVALID_FILE":$var_VIDEO_INVALID_FILE,"VIDEO_LEVEL_INTERNAL_ERROR":$var_VIDEO_LEVEL_INTERNAL_ERROR,"VIDEO_MALFORMED_URL":$var_VIDEO_MALFORMED_URL
        | }
        """.stripMargin
}
