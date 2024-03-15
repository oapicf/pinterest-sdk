-module(openapi_integration_logs_request).

-export([encode/1]).

-export_type([openapi_integration_logs_request/0]).

-type openapi_integration_logs_request() ::
    #{ 'logs' := list()
     }.

encode(#{ 'logs' := Logs
        }) ->
    #{ 'logs' => Logs
     }.
