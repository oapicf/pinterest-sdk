-module(openapi_integration_logs_request_create).

-export([encode/1]).

-export_type([openapi_integration_logs_request_create/0]).

-type openapi_integration_logs_request_create() ::
    #{ 'logs' := list()
     }.

encode(#{ 'logs' := Logs
        }) ->
    #{ 'logs' => Logs
     }.
