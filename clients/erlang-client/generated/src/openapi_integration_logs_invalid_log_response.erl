-module(openapi_integration_logs_invalid_log_response).

-export([encode/1]).

-export_type([openapi_integration_logs_invalid_log_response/0]).

-type openapi_integration_logs_invalid_log_response() ::
    #{ 'rejected_logs' => list()
     }.

encode(#{ 'rejected_logs' := RejectedLogs
        }) ->
    #{ 'rejected_logs' => RejectedLogs
     }.
