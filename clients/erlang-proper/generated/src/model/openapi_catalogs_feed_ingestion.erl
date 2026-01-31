-module(openapi_catalogs_feed_ingestion).

-include("openapi.hrl").

-export([openapi_catalogs_feed_ingestion/0]).

-export([openapi_catalogs_feed_ingestion/1]).

-export_type([openapi_catalogs_feed_ingestion/0]).

-type openapi_catalogs_feed_ingestion() ::
  [ {'created_at', datetime() }
  | {'feed_id', binary() }
  | {'id', binary() }
  | {'status', openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status() }
  ].


openapi_catalogs_feed_ingestion() ->
    openapi_catalogs_feed_ingestion([]).

openapi_catalogs_feed_ingestion(Fields) ->
  Default = [ {'created_at', datetime() }
            , {'feed_id', binary() }
            , {'id', binary() }
            , {'status', openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

