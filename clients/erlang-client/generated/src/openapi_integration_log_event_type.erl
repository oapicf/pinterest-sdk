-module(openapi_integration_log_event_type).

-export([encode/1]).

-export_type([openapi_integration_log_event_type/0]).

-type openapi_integration_log_event_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
