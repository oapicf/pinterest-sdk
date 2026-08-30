-module(openapi_conversion_api_response_events_items).

-export([encode/1]).

-export_type([openapi_conversion_api_response_events_items/0]).

-type openapi_conversion_api_response_events_items() ::
    #{ 'error_message' => binary(),
       'status' := openapi_event_processing_status:openapi_event_processing_status(),
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
