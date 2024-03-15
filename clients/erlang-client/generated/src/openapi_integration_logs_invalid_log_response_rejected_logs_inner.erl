-module(openapi_integration_logs_invalid_log_response_rejected_logs_inner).

-export([encode/1]).

-export_type([openapi_integration_logs_invalid_log_response_rejected_logs_inner/0]).

-type openapi_integration_logs_invalid_log_response_rejected_logs_inner() ::
    #{ 'log_index' => integer(),
       'field' := binary(),
       'value' := binary(),
       'reason' := binary()
     }.

encode(#{ 'log_index' := LogIndex,
          'field' := Field,
          'value' := Value,
          'reason' := Reason
        }) ->
    #{ 'log_index' => LogIndex,
       'field' => Field,
       'value' => Value,
       'reason' => Reason
     }.
