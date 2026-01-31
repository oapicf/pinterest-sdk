-module(openapi_catalogs_feed_ingestion_errors).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion_errors/0]).

-export([openapi_catalogs_feed_ingestion_errors/1]).

-export_type([openapi_catalogs_feed_ingestion_errors/0]).

-type openapi_catalogs_feed_ingestion_errors() ::
  [ {'ACCOUNT_FLAGGED', integer() }
  | {'FETCH_GOOGLE_SHEET_NOT_SHARED', integer() }
  | {'IMAGE_FILE_NOT_ACCESSIBLE', integer() }
  | {'IMAGE_FILE_NOT_FOUND', integer() }
  | {'IMAGE_INVALID_FILE', integer() }
  | {'IMAGE_LEVEL_INTERNAL_ERROR', integer() }
  | {'IMAGE_MALFORMED_URL', integer() }
  | {'LARGE_PRODUCT_COUNT_DECREASE', integer() }
  | {'LINE_LEVEL_INTERNAL_ERROR', integer() }
  ].


openapi_catalogs_feed_ingestion_errors() ->
    openapi_catalogs_feed_ingestion_errors([]).

openapi_catalogs_feed_ingestion_errors(Fields) ->
  Default = [ {'ACCOUNT_FLAGGED', integer() }
            , {'FETCH_GOOGLE_SHEET_NOT_SHARED', integer() }
            , {'IMAGE_FILE_NOT_ACCESSIBLE', integer() }
            , {'IMAGE_FILE_NOT_FOUND', integer() }
            , {'IMAGE_INVALID_FILE', integer() }
            , {'IMAGE_LEVEL_INTERNAL_ERROR', integer() }
            , {'IMAGE_MALFORMED_URL', integer() }
            , {'LARGE_PRODUCT_COUNT_DECREASE', integer() }
            , {'LINE_LEVEL_INTERNAL_ERROR', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

