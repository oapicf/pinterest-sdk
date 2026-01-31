#' Create a new CatalogsFeedIngestionWarnings
#'
#' @description
#' CatalogsFeedIngestionWarnings Class
#'
#' @docType class
#' @title CatalogsFeedIngestionWarnings
#' @description CatalogsFeedIngestionWarnings Class
#' @format An \code{R6Class} generator object
#' @field AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_400 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_403 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_404 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_405 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_410 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_429 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_500 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_502 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_503 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_504 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_507 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_508 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_520 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_521 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_522 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_HTTP_STATUS_525 Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_INVALID_FILE Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_SITE_ERROR Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_SITE_TIMEOUT Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_SSL_ERROR Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_PROCESSING_EMPTY_FILE Ad image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL Ad images must have a height larger than 75 pixels integer [optional]
#' @field AD_IMAGE_PROCESSING_TOO_MANY_PIXELS Ad images must have a maximum area (width x height) of less than 89478485 pixels integer [optional]
#' @field AD_IMAGE_PROCESSING_TYPE_MISMATCH Some ad images could not be processed due to a file type mismatch. integer [optional]
#' @field AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL Ad images must have a width larger than 75 pixels integer [optional]
#' @field AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_400 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_403 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_404 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_405 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_410 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_429 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_500 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_502 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_503 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_504 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_507 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_508 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_520 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_521 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_522 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_HTTP_STATUS_525 Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_INVALID_FILE Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_SITE_ERROR Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_SITE_TIMEOUT Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_SSL_ERROR Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_LENGTH_TOO_SHORT Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long. integer [optional]
#' @field AD_VIDEO_PROCESSING_EMPTY_FILE Ad video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL Ad videos must have a height larger than 75 pixels integer [optional]
#' @field AD_VIDEO_PROCESSING_TOO_MANY_PIXELS Ad videos must have a maximum area (width x height) of less than 89478485 pixels integer [optional]
#' @field AD_VIDEO_PROCESSING_TYPE_MISMATCH Some ad videos could not be processed due to a file type mismatch. integer [optional]
#' @field AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL Ad videos must have a width larger than 75 pixels integer [optional]
#' @field ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue. integer [optional]
#' @field ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue. integer [optional]
#' @field ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue. integer [optional]
#' @field ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT Update your Google Sheets sharing settings from 'Editor' to 'Viewer'. integer [optional]
#' @field HOTEL_PRICE_HEADER_IS_PRESENT Price is not a supported column. Use base_price and sale_price instead. integer [optional]
#' @field VIDEO_DOWNLOAD_VIDEO_TOO_SHORT Video length is too short. Please ensure that the main video is at least 4 seconds long. integer [optional]
#' @field VIDEO_FILE_NOT_ACCESSIBLE Video files are unreadable. Please upload new files to continue. integer [optional]
#' @field VIDEO_FILE_NOT_FOUND Video files are unreadable. Please upload new files to continue. integer [optional]
#' @field VIDEO_INVALID_FILE Video files are unreadable. Please upload new files to continue. integer [optional]
#' @field VIDEO_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours. integer [optional]
#' @field VIDEO_MALFORMED_URL Video files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedIngestionWarnings <- R6::R6Class(
  "CatalogsFeedIngestionWarnings",
  public = list(
    `AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` = NULL,
    `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` = NULL,
    `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` = NULL,
    `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` = NULL,
    `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` = NULL,
    `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` = NULL,
    `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` = NULL,
    `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` = NULL,
    `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` = NULL,
    `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` = NULL,
    `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` = NULL,
    `AD_IMAGE_DOWNLOAD_INVALID_FILE` = NULL,
    `AD_IMAGE_DOWNLOAD_SITE_ERROR` = NULL,
    `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` = NULL,
    `AD_IMAGE_DOWNLOAD_SSL_ERROR` = NULL,
    `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` = NULL,
    `AD_IMAGE_PROCESSING_EMPTY_FILE` = NULL,
    `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` = NULL,
    `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` = NULL,
    `AD_IMAGE_PROCESSING_TYPE_MISMATCH` = NULL,
    `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` = NULL,
    `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` = NULL,
    `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` = NULL,
    `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` = NULL,
    `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` = NULL,
    `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` = NULL,
    `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` = NULL,
    `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` = NULL,
    `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` = NULL,
    `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` = NULL,
    `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` = NULL,
    `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` = NULL,
    `AD_VIDEO_DOWNLOAD_INVALID_FILE` = NULL,
    `AD_VIDEO_DOWNLOAD_SITE_ERROR` = NULL,
    `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` = NULL,
    `AD_VIDEO_DOWNLOAD_SSL_ERROR` = NULL,
    `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` = NULL,
    `AD_VIDEO_LENGTH_TOO_SHORT` = NULL,
    `AD_VIDEO_PROCESSING_EMPTY_FILE` = NULL,
    `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` = NULL,
    `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` = NULL,
    `AD_VIDEO_PROCESSING_TYPE_MISMATCH` = NULL,
    `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` = NULL,
    `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` = NULL,
    `ADDITIONAL_IMAGE_FILE_NOT_FOUND` = NULL,
    `ADDITIONAL_IMAGE_INVALID_FILE` = NULL,
    `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` = NULL,
    `ADDITIONAL_IMAGE_MALFORMED_URL` = NULL,
    `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` = NULL,
    `HOTEL_PRICE_HEADER_IS_PRESENT` = NULL,
    `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` = NULL,
    `VIDEO_FILE_NOT_ACCESSIBLE` = NULL,
    `VIDEO_FILE_NOT_FOUND` = NULL,
    `VIDEO_INVALID_FILE` = NULL,
    `VIDEO_LEVEL_INTERNAL_ERROR` = NULL,
    `VIDEO_MALFORMED_URL` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedIngestionWarnings class.
    #'
    #' @param AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_400 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_403 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_404 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_405 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_410 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_429 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_500 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_502 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_503 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_504 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_507 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_508 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_520 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_521 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_522 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_HTTP_STATUS_525 Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_IMAGE_DOWNLOAD_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_IMAGE_DOWNLOAD_INVALID_FILE Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_SITE_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_SITE_TIMEOUT Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_SSL_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_PROCESSING_EMPTY_FILE Ad image files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL Ad images must have a height larger than 75 pixels
    #' @param AD_IMAGE_PROCESSING_TOO_MANY_PIXELS Ad images must have a maximum area (width x height) of less than 89478485 pixels
    #' @param AD_IMAGE_PROCESSING_TYPE_MISMATCH Some ad images could not be processed due to a file type mismatch.
    #' @param AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL Ad images must have a width larger than 75 pixels
    #' @param AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_400 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_403 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_404 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_405 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_410 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_429 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_500 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_502 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_503 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_504 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_507 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_508 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_520 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_521 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_522 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_HTTP_STATUS_525 Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_VIDEO_DOWNLOAD_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param AD_VIDEO_DOWNLOAD_INVALID_FILE Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_SITE_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_SITE_TIMEOUT Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_SSL_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_LENGTH_TOO_SHORT Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
    #' @param AD_VIDEO_PROCESSING_EMPTY_FILE Ad video files are unreadable. Please check your link and upload new files to continue.
    #' @param AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL Ad videos must have a height larger than 75 pixels
    #' @param AD_VIDEO_PROCESSING_TOO_MANY_PIXELS Ad videos must have a maximum area (width x height) of less than 89478485 pixels
    #' @param AD_VIDEO_PROCESSING_TYPE_MISMATCH Some ad videos could not be processed due to a file type mismatch.
    #' @param AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL Ad videos must have a width larger than 75 pixels
    #' @param ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
    #' @param ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue.
    #' @param ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue.
    #' @param ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue.
    #' @param FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.
    #' @param HOTEL_PRICE_HEADER_IS_PRESENT Price is not a supported column. Use base_price and sale_price instead.
    #' @param VIDEO_DOWNLOAD_VIDEO_TOO_SHORT Video length is too short. Please ensure that the main video is at least 4 seconds long.
    #' @param VIDEO_FILE_NOT_ACCESSIBLE Video files are unreadable. Please upload new files to continue.
    #' @param VIDEO_FILE_NOT_FOUND Video files are unreadable. Please upload new files to continue.
    #' @param VIDEO_INVALID_FILE Video files are unreadable. Please upload new files to continue.
    #' @param VIDEO_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
    #' @param VIDEO_MALFORMED_URL Video files are unreadable. Please check your link and upload new files to continue.
    #' @param ... Other optional arguments.
    initialize = function(`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` = NULL, `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` = NULL, `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` = NULL, `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` = NULL, `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` = NULL, `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` = NULL, `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` = NULL, `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` = NULL, `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` = NULL, `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` = NULL, `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` = NULL, `AD_IMAGE_DOWNLOAD_INVALID_FILE` = NULL, `AD_IMAGE_DOWNLOAD_SITE_ERROR` = NULL, `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` = NULL, `AD_IMAGE_DOWNLOAD_SSL_ERROR` = NULL, `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` = NULL, `AD_IMAGE_PROCESSING_EMPTY_FILE` = NULL, `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` = NULL, `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` = NULL, `AD_IMAGE_PROCESSING_TYPE_MISMATCH` = NULL, `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` = NULL, `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` = NULL, `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` = NULL, `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` = NULL, `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` = NULL, `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` = NULL, `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` = NULL, `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` = NULL, `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` = NULL, `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` = NULL, `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` = NULL, `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` = NULL, `AD_VIDEO_DOWNLOAD_INVALID_FILE` = NULL, `AD_VIDEO_DOWNLOAD_SITE_ERROR` = NULL, `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` = NULL, `AD_VIDEO_DOWNLOAD_SSL_ERROR` = NULL, `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` = NULL, `AD_VIDEO_LENGTH_TOO_SHORT` = NULL, `AD_VIDEO_PROCESSING_EMPTY_FILE` = NULL, `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` = NULL, `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` = NULL, `AD_VIDEO_PROCESSING_TYPE_MISMATCH` = NULL, `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` = NULL, `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` = NULL, `ADDITIONAL_IMAGE_FILE_NOT_FOUND` = NULL, `ADDITIONAL_IMAGE_INVALID_FILE` = NULL, `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` = NULL, `ADDITIONAL_IMAGE_MALFORMED_URL` = NULL, `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` = NULL, `HOTEL_PRICE_HEADER_IS_PRESENT` = NULL, `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` = NULL, `VIDEO_FILE_NOT_ACCESSIBLE` = NULL, `VIDEO_FILE_NOT_FOUND` = NULL, `VIDEO_INVALID_FILE` = NULL, `VIDEO_LEVEL_INTERNAL_ERROR` = NULL, `VIDEO_MALFORMED_URL` = NULL, ...) {
      if (!is.null(`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`) && length(`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` <- `AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`) && length(`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` <- `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`) && length(`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`. Must be an integer:", `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`))
        }
        self$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` <- `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`) && length(`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`. Must be an integer:", `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`))
        }
        self$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` <- `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`) && length(`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`. Must be an integer:", `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`))
        }
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` <- `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`) && length(`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` <- `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`) && length(`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` <- `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`) && length(`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`))
        }
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` <- `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`) && length(`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`))
        }
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` <- `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`) && length(`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`))
        }
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` <- `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`) && length(`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`))
        }
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` <- `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_INVALID_FILE`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_INVALID_FILE`) && length(`AD_IMAGE_DOWNLOAD_INVALID_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_INVALID_FILE`. Must be an integer:", `AD_IMAGE_DOWNLOAD_INVALID_FILE`))
        }
        self$`AD_IMAGE_DOWNLOAD_INVALID_FILE` <- `AD_IMAGE_DOWNLOAD_INVALID_FILE`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_SITE_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_SITE_ERROR`) && length(`AD_IMAGE_DOWNLOAD_SITE_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_SITE_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_SITE_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_SITE_ERROR` <- `AD_IMAGE_DOWNLOAD_SITE_ERROR`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`) && length(`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`. Must be an integer:", `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`))
        }
        self$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` <- `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_SSL_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_SSL_ERROR`) && length(`AD_IMAGE_DOWNLOAD_SSL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_SSL_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_SSL_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_SSL_ERROR` <- `AD_IMAGE_DOWNLOAD_SSL_ERROR`
      }
      if (!is.null(`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`)) {
        if (!(is.numeric(`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`) && length(`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`. Must be an integer:", `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`))
        }
        self$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` <- `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      }
      if (!is.null(`AD_IMAGE_PROCESSING_EMPTY_FILE`)) {
        if (!(is.numeric(`AD_IMAGE_PROCESSING_EMPTY_FILE`) && length(`AD_IMAGE_PROCESSING_EMPTY_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_PROCESSING_EMPTY_FILE`. Must be an integer:", `AD_IMAGE_PROCESSING_EMPTY_FILE`))
        }
        self$`AD_IMAGE_PROCESSING_EMPTY_FILE` <- `AD_IMAGE_PROCESSING_EMPTY_FILE`
      }
      if (!is.null(`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`)) {
        if (!(is.numeric(`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`) && length(`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`. Must be an integer:", `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`))
        }
        self$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` <- `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`
      }
      if (!is.null(`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`)) {
        if (!(is.numeric(`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`) && length(`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`. Must be an integer:", `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`))
        }
        self$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` <- `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`
      }
      if (!is.null(`AD_IMAGE_PROCESSING_TYPE_MISMATCH`)) {
        if (!(is.numeric(`AD_IMAGE_PROCESSING_TYPE_MISMATCH`) && length(`AD_IMAGE_PROCESSING_TYPE_MISMATCH`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_PROCESSING_TYPE_MISMATCH`. Must be an integer:", `AD_IMAGE_PROCESSING_TYPE_MISMATCH`))
        }
        self$`AD_IMAGE_PROCESSING_TYPE_MISMATCH` <- `AD_IMAGE_PROCESSING_TYPE_MISMATCH`
      }
      if (!is.null(`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`)) {
        if (!(is.numeric(`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`) && length(`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`) == 1)) {
          stop(paste("Error! Invalid data for `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`. Must be an integer:", `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`))
        }
        self$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` <- `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`) && length(`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` <- `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`) && length(`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` <- `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`) && length(`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`. Must be an integer:", `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`))
        }
        self$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` <- `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`) && length(`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`. Must be an integer:", `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`))
        }
        self$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` <- `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`) && length(`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`. Must be an integer:", `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`))
        }
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` <- `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`) && length(`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` <- `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`) && length(`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` <- `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`) && length(`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`))
        }
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` <- `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`) && length(`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`))
        }
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` <- `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`) && length(`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`))
        }
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` <- `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`) && length(`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`))
        }
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` <- `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_INVALID_FILE`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_INVALID_FILE`) && length(`AD_VIDEO_DOWNLOAD_INVALID_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_INVALID_FILE`. Must be an integer:", `AD_VIDEO_DOWNLOAD_INVALID_FILE`))
        }
        self$`AD_VIDEO_DOWNLOAD_INVALID_FILE` <- `AD_VIDEO_DOWNLOAD_INVALID_FILE`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_SITE_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_SITE_ERROR`) && length(`AD_VIDEO_DOWNLOAD_SITE_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_SITE_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_SITE_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_SITE_ERROR` <- `AD_VIDEO_DOWNLOAD_SITE_ERROR`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`) && length(`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`. Must be an integer:", `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`))
        }
        self$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` <- `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_SSL_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_SSL_ERROR`) && length(`AD_VIDEO_DOWNLOAD_SSL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_SSL_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_SSL_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_SSL_ERROR` <- `AD_VIDEO_DOWNLOAD_SSL_ERROR`
      }
      if (!is.null(`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`)) {
        if (!(is.numeric(`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`) && length(`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`. Must be an integer:", `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`))
        }
        self$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` <- `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      }
      if (!is.null(`AD_VIDEO_LENGTH_TOO_SHORT`)) {
        if (!(is.numeric(`AD_VIDEO_LENGTH_TOO_SHORT`) && length(`AD_VIDEO_LENGTH_TOO_SHORT`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_LENGTH_TOO_SHORT`. Must be an integer:", `AD_VIDEO_LENGTH_TOO_SHORT`))
        }
        self$`AD_VIDEO_LENGTH_TOO_SHORT` <- `AD_VIDEO_LENGTH_TOO_SHORT`
      }
      if (!is.null(`AD_VIDEO_PROCESSING_EMPTY_FILE`)) {
        if (!(is.numeric(`AD_VIDEO_PROCESSING_EMPTY_FILE`) && length(`AD_VIDEO_PROCESSING_EMPTY_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_PROCESSING_EMPTY_FILE`. Must be an integer:", `AD_VIDEO_PROCESSING_EMPTY_FILE`))
        }
        self$`AD_VIDEO_PROCESSING_EMPTY_FILE` <- `AD_VIDEO_PROCESSING_EMPTY_FILE`
      }
      if (!is.null(`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`)) {
        if (!(is.numeric(`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`) && length(`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`. Must be an integer:", `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`))
        }
        self$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` <- `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`
      }
      if (!is.null(`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`)) {
        if (!(is.numeric(`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`) && length(`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`. Must be an integer:", `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`))
        }
        self$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` <- `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`
      }
      if (!is.null(`AD_VIDEO_PROCESSING_TYPE_MISMATCH`)) {
        if (!(is.numeric(`AD_VIDEO_PROCESSING_TYPE_MISMATCH`) && length(`AD_VIDEO_PROCESSING_TYPE_MISMATCH`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_PROCESSING_TYPE_MISMATCH`. Must be an integer:", `AD_VIDEO_PROCESSING_TYPE_MISMATCH`))
        }
        self$`AD_VIDEO_PROCESSING_TYPE_MISMATCH` <- `AD_VIDEO_PROCESSING_TYPE_MISMATCH`
      }
      if (!is.null(`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`)) {
        if (!(is.numeric(`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`) && length(`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`) == 1)) {
          stop(paste("Error! Invalid data for `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`. Must be an integer:", `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`))
        }
        self$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` <- `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`
      }
      if (!is.null(`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`) && length(`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`. Must be an integer:", `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`))
        }
        self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` <- `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_FILE_NOT_FOUND`) && length(`ADDITIONAL_IMAGE_FILE_NOT_FOUND`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_FILE_NOT_FOUND`. Must be an integer:", `ADDITIONAL_IMAGE_FILE_NOT_FOUND`))
        }
        self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND` <- `ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(`ADDITIONAL_IMAGE_INVALID_FILE`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_INVALID_FILE`) && length(`ADDITIONAL_IMAGE_INVALID_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_INVALID_FILE`. Must be an integer:", `ADDITIONAL_IMAGE_INVALID_FILE`))
        }
        self$`ADDITIONAL_IMAGE_INVALID_FILE` <- `ADDITIONAL_IMAGE_INVALID_FILE`
      }
      if (!is.null(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`) && length(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`. Must be an integer:", `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`))
        }
        self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` <- `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_MALFORMED_URL`) && length(`ADDITIONAL_IMAGE_MALFORMED_URL`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_MALFORMED_URL`. Must be an integer:", `ADDITIONAL_IMAGE_MALFORMED_URL`))
        }
        self$`ADDITIONAL_IMAGE_MALFORMED_URL` <- `ADDITIONAL_IMAGE_MALFORMED_URL`
      }
      if (!is.null(`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`)) {
        if (!(is.numeric(`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`) && length(`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`) == 1)) {
          stop(paste("Error! Invalid data for `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`. Must be an integer:", `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`))
        }
        self$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` <- `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`
      }
      if (!is.null(`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
        if (!(is.numeric(`HOTEL_PRICE_HEADER_IS_PRESENT`) && length(`HOTEL_PRICE_HEADER_IS_PRESENT`) == 1)) {
          stop(paste("Error! Invalid data for `HOTEL_PRICE_HEADER_IS_PRESENT`. Must be an integer:", `HOTEL_PRICE_HEADER_IS_PRESENT`))
        }
        self$`HOTEL_PRICE_HEADER_IS_PRESENT` <- `HOTEL_PRICE_HEADER_IS_PRESENT`
      }
      if (!is.null(`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`)) {
        if (!(is.numeric(`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`) && length(`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`) == 1)) {
          stop(paste("Error! Invalid data for `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`. Must be an integer:", `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`))
        }
        self$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` <- `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`
      }
      if (!is.null(`VIDEO_FILE_NOT_ACCESSIBLE`)) {
        if (!(is.numeric(`VIDEO_FILE_NOT_ACCESSIBLE`) && length(`VIDEO_FILE_NOT_ACCESSIBLE`) == 1)) {
          stop(paste("Error! Invalid data for `VIDEO_FILE_NOT_ACCESSIBLE`. Must be an integer:", `VIDEO_FILE_NOT_ACCESSIBLE`))
        }
        self$`VIDEO_FILE_NOT_ACCESSIBLE` <- `VIDEO_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(`VIDEO_FILE_NOT_FOUND`)) {
        if (!(is.numeric(`VIDEO_FILE_NOT_FOUND`) && length(`VIDEO_FILE_NOT_FOUND`) == 1)) {
          stop(paste("Error! Invalid data for `VIDEO_FILE_NOT_FOUND`. Must be an integer:", `VIDEO_FILE_NOT_FOUND`))
        }
        self$`VIDEO_FILE_NOT_FOUND` <- `VIDEO_FILE_NOT_FOUND`
      }
      if (!is.null(`VIDEO_INVALID_FILE`)) {
        if (!(is.numeric(`VIDEO_INVALID_FILE`) && length(`VIDEO_INVALID_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `VIDEO_INVALID_FILE`. Must be an integer:", `VIDEO_INVALID_FILE`))
        }
        self$`VIDEO_INVALID_FILE` <- `VIDEO_INVALID_FILE`
      }
      if (!is.null(`VIDEO_LEVEL_INTERNAL_ERROR`)) {
        if (!(is.numeric(`VIDEO_LEVEL_INTERNAL_ERROR`) && length(`VIDEO_LEVEL_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `VIDEO_LEVEL_INTERNAL_ERROR`. Must be an integer:", `VIDEO_LEVEL_INTERNAL_ERROR`))
        }
        self$`VIDEO_LEVEL_INTERNAL_ERROR` <- `VIDEO_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(`VIDEO_MALFORMED_URL`)) {
        if (!(is.numeric(`VIDEO_MALFORMED_URL`) && length(`VIDEO_MALFORMED_URL`) == 1)) {
          stop(paste("Error! Invalid data for `VIDEO_MALFORMED_URL`. Must be an integer:", `VIDEO_MALFORMED_URL`))
        }
        self$`VIDEO_MALFORMED_URL` <- `VIDEO_MALFORMED_URL`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsFeedIngestionWarnings as a base R list.
    #' @examples
    #' # convert array of CatalogsFeedIngestionWarnings (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsFeedIngestionWarnings to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsFeedIngestionWarningsObject <- list()
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE"]] <-
          self$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND"]] <-
          self$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_400"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_403"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_404"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_405"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_410"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_429"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_500"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_502"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_503"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_504"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_507"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_508"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_520"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_521"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_522"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_HTTP_STATUS_525"]] <-
          self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INTERNAL_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"]] <-
          self$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL"]] <-
          self$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED"]] <-
          self$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"]] <-
          self$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_INVALID_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_INVALID_FILE"]] <-
          self$`AD_IMAGE_DOWNLOAD_INVALID_FILE`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_SITE_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_SITE_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_SITE_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_SITE_TIMEOUT"]] <-
          self$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_SSL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_SSL_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_SSL_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR"]] <-
          self$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      }
      if (!is.null(self$`AD_IMAGE_PROCESSING_EMPTY_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_PROCESSING_EMPTY_FILE"]] <-
          self$`AD_IMAGE_PROCESSING_EMPTY_FILE`
      }
      if (!is.null(self$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL"]] <-
          self$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`
      }
      if (!is.null(self$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_PROCESSING_TOO_MANY_PIXELS"]] <-
          self$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`
      }
      if (!is.null(self$`AD_IMAGE_PROCESSING_TYPE_MISMATCH`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_PROCESSING_TYPE_MISMATCH"]] <-
          self$`AD_IMAGE_PROCESSING_TYPE_MISMATCH`
      }
      if (!is.null(self$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`)) {
        CatalogsFeedIngestionWarningsObject[["AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL"]] <-
          self$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE"]] <-
          self$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND"]] <-
          self$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_400"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_403"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_404"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_405"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_410"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_429"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_500"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_502"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_503"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_504"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_507"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_508"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_520"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_521"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_522"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_HTTP_STATUS_525"]] <-
          self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INTERNAL_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"]] <-
          self$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL"]] <-
          self$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED"]] <-
          self$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"]] <-
          self$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_INVALID_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_INVALID_FILE"]] <-
          self$`AD_VIDEO_DOWNLOAD_INVALID_FILE`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_SITE_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_SITE_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_SITE_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_SITE_TIMEOUT"]] <-
          self$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_SSL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_SSL_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_SSL_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR"]] <-
          self$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      }
      if (!is.null(self$`AD_VIDEO_LENGTH_TOO_SHORT`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_LENGTH_TOO_SHORT"]] <-
          self$`AD_VIDEO_LENGTH_TOO_SHORT`
      }
      if (!is.null(self$`AD_VIDEO_PROCESSING_EMPTY_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_PROCESSING_EMPTY_FILE"]] <-
          self$`AD_VIDEO_PROCESSING_EMPTY_FILE`
      }
      if (!is.null(self$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL"]] <-
          self$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`
      }
      if (!is.null(self$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_PROCESSING_TOO_MANY_PIXELS"]] <-
          self$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`
      }
      if (!is.null(self$`AD_VIDEO_PROCESSING_TYPE_MISMATCH`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_PROCESSING_TYPE_MISMATCH"]] <-
          self$`AD_VIDEO_PROCESSING_TYPE_MISMATCH`
      }
      if (!is.null(self$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`)) {
        CatalogsFeedIngestionWarningsObject[["AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL"]] <-
          self$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"]] <-
          self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_FILE_NOT_FOUND"]] <-
          self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_INVALID_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_INVALID_FILE"]] <-
          self$`ADDITIONAL_IMAGE_INVALID_FILE`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"]] <-
          self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_MALFORMED_URL"]] <-
          self$`ADDITIONAL_IMAGE_MALFORMED_URL`
      }
      if (!is.null(self$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`)) {
        CatalogsFeedIngestionWarningsObject[["FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT"]] <-
          self$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`
      }
      if (!is.null(self$`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
        CatalogsFeedIngestionWarningsObject[["HOTEL_PRICE_HEADER_IS_PRESENT"]] <-
          self$`HOTEL_PRICE_HEADER_IS_PRESENT`
      }
      if (!is.null(self$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`)) {
        CatalogsFeedIngestionWarningsObject[["VIDEO_DOWNLOAD_VIDEO_TOO_SHORT"]] <-
          self$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`
      }
      if (!is.null(self$`VIDEO_FILE_NOT_ACCESSIBLE`)) {
        CatalogsFeedIngestionWarningsObject[["VIDEO_FILE_NOT_ACCESSIBLE"]] <-
          self$`VIDEO_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(self$`VIDEO_FILE_NOT_FOUND`)) {
        CatalogsFeedIngestionWarningsObject[["VIDEO_FILE_NOT_FOUND"]] <-
          self$`VIDEO_FILE_NOT_FOUND`
      }
      if (!is.null(self$`VIDEO_INVALID_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["VIDEO_INVALID_FILE"]] <-
          self$`VIDEO_INVALID_FILE`
      }
      if (!is.null(self$`VIDEO_LEVEL_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["VIDEO_LEVEL_INTERNAL_ERROR"]] <-
          self$`VIDEO_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(self$`VIDEO_MALFORMED_URL`)) {
        CatalogsFeedIngestionWarningsObject[["VIDEO_MALFORMED_URL"]] <-
          self$`VIDEO_MALFORMED_URL`
      }
      return(CatalogsFeedIngestionWarningsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionWarnings
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`)) {
        self$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` <- this_object$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`)) {
        self$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` <- this_object$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`)) {
        self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`)) {
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`)) {
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`)) {
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`)) {
        self$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_INVALID_FILE`)) {
        self$`AD_IMAGE_DOWNLOAD_INVALID_FILE` <- this_object$`AD_IMAGE_DOWNLOAD_INVALID_FILE`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_SITE_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_SITE_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_SITE_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`)) {
        self$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` <- this_object$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_SSL_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_SSL_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_SSL_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`)) {
        self$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      }
      if (!is.null(this_object$`AD_IMAGE_PROCESSING_EMPTY_FILE`)) {
        self$`AD_IMAGE_PROCESSING_EMPTY_FILE` <- this_object$`AD_IMAGE_PROCESSING_EMPTY_FILE`
      }
      if (!is.null(this_object$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`)) {
        self$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` <- this_object$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`
      }
      if (!is.null(this_object$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`)) {
        self$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` <- this_object$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`
      }
      if (!is.null(this_object$`AD_IMAGE_PROCESSING_TYPE_MISMATCH`)) {
        self$`AD_IMAGE_PROCESSING_TYPE_MISMATCH` <- this_object$`AD_IMAGE_PROCESSING_TYPE_MISMATCH`
      }
      if (!is.null(this_object$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`)) {
        self$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` <- this_object$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`)) {
        self$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` <- this_object$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`)) {
        self$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` <- this_object$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`)) {
        self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`)) {
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`)) {
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`)) {
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`)) {
        self$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_INVALID_FILE`)) {
        self$`AD_VIDEO_DOWNLOAD_INVALID_FILE` <- this_object$`AD_VIDEO_DOWNLOAD_INVALID_FILE`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_SITE_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_SITE_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_SITE_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`)) {
        self$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` <- this_object$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_SSL_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_SSL_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_SSL_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`)) {
        self$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      }
      if (!is.null(this_object$`AD_VIDEO_LENGTH_TOO_SHORT`)) {
        self$`AD_VIDEO_LENGTH_TOO_SHORT` <- this_object$`AD_VIDEO_LENGTH_TOO_SHORT`
      }
      if (!is.null(this_object$`AD_VIDEO_PROCESSING_EMPTY_FILE`)) {
        self$`AD_VIDEO_PROCESSING_EMPTY_FILE` <- this_object$`AD_VIDEO_PROCESSING_EMPTY_FILE`
      }
      if (!is.null(this_object$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`)) {
        self$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` <- this_object$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`
      }
      if (!is.null(this_object$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`)) {
        self$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` <- this_object$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`
      }
      if (!is.null(this_object$`AD_VIDEO_PROCESSING_TYPE_MISMATCH`)) {
        self$`AD_VIDEO_PROCESSING_TYPE_MISMATCH` <- this_object$`AD_VIDEO_PROCESSING_TYPE_MISMATCH`
      }
      if (!is.null(this_object$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`)) {
        self$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` <- this_object$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
        self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
        self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_INVALID_FILE`)) {
        self$`ADDITIONAL_IMAGE_INVALID_FILE` <- this_object$`ADDITIONAL_IMAGE_INVALID_FILE`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
        self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` <- this_object$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
        self$`ADDITIONAL_IMAGE_MALFORMED_URL` <- this_object$`ADDITIONAL_IMAGE_MALFORMED_URL`
      }
      if (!is.null(this_object$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`)) {
        self$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` <- this_object$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`
      }
      if (!is.null(this_object$`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
        self$`HOTEL_PRICE_HEADER_IS_PRESENT` <- this_object$`HOTEL_PRICE_HEADER_IS_PRESENT`
      }
      if (!is.null(this_object$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`)) {
        self$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` <- this_object$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`
      }
      if (!is.null(this_object$`VIDEO_FILE_NOT_ACCESSIBLE`)) {
        self$`VIDEO_FILE_NOT_ACCESSIBLE` <- this_object$`VIDEO_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(this_object$`VIDEO_FILE_NOT_FOUND`)) {
        self$`VIDEO_FILE_NOT_FOUND` <- this_object$`VIDEO_FILE_NOT_FOUND`
      }
      if (!is.null(this_object$`VIDEO_INVALID_FILE`)) {
        self$`VIDEO_INVALID_FILE` <- this_object$`VIDEO_INVALID_FILE`
      }
      if (!is.null(this_object$`VIDEO_LEVEL_INTERNAL_ERROR`)) {
        self$`VIDEO_LEVEL_INTERNAL_ERROR` <- this_object$`VIDEO_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`VIDEO_MALFORMED_URL`)) {
        self$`VIDEO_MALFORMED_URL` <- this_object$`VIDEO_MALFORMED_URL`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsFeedIngestionWarnings in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionWarnings
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR`
      self$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR`
      self$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` <- this_object$`AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      self$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` <- this_object$`AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_400`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_403`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_404`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_405`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_410`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_429`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_500`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_502`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_503`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_504`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_507`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_508`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_520`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_521`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_522`
      self$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` <- this_object$`AD_IMAGE_DOWNLOAD_HTTP_STATUS_525`
      self$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      self$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_ERROR`
      self$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      self$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL`
      self$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED`
      self$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` <- this_object$`AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      self$`AD_IMAGE_DOWNLOAD_INVALID_FILE` <- this_object$`AD_IMAGE_DOWNLOAD_INVALID_FILE`
      self$`AD_IMAGE_DOWNLOAD_SITE_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_SITE_ERROR`
      self$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` <- this_object$`AD_IMAGE_DOWNLOAD_SITE_TIMEOUT`
      self$`AD_IMAGE_DOWNLOAD_SSL_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_SSL_ERROR`
      self$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` <- this_object$`AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      self$`AD_IMAGE_PROCESSING_EMPTY_FILE` <- this_object$`AD_IMAGE_PROCESSING_EMPTY_FILE`
      self$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` <- this_object$`AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL`
      self$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` <- this_object$`AD_IMAGE_PROCESSING_TOO_MANY_PIXELS`
      self$`AD_IMAGE_PROCESSING_TYPE_MISMATCH` <- this_object$`AD_IMAGE_PROCESSING_TYPE_MISMATCH`
      self$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` <- this_object$`AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL`
      self$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR`
      self$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR`
      self$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` <- this_object$`AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE`
      self$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` <- this_object$`AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_400`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_403`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_404`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_405`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_410`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_429`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_500`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_502`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_503`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_504`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_507`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_508`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_520`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_521`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_522`
      self$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` <- this_object$`AD_VIDEO_DOWNLOAD_HTTP_STATUS_525`
      self$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR`
      self$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_ERROR`
      self$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD`
      self$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL`
      self$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED`
      self$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` <- this_object$`AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED`
      self$`AD_VIDEO_DOWNLOAD_INVALID_FILE` <- this_object$`AD_VIDEO_DOWNLOAD_INVALID_FILE`
      self$`AD_VIDEO_DOWNLOAD_SITE_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_SITE_ERROR`
      self$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` <- this_object$`AD_VIDEO_DOWNLOAD_SITE_TIMEOUT`
      self$`AD_VIDEO_DOWNLOAD_SSL_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_SSL_ERROR`
      self$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` <- this_object$`AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR`
      self$`AD_VIDEO_LENGTH_TOO_SHORT` <- this_object$`AD_VIDEO_LENGTH_TOO_SHORT`
      self$`AD_VIDEO_PROCESSING_EMPTY_FILE` <- this_object$`AD_VIDEO_PROCESSING_EMPTY_FILE`
      self$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` <- this_object$`AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL`
      self$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` <- this_object$`AD_VIDEO_PROCESSING_TOO_MANY_PIXELS`
      self$`AD_VIDEO_PROCESSING_TYPE_MISMATCH` <- this_object$`AD_VIDEO_PROCESSING_TYPE_MISMATCH`
      self$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` <- this_object$`AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL`
      self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      self$`ADDITIONAL_IMAGE_INVALID_FILE` <- this_object$`ADDITIONAL_IMAGE_INVALID_FILE`
      self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` <- this_object$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      self$`ADDITIONAL_IMAGE_MALFORMED_URL` <- this_object$`ADDITIONAL_IMAGE_MALFORMED_URL`
      self$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` <- this_object$`FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT`
      self$`HOTEL_PRICE_HEADER_IS_PRESENT` <- this_object$`HOTEL_PRICE_HEADER_IS_PRESENT`
      self$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` <- this_object$`VIDEO_DOWNLOAD_VIDEO_TOO_SHORT`
      self$`VIDEO_FILE_NOT_ACCESSIBLE` <- this_object$`VIDEO_FILE_NOT_ACCESSIBLE`
      self$`VIDEO_FILE_NOT_FOUND` <- this_object$`VIDEO_FILE_NOT_FOUND`
      self$`VIDEO_INVALID_FILE` <- this_object$`VIDEO_INVALID_FILE`
      self$`VIDEO_LEVEL_INTERNAL_ERROR` <- this_object$`VIDEO_LEVEL_INTERNAL_ERROR`
      self$`VIDEO_MALFORMED_URL` <- this_object$`VIDEO_MALFORMED_URL`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedIngestionWarnings and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedIngestionWarnings
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsFeedIngestionWarnings$unlock()
#
## Below is an example to define the print function
# CatalogsFeedIngestionWarnings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedIngestionWarnings$lock()

