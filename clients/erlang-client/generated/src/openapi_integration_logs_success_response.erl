-module(openapi_integration_logs_success_response).

-export([encode/1]).

-export_type([openapi_integration_logs_success_response/0]).

-type openapi_integration_logs_success_response() ::
    #{ 'message' => binary()
     }.

encode(#{ 'message' := Message
        }) ->
    #{ 'message' => Message
     }.
