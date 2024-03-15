-module(openapi_conversion_api_response_events_inner).

-export([encode/1]).

-export_type([openapi_conversion_api_response_events_inner/0]).

-type openapi_conversion_api_response_events_inner() ::
    #{ 'status' := binary(),
       'error_message' => binary(),
       'warning_message' => binary()
     }.

encode(#{ 'status' := Status,
          'error_message' := ErrorMessage,
          'warning_message' := WarningMessage
        }) ->
    #{ 'status' => Status,
       'error_message' => ErrorMessage,
       'warning_message' => WarningMessage
     }.
