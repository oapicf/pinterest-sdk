-module(openapi_create_mmm_report_response).

-export([encode/1]).

-export_type([openapi_create_mmm_report_response/0]).

-type openapi_create_mmm_report_response() ::
    #{ 'code' => integer(),
       'data' => openapi_create_mmm_report_response_data:openapi_create_mmm_report_response_data()
     }.

encode(#{ 'code' := Code,
          'data' := Data
        }) ->
    #{ 'code' => Code,
       'data' => Data
     }.
