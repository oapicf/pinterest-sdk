<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedIngestionWarnings
{
    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_content_read_error;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_dns_lookup_error;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_file_not_accessible;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_file_not_found;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_400", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_400;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_403", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_403;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_404", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_404;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_405", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_405;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_410", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_410;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_429", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_429;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_500", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_500;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_502", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_502;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_503", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_503;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_504", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_504;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_507", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_507;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_508", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_508;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_520", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_520;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_521", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_521;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_522", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_522;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_HTTP_STATUS_525", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_http_status_525;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_internal_configuration_error;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_internal_error;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_internal_failed_to_download;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_internal_malformed_url;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_internal_rate_limited;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_internal_request_expired;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_INVALID_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_invalid_file;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_SITE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_site_error;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_SITE_TIMEOUT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_site_timeout;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_SSL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_ssl_error;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_download_ssl_handshake_error;

    /**
     * Ad image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_IMAGE_PROCESSING_EMPTY_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_processing_empty_file;

    /**
     * Ad images must have a height larger than 75 pixels
     * @DTA\Data(field="AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_processing_height_too_small;

    /**
     * Ad images must have a maximum area (width x height) of less than 89478485 pixels
     * @DTA\Data(field="AD_IMAGE_PROCESSING_TOO_MANY_PIXELS", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_processing_too_many_pixels;

    /**
     * Some ad images could not be processed due to a file type mismatch.
     * @DTA\Data(field="AD_IMAGE_PROCESSING_TYPE_MISMATCH", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_processing_type_mismatch;

    /**
     * Ad images must have a width larger than 75 pixels
     * @DTA\Data(field="AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_image_processing_width_too_small;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_content_read_error;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_dns_lookup_error;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_file_not_accessible;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_file_not_found;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_400", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_400;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_403", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_403;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_404", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_404;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_405", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_405;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_410", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_410;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_429", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_429;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_500", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_500;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_502", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_502;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_503", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_503;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_504", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_504;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_507", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_507;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_508", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_508;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_520", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_520;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_521", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_521;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_522", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_522;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_HTTP_STATUS_525", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_http_status_525;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_internal_configuration_error;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_internal_error;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_internal_failed_to_download;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_internal_malformed_url;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_internal_rate_limited;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_internal_request_expired;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_INVALID_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_invalid_file;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_SITE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_site_error;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_SITE_TIMEOUT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_site_timeout;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_SSL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_ssl_error;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_download_ssl_handshake_error;

    /**
     * Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
     * @DTA\Data(field="AD_VIDEO_LENGTH_TOO_SHORT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_length_too_short;

    /**
     * Ad video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="AD_VIDEO_PROCESSING_EMPTY_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_processing_empty_file;

    /**
     * Ad videos must have a height larger than 75 pixels
     * @DTA\Data(field="AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_processing_height_too_small;

    /**
     * Ad videos must have a maximum area (width x height) of less than 89478485 pixels
     * @DTA\Data(field="AD_VIDEO_PROCESSING_TOO_MANY_PIXELS", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_processing_too_many_pixels;

    /**
     * Some ad videos could not be processed due to a file type mismatch.
     * @DTA\Data(field="AD_VIDEO_PROCESSING_TYPE_MISMATCH", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_processing_type_mismatch;

    /**
     * Ad videos must have a width larger than 75 pixels
     * @DTA\Data(field="AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_video_processing_width_too_small;

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_file_not_accessible;

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_FILE_NOT_FOUND", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_file_not_found;

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_INVALID_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_invalid_file;

    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_level_internal_error;

    /**
     * Additional image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_MALFORMED_URL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_malformed_url;

    /**
     * Update your Google Sheets sharing settings from &#39;Editor&#39; to &#39;Viewer&#39;.
     * @DTA\Data(field="FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_google_sheet_public_can_edit;

    /**
     * Price is not a supported column. Use base_price and sale_price instead.
     * @DTA\Data(field="HOTEL_PRICE_HEADER_IS_PRESENT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $hotel_price_header_is_present;

    /**
     * Video length is too short. Please ensure that the main video is at least 4 seconds long.
     * @DTA\Data(field="VIDEO_DOWNLOAD_VIDEO_TOO_SHORT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $video_download_video_too_short;

    /**
     * Video files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="VIDEO_FILE_NOT_ACCESSIBLE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $video_file_not_accessible;

    /**
     * Video files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="VIDEO_FILE_NOT_FOUND", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $video_file_not_found;

    /**
     * Video files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="VIDEO_INVALID_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $video_invalid_file;

    /**
     * We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="VIDEO_LEVEL_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $video_level_internal_error;

    /**
     * Video files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="VIDEO_MALFORMED_URL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $video_malformed_url;

}
