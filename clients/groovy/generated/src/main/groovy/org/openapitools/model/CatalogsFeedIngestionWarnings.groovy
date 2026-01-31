package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedIngestionWarnings {
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_400
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_403
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_404
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_405
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_410
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_429
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_500
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_502
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_503
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_504
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_507
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_508
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_520
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_521
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_522
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_525
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_IMAGE_DOWNLOAD_INTERNAL_ERROR
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_INVALID_FILE
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_SITE_ERROR
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_SITE_TIMEOUT
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_SSL_ERROR
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR
    /* Ad image files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_IMAGE_PROCESSING_EMPTY_FILE
    /* Ad images must have a height larger than 75 pixels */
    Integer AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL
    /* Ad images must have a maximum area (width x height) of less than 89478485 pixels */
    Integer AD_IMAGE_PROCESSING_TOO_MANY_PIXELS
    /* Some ad images could not be processed due to a file type mismatch. */
    Integer AD_IMAGE_PROCESSING_TYPE_MISMATCH
    /* Ad images must have a width larger than 75 pixels */
    Integer AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_400
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_403
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_404
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_405
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_410
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_429
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_500
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_502
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_503
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_504
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_507
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_508
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_520
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_521
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_522
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_525
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_VIDEO_DOWNLOAD_INTERNAL_ERROR
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_INVALID_FILE
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_SITE_ERROR
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_SITE_TIMEOUT
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_SSL_ERROR
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR
    /* Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long. */
    Integer AD_VIDEO_LENGTH_TOO_SHORT
    /* Ad video files are unreadable. Please check your link and upload new files to continue. */
    Integer AD_VIDEO_PROCESSING_EMPTY_FILE
    /* Ad videos must have a height larger than 75 pixels */
    Integer AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL
    /* Ad videos must have a maximum area (width x height) of less than 89478485 pixels */
    Integer AD_VIDEO_PROCESSING_TOO_MANY_PIXELS
    /* Some ad videos could not be processed due to a file type mismatch. */
    Integer AD_VIDEO_PROCESSING_TYPE_MISMATCH
    /* Ad videos must have a width larger than 75 pixels */
    Integer AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL
    /* Additional image files are unreadable. Please upload new files to continue. */
    Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
    /* Additional image files are unreadable. Please upload new files to continue. */
    Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND
    /* Additional image files are unreadable. Please upload new files to continue. */
    Integer ADDITIONAL_IMAGE_INVALID_FILE
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
    /* Additional image files are unreadable. Please check your link and upload new files to continue. */
    Integer ADDITIONAL_IMAGE_MALFORMED_URL
    /* Update your Google Sheets sharing settings from 'Editor' to 'Viewer'. */
    Integer FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT
    /* Price is not a supported column. Use base_price and sale_price instead. */
    Integer HOTEL_PRICE_HEADER_IS_PRESENT
    /* Video length is too short. Please ensure that the main video is at least 4 seconds long. */
    Integer VIDEO_DOWNLOAD_VIDEO_TOO_SHORT
    /* Video files are unreadable. Please upload new files to continue. */
    Integer VIDEO_FILE_NOT_ACCESSIBLE
    /* Video files are unreadable. Please upload new files to continue. */
    Integer VIDEO_FILE_NOT_FOUND
    /* Video files are unreadable. Please upload new files to continue. */
    Integer VIDEO_INVALID_FILE
    /* We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours. */
    Integer VIDEO_LEVEL_INTERNAL_ERROR
    /* Video files are unreadable. Please check your link and upload new files to continue. */
    Integer VIDEO_MALFORMED_URL
}
