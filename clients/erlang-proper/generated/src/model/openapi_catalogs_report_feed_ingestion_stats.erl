-module(openapi_catalogs_report_feed_ingestion_stats).

-include("openapi.hrl").

-export([openapi_catalogs_report_feed_ingestion_stats/0]).

-export([openapi_catalogs_report_feed_ingestion_stats/1]).

-export_type([openapi_catalogs_report_feed_ingestion_stats/0]).

-type openapi_catalogs_report_feed_ingestion_stats() ::
  [ {'report_type', binary() }
  | {'catalog_id', binary() }
  | {'code', integer() }
  | {'code_label', binary() }
  | {'message', binary() }
  | {'occurrences', integer() }
  | {'severity', binary() }
  ].


openapi_catalogs_report_feed_ingestion_stats() ->
    openapi_catalogs_report_feed_ingestion_stats([]).

openapi_catalogs_report_feed_ingestion_stats(Fields) ->
  Default = [ {'report_type', elements([<<"FEED_INGESTION_ISSUES">>]) }
            , {'catalog_id', binary() }
            , {'code', integer() }
            , {'code_label', binary() }
            , {'message', binary() }
            , {'occurrences', integer() }
            , {'severity', elements([<<"WARN">>, <<"ERROR">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

