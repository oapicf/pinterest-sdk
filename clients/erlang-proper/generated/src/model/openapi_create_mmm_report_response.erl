-module(openapi_create_mmm_report_response).

-include("openapi.hrl").

-export([openapi_create_mmm_report_response/0]).

-export([openapi_create_mmm_report_response/1]).

-export_type([openapi_create_mmm_report_response/0]).

-type openapi_create_mmm_report_response() ::
  [ {'code', integer() }
  | {'data', openapi_create_mmm_report_response_data:openapi_create_mmm_report_response_data() }
  ].


openapi_create_mmm_report_response() ->
    openapi_create_mmm_report_response([]).

openapi_create_mmm_report_response(Fields) ->
  Default = [ {'code', integer() }
            , {'data', openapi_create_mmm_report_response_data:openapi_create_mmm_report_response_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

