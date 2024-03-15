-module(openapi_catalogs_feed_ingestion_errors).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion_errors/0]).

-export([openapi_catalogs_feed_ingestion_errors/1]).

-export_type([openapi_catalogs_feed_ingestion_errors/0]).

-type openapi_catalogs_feed_ingestion_errors() ::
  [ {'LINE_LEVEL_INTERNAL_ERROR', integer() }
  | {'LARGE_PRODUCT_COUNT_DECREASE', integer() }
  | {'ACCOUNT_FLAGGED', integer() }
  | {'IMAGE_LEVEL_INTERNAL_ERROR', integer() }
  | {'IMAGE_FILE_NOT_ACCESSIBLE', integer() }
  | {'IMAGE_MALFORMED_URL', integer() }
  | {'IMAGE_FILE_NOT_FOUND', integer() }
  | {'IMAGE_INVALID_FILE', integer() }
  ].


openapi_catalogs_feed_ingestion_errors() ->
    openapi_catalogs_feed_ingestion_errors([]).

openapi_catalogs_feed_ingestion_errors(Fields) ->
  Default = [ {'LINE_LEVEL_INTERNAL_ERROR', integer() }
            , {'LARGE_PRODUCT_COUNT_DECREASE', integer() }
            , {'ACCOUNT_FLAGGED', integer() }
            , {'IMAGE_LEVEL_INTERNAL_ERROR', integer() }
            , {'IMAGE_FILE_NOT_ACCESSIBLE', integer() }
            , {'IMAGE_MALFORMED_URL', integer() }
            , {'IMAGE_FILE_NOT_FOUND', integer() }
            , {'IMAGE_INVALID_FILE', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

