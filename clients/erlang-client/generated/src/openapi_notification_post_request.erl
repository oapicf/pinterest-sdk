-module(openapi_notification_post_request).

-export([encode/1]).

-export_type([openapi_notification_post_request/0]).

-type openapi_notification_post_request() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
