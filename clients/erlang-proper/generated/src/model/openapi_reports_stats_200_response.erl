-module(openapi_reports_stats_200_response).

-include("openapi.hrl").

-export([openapi_reports_stats_200_response/0]).

-export([openapi_reports_stats_200_response/1]).

-export_type([openapi_reports_stats_200_response/0]).

-type openapi_reports_stats_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_catalogs_report_stats:openapi_catalogs_report_stats()) }
  ].


openapi_reports_stats_200_response() ->
    openapi_reports_stats_200_response([]).

openapi_reports_stats_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_catalogs_report_stats:openapi_catalogs_report_stats()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

