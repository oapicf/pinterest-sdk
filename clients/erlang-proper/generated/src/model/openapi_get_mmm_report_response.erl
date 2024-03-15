-module(openapi_get_mmm_report_response).

-include("openapi.hrl").

-export([openapi_get_mmm_report_response/0]).

-export([openapi_get_mmm_report_response/1]).

-export_type([openapi_get_mmm_report_response/0]).

-type openapi_get_mmm_report_response() ::
  [ {'code', integer() }
  | {'data', openapi_get_mmm_report_response_data:openapi_get_mmm_report_response_data() }
  | {'message', binary() }
  | {'status', binary() }
  ].


openapi_get_mmm_report_response() ->
    openapi_get_mmm_report_response([]).

openapi_get_mmm_report_response(Fields) ->
  Default = [ {'code', integer() }
            , {'data', openapi_get_mmm_report_response_data:openapi_get_mmm_report_response_data() }
            , {'message', binary() }
            , {'status', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

