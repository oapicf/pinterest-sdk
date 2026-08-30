-module(openapi_integration_logs_invalid_log_response_rejected_logs_items).

-export([encode/1]).

-export_type([openapi_integration_logs_invalid_log_response_rejected_logs_items/0]).

-type openapi_integration_logs_invalid_log_response_rejected_logs_items() ::
    #{ 'field' := binary(),
       'log_index' => integer(),
       'reason' := binary(),
       'value' := binary()
     }.

encode(#{ 'field' := Field,
          'log_index' := LogIndex,
          'reason' := Reason,
          'value' := Value
        }) ->
    #{ 'field' => Field,
       'log_index' => LogIndex,
       'reason' => Reason,
       'value' => Value
     }.
