-module(openapi_follow_user_request).

-export([encode/1]).

-export_type([openapi_follow_user_request/0]).

-type openapi_follow_user_request() ::
    #{ 'auto_follow' => boolean()
     }.

encode(#{ 'auto_follow' := AutoFollow
        }) ->
    #{ 'auto_follow' => AutoFollow
     }.
