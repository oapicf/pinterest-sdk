-module(openapi_catalogs_feed_processing_schedule).

-include("openapi.hrl").

-export([openapi_catalogs_feed_processing_schedule/0]).

-export([openapi_catalogs_feed_processing_schedule/1]).

-export_type([openapi_catalogs_feed_processing_schedule/0]).

-type openapi_catalogs_feed_processing_schedule() ::
  [ {'time', binary() }
  | {'timezone', openapi_catalogs_feed_processing_schedule_timezone:openapi_catalogs_feed_processing_schedule_timezone() }
  ].


openapi_catalogs_feed_processing_schedule() ->
    openapi_catalogs_feed_processing_schedule([]).

openapi_catalogs_feed_processing_schedule(Fields) ->
  Default = [ {'time', binary() }
            , {'timezone', openapi_catalogs_feed_processing_schedule_timezone:openapi_catalogs_feed_processing_schedule_timezone() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

