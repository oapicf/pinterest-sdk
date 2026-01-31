-module(openapi_catalogs_feed_ingestion_warnings).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion_warnings/0]).

-export([openapi_catalogs_feed_ingestion_warnings/1]).

-export_type([openapi_catalogs_feed_ingestion_warnings/0]).

-type openapi_catalogs_feed_ingestion_warnings() ::
  [ {'AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR', integer() }
  | {'AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR', integer() }
  | {'AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE', integer() }
  | {'AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_400', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_403', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_404', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_405', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_410', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_429', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_500', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_502', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_503', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_504', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_507', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_508', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_520', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_521', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_522', integer() }
  | {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_525', integer() }
  | {'AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR', integer() }
  | {'AD_IMAGE_DOWNLOAD_INTERNAL_ERROR', integer() }
  | {'AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD', integer() }
  | {'AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL', integer() }
  | {'AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED', integer() }
  | {'AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED', integer() }
  | {'AD_IMAGE_DOWNLOAD_INVALID_FILE', integer() }
  | {'AD_IMAGE_DOWNLOAD_SITE_ERROR', integer() }
  | {'AD_IMAGE_DOWNLOAD_SITE_TIMEOUT', integer() }
  | {'AD_IMAGE_DOWNLOAD_SSL_ERROR', integer() }
  | {'AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR', integer() }
  | {'AD_IMAGE_PROCESSING_EMPTY_FILE', integer() }
  | {'AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL', integer() }
  | {'AD_IMAGE_PROCESSING_TOO_MANY_PIXELS', integer() }
  | {'AD_IMAGE_PROCESSING_TYPE_MISMATCH', integer() }
  | {'AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL', integer() }
  | {'AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR', integer() }
  | {'AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR', integer() }
  | {'AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE', integer() }
  | {'AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_400', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_403', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_404', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_405', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_410', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_429', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_500', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_502', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_503', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_504', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_507', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_508', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_520', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_521', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_522', integer() }
  | {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_525', integer() }
  | {'AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR', integer() }
  | {'AD_VIDEO_DOWNLOAD_INTERNAL_ERROR', integer() }
  | {'AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD', integer() }
  | {'AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL', integer() }
  | {'AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED', integer() }
  | {'AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED', integer() }
  | {'AD_VIDEO_DOWNLOAD_INVALID_FILE', integer() }
  | {'AD_VIDEO_DOWNLOAD_SITE_ERROR', integer() }
  | {'AD_VIDEO_DOWNLOAD_SITE_TIMEOUT', integer() }
  | {'AD_VIDEO_DOWNLOAD_SSL_ERROR', integer() }
  | {'AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR', integer() }
  | {'AD_VIDEO_LENGTH_TOO_SHORT', integer() }
  | {'AD_VIDEO_PROCESSING_EMPTY_FILE', integer() }
  | {'AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL', integer() }
  | {'AD_VIDEO_PROCESSING_TOO_MANY_PIXELS', integer() }
  | {'AD_VIDEO_PROCESSING_TYPE_MISMATCH', integer() }
  | {'AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL', integer() }
  | {'ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE', integer() }
  | {'ADDITIONAL_IMAGE_FILE_NOT_FOUND', integer() }
  | {'ADDITIONAL_IMAGE_INVALID_FILE', integer() }
  | {'ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR', integer() }
  | {'ADDITIONAL_IMAGE_MALFORMED_URL', integer() }
  | {'FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT', integer() }
  | {'HOTEL_PRICE_HEADER_IS_PRESENT', integer() }
  | {'VIDEO_DOWNLOAD_VIDEO_TOO_SHORT', integer() }
  | {'VIDEO_FILE_NOT_ACCESSIBLE', integer() }
  | {'VIDEO_FILE_NOT_FOUND', integer() }
  | {'VIDEO_INVALID_FILE', integer() }
  | {'VIDEO_LEVEL_INTERNAL_ERROR', integer() }
  | {'VIDEO_MALFORMED_URL', integer() }
  ].


openapi_catalogs_feed_ingestion_warnings() ->
    openapi_catalogs_feed_ingestion_warnings([]).

openapi_catalogs_feed_ingestion_warnings(Fields) ->
  Default = [ {'AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR', integer() }
            , {'AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR', integer() }
            , {'AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE', integer() }
            , {'AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_400', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_403', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_404', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_405', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_410', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_429', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_500', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_502', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_503', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_504', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_507', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_508', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_520', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_521', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_522', integer() }
            , {'AD_IMAGE_DOWNLOAD_HTTP_STATUS_525', integer() }
            , {'AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR', integer() }
            , {'AD_IMAGE_DOWNLOAD_INTERNAL_ERROR', integer() }
            , {'AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD', integer() }
            , {'AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL', integer() }
            , {'AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED', integer() }
            , {'AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED', integer() }
            , {'AD_IMAGE_DOWNLOAD_INVALID_FILE', integer() }
            , {'AD_IMAGE_DOWNLOAD_SITE_ERROR', integer() }
            , {'AD_IMAGE_DOWNLOAD_SITE_TIMEOUT', integer() }
            , {'AD_IMAGE_DOWNLOAD_SSL_ERROR', integer() }
            , {'AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR', integer() }
            , {'AD_IMAGE_PROCESSING_EMPTY_FILE', integer() }
            , {'AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL', integer() }
            , {'AD_IMAGE_PROCESSING_TOO_MANY_PIXELS', integer() }
            , {'AD_IMAGE_PROCESSING_TYPE_MISMATCH', integer() }
            , {'AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL', integer() }
            , {'AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR', integer() }
            , {'AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR', integer() }
            , {'AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE', integer() }
            , {'AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_400', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_403', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_404', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_405', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_410', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_429', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_500', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_502', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_503', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_504', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_507', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_508', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_520', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_521', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_522', integer() }
            , {'AD_VIDEO_DOWNLOAD_HTTP_STATUS_525', integer() }
            , {'AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR', integer() }
            , {'AD_VIDEO_DOWNLOAD_INTERNAL_ERROR', integer() }
            , {'AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD', integer() }
            , {'AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL', integer() }
            , {'AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED', integer() }
            , {'AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED', integer() }
            , {'AD_VIDEO_DOWNLOAD_INVALID_FILE', integer() }
            , {'AD_VIDEO_DOWNLOAD_SITE_ERROR', integer() }
            , {'AD_VIDEO_DOWNLOAD_SITE_TIMEOUT', integer() }
            , {'AD_VIDEO_DOWNLOAD_SSL_ERROR', integer() }
            , {'AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR', integer() }
            , {'AD_VIDEO_LENGTH_TOO_SHORT', integer() }
            , {'AD_VIDEO_PROCESSING_EMPTY_FILE', integer() }
            , {'AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL', integer() }
            , {'AD_VIDEO_PROCESSING_TOO_MANY_PIXELS', integer() }
            , {'AD_VIDEO_PROCESSING_TYPE_MISMATCH', integer() }
            , {'AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL', integer() }
            , {'ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE', integer() }
            , {'ADDITIONAL_IMAGE_FILE_NOT_FOUND', integer() }
            , {'ADDITIONAL_IMAGE_INVALID_FILE', integer() }
            , {'ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR', integer() }
            , {'ADDITIONAL_IMAGE_MALFORMED_URL', integer() }
            , {'FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT', integer() }
            , {'HOTEL_PRICE_HEADER_IS_PRESENT', integer() }
            , {'VIDEO_DOWNLOAD_VIDEO_TOO_SHORT', integer() }
            , {'VIDEO_FILE_NOT_ACCESSIBLE', integer() }
            , {'VIDEO_FILE_NOT_FOUND', integer() }
            , {'VIDEO_INVALID_FILE', integer() }
            , {'VIDEO_LEVEL_INTERNAL_ERROR', integer() }
            , {'VIDEO_MALFORMED_URL', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

