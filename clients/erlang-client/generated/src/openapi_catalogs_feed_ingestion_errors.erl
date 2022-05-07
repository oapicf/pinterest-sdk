-module(openapi_catalogs_feed_ingestion_errors).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion_errors/0]).

-type openapi_catalogs_feed_ingestion_errors() ::
    #{ 'image_download_error' => integer(),
       'image_download_connection_timeout' => integer(),
       'image_format_unrecognize' => integer(),
       'line_level_internal_error' => integer(),
       'large_product_count_decrease' => integer()
     }.

encode(#{ 'image_download_error' := ImageDownloadError,
          'image_download_connection_timeout' := ImageDownloadConnectionTimeout,
          'image_format_unrecognize' := ImageFormatUnrecognize,
          'line_level_internal_error' := LineLevelInternalError,
          'large_product_count_decrease' := LargeProductCountDecrease
        }) ->
    #{ 'image_download_error' => ImageDownloadError,
       'image_download_connection_timeout' => ImageDownloadConnectionTimeout,
       'image_format_unrecognize' => ImageFormatUnrecognize,
       'line_level_internal_error' => LineLevelInternalError,
       'large_product_count_decrease' => LargeProductCountDecrease
     }.
