-module(openapi_follow_user_create).

-export([encode/1]).

-export_type([openapi_follow_user_create/0]).

-type openapi_follow_user_create() ::
    #{ 'auto_follow' => boolean()
     }.

encode(#{ 'auto_follow' := AutoFollow
        }) ->
    #{ 'auto_follow' => AutoFollow
     }.
