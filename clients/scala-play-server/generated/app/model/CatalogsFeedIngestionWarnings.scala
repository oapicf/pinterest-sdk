package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionWarnings.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedIngestionWarnings(
  AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: Option[Int],
  AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: Option[Int],
  AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: Option[Int],
  AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: Option[Int],
  AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: Option[Int],
  AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: Option[Int],
  AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: Option[Int],
  AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: Option[Int],
  AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: Option[Int],
  AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: Option[Int],
  AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: Option[Int],
  AD_IMAGE_DOWNLOAD_INVALID_FILE: Option[Int],
  AD_IMAGE_DOWNLOAD_SITE_ERROR: Option[Int],
  AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: Option[Int],
  AD_IMAGE_DOWNLOAD_SSL_ERROR: Option[Int],
  AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: Option[Int],
  AD_IMAGE_PROCESSING_EMPTY_FILE: Option[Int],
  AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: Option[Int],
  AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: Option[Int],
  AD_IMAGE_PROCESSING_TYPE_MISMATCH: Option[Int],
  AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: Option[Int],
  AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: Option[Int],
  AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: Option[Int],
  AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: Option[Int],
  AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: Option[Int],
  AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: Option[Int],
  AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: Option[Int],
  AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: Option[Int],
  AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: Option[Int],
  AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: Option[Int],
  AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: Option[Int],
  AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: Option[Int],
  AD_VIDEO_DOWNLOAD_INVALID_FILE: Option[Int],
  AD_VIDEO_DOWNLOAD_SITE_ERROR: Option[Int],
  AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: Option[Int],
  AD_VIDEO_DOWNLOAD_SSL_ERROR: Option[Int],
  AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: Option[Int],
  AD_VIDEO_LENGTH_TOO_SHORT: Option[Int],
  AD_VIDEO_PROCESSING_EMPTY_FILE: Option[Int],
  AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: Option[Int],
  AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: Option[Int],
  AD_VIDEO_PROCESSING_TYPE_MISMATCH: Option[Int],
  AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: Option[Int],
  ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Option[Int],
  ADDITIONAL_IMAGE_FILE_NOT_FOUND: Option[Int],
  ADDITIONAL_IMAGE_INVALID_FILE: Option[Int],
  ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Option[Int],
  ADDITIONAL_IMAGE_MALFORMED_URL: Option[Int],
  FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: Option[Int],
  HOTEL_PRICE_HEADER_IS_PRESENT: Option[Int],
  VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: Option[Int],
  VIDEO_FILE_NOT_ACCESSIBLE: Option[Int],
  VIDEO_FILE_NOT_FOUND: Option[Int],
  VIDEO_INVALID_FILE: Option[Int],
  VIDEO_LEVEL_INTERNAL_ERROR: Option[Int],
  VIDEO_MALFORMED_URL: Option[Int]
)

object CatalogsFeedIngestionWarnings {
  implicit lazy val catalogsFeedIngestionWarningsJsonFormat: Format[CatalogsFeedIngestionWarnings] = Json.format[CatalogsFeedIngestionWarnings]
}

