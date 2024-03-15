-module(openapi_catalogs_feed_ingestion_warnings).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion_warnings/0]).

-export([openapi_catalogs_feed_ingestion_warnings/1]).

-export_type([openapi_catalogs_feed_ingestion_warnings/0]).

-type openapi_catalogs_feed_ingestion_warnings() ::
  [ {'ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR', integer() }
  | {'ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE', integer() }
  | {'ADDITIONAL_IMAGE_MALFORMED_URL', integer() }
  | {'ADDITIONAL_IMAGE_FILE_NOT_FOUND', integer() }
  | {'ADDITIONAL_IMAGE_INVALID_FILE', integer() }
  | {'HOTEL_PRICE_HEADER_IS_PRESENT', integer() }
  ].


openapi_catalogs_feed_ingestion_warnings() ->
    openapi_catalogs_feed_ingestion_warnings([]).

openapi_catalogs_feed_ingestion_warnings(Fields) ->
  Default = [ {'ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR', integer() }
            , {'ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE', integer() }
            , {'ADDITIONAL_IMAGE_MALFORMED_URL', integer() }
            , {'ADDITIONAL_IMAGE_FILE_NOT_FOUND', integer() }
            , {'ADDITIONAL_IMAGE_INVALID_FILE', integer() }
            , {'HOTEL_PRICE_HEADER_IS_PRESENT', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

