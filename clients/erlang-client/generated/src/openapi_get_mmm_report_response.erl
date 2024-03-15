-module(openapi_get_mmm_report_response).

-export([encode/1]).

-export_type([openapi_get_mmm_report_response/0]).

-type openapi_get_mmm_report_response() ::
    #{ 'code' => integer(),
       'data' => openapi_get_mmm_report_response_data:openapi_get_mmm_report_response_data(),
       'message' => binary(),
       'status' => binary()
     }.

encode(#{ 'code' := Code,
          'data' := Data,
          'message' := Message,
          'status' := Status
        }) ->
    #{ 'code' => Code,
       'data' => Data,
       'message' => Message,
       'status' => Status
     }.
