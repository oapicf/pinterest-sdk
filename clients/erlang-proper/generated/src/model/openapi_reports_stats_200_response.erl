-module(openapi_reports_stats_200_response).

-include("openapi.hrl").

-export([openapi_reports_stats_200_response/0]).

-export([openapi_reports_stats_200_response/1]).

-export_type([openapi_reports_stats_200_response/0]).

-type openapi_reports_stats_200_response() ::
  [ {'items', list(openapi_catalogs_report_stats:openapi_catalogs_report_stats()) }
  | {'bookmark', binary() }
  ].


openapi_reports_stats_200_response() ->
    openapi_reports_stats_200_response([]).

openapi_reports_stats_200_response(Fields) ->
  Default = [ {'items', list(openapi_catalogs_report_stats:openapi_catalogs_report_stats()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

