-module(openapi_catalogs_report_feed_ingestion_filter).

-include("openapi.hrl").

-export([openapi_catalogs_report_feed_ingestion_filter/0]).

-export([openapi_catalogs_report_feed_ingestion_filter/1]).

-export_type([openapi_catalogs_report_feed_ingestion_filter/0]).

-type openapi_catalogs_report_feed_ingestion_filter() ::
  [ {'report_type', binary() }
  | {'feed_id', binary() }
  | {'processing_result_id', binary() }
  ].


openapi_catalogs_report_feed_ingestion_filter() ->
    openapi_catalogs_report_feed_ingestion_filter([]).

openapi_catalogs_report_feed_ingestion_filter(Fields) ->
  Default = [ {'report_type', elements([<<"FEED_INGESTION_ISSUES">>]) }
            , {'feed_id', binary() }
            , {'processing_result_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

