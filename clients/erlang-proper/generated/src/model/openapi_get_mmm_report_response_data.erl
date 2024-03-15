-module(openapi_get_mmm_report_response_data).

-include("openapi.hrl").

-export([openapi_get_mmm_report_response_data/0]).

-export([openapi_get_mmm_report_response_data/1]).

-export_type([openapi_get_mmm_report_response_data/0]).

-type openapi_get_mmm_report_response_data() ::
  [ {'report_status', binary() }
  | {'url', binary() }
  | {'size', integer() }
  ].


openapi_get_mmm_report_response_data() ->
    openapi_get_mmm_report_response_data([]).

openapi_get_mmm_report_response_data(Fields) ->
  Default = [ {'report_status', elements([<<"DOES_NOT_EXIST">>, <<"FINISHED">>, <<"IN_PROGRESS">>, <<"EXPIRED">>, <<"FAILED">>, <<"CANCELLED">>]) }
            , {'url', binary() }
            , {'size', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

