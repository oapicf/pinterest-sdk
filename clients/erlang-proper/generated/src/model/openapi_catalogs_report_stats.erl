-module(openapi_catalogs_report_stats).

-include("openapi.hrl").

-export([openapi_catalogs_report_stats/0]).

-export([openapi_catalogs_report_stats/1]).

-export_type([openapi_catalogs_report_stats/0]).

-type openapi_catalogs_report_stats() ::
  [ {'catalog_id', binary() }
  | {'code', integer() }
  | {'code_label', binary() }
  | {'message', binary() }
  | {'occurrences', integer() }
  | {'report_type', binary() }
  | {'severity', binary() }
  | {'ineligible_for_ads', boolean() }
  | {'ineligible_for_organic', boolean() }
  ].


openapi_catalogs_report_stats() ->
    openapi_catalogs_report_stats([]).

openapi_catalogs_report_stats(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'code', integer() }
            , {'code_label', binary() }
            , {'message', binary() }
            , {'occurrences', integer() }
            , {'report_type', elements([<<"DISTRIBUTION_ISSUES">>]) }
            , {'severity', elements([<<"WARN">>, <<"ERROR">>]) }
            , {'ineligible_for_ads', boolean() }
            , {'ineligible_for_organic', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

