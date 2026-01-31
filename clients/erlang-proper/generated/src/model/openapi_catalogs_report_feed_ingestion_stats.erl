-module(openapi_catalogs_report_feed_ingestion_stats).

-include("openapi.hrl").

-export([openapi_catalogs_report_feed_ingestion_stats/0]).

-export([openapi_catalogs_report_feed_ingestion_stats/1]).

-export_type([openapi_catalogs_report_feed_ingestion_stats/0]).

-type openapi_catalogs_report_feed_ingestion_stats() ::
  [ {'catalog_id', binary() }
  | {'code', integer() }
  | {'code_label', binary() }
  | {'message', binary() }
  | {'occurrences', integer() }
  | {'report_type', binary() }
  | {'severity', binary() }
  ].


openapi_catalogs_report_feed_ingestion_stats() ->
    openapi_catalogs_report_feed_ingestion_stats([]).

openapi_catalogs_report_feed_ingestion_stats(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'code', integer() }
            , {'code_label', binary() }
            , {'message', binary() }
            , {'occurrences', integer() }
            , {'report_type', elements([<<"FEED_INGESTION_ISSUES">>]) }
            , {'severity', elements([<<"WARN">>, <<"ERROR">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

