-module(openapi_catalogs_feed_ingestion_info).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion_info/0]).

-export([openapi_catalogs_feed_ingestion_info/1]).

-export_type([openapi_catalogs_feed_ingestion_info/0]).

-type openapi_catalogs_feed_ingestion_info() ::
  [ {'IN_STOCK', integer() }
  | {'OUT_OF_STOCK', integer() }
  | {'PREORDER', integer() }
  ].


openapi_catalogs_feed_ingestion_info() ->
    openapi_catalogs_feed_ingestion_info([]).

openapi_catalogs_feed_ingestion_info(Fields) ->
  Default = [ {'IN_STOCK', integer() }
            , {'OUT_OF_STOCK', integer() }
            , {'PREORDER', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

