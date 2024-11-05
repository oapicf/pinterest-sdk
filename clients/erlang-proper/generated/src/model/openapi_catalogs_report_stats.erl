-module(openapi_catalogs_report_stats).

-include("openapi.hrl").

-export([openapi_catalogs_report_stats/0]).

-export([openapi_catalogs_report_stats/1]).

-export_type([openapi_catalogs_report_stats/0]).

-type openapi_catalogs_report_stats() ::
  [ {'report_type', binary() }
  | {'catalog_id', binary() }
  | {'code', integer() }
  | {'code_label', binary() }
  | {'message', binary() }
  | {'occurrences', integer() }
  | {'severity', binary() }
  | {'ineligible_for_ads', boolean() }
  | {'ineligible_for_organic', boolean() }
  ].


openapi_catalogs_report_stats() ->
    openapi_catalogs_report_stats([]).

openapi_catalogs_report_stats(Fields) ->
  Default = [ {'report_type', elements([<<"FEED_INGESTION_ISSUES">>, <<"DISTRIBUTION_ISSUES">>]) }
            , {'catalog_id', binary() }
            , {'code', integer() }
            , {'code_label', binary() }
            , {'message', binary() }
            , {'occurrences', integer() }
            , {'severity', elements([<<"WARN">>, <<"ERROR">>]) }
            , {'ineligible_for_ads', boolean() }
            , {'ineligible_for_organic', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

