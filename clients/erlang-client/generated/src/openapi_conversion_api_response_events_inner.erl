-module(openapi_conversion_api_response_events_inner).

-export([encode/1]).

-export_type([openapi_conversion_api_response_events_inner/0]).

-type openapi_conversion_api_response_events_inner() ::
    #{ 'error_message' => binary(),
       'status' := binary(),
       'warning_message' => binary()
     }.

encode(#{ 'error_message' := ErrorMessage,
          'status' := Status,
          'warning_message' := WarningMessage
        }) ->
    #{ 'error_message' => ErrorMessage,
       'status' => Status,
       'warning_message' => WarningMessage
     }.
