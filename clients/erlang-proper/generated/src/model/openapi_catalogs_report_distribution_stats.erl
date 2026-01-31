-module(openapi_catalogs_report_distribution_stats).

-include("openapi.hrl").

-export([openapi_catalogs_report_distribution_stats/0]).

-export([openapi_catalogs_report_distribution_stats/1]).

-export_type([openapi_catalogs_report_distribution_stats/0]).

-type openapi_catalogs_report_distribution_stats() ::
  [ {'catalog_id', binary() }
  | {'code', integer() }
  | {'code_label', binary() }
  | {'ineligible_for_ads', boolean() }
  | {'ineligible_for_organic', boolean() }
  | {'message', binary() }
  | {'occurrences', integer() }
  | {'report_type', binary() }
  ].


openapi_catalogs_report_distribution_stats() ->
    openapi_catalogs_report_distribution_stats([]).

openapi_catalogs_report_distribution_stats(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'code', integer() }
            , {'code_label', binary() }
            , {'ineligible_for_ads', boolean() }
            , {'ineligible_for_organic', boolean() }
            , {'message', binary() }
            , {'occurrences', integer() }
            , {'report_type', elements([<<"DISTRIBUTION_ISSUES">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

