-module(openapi_follow_user).

-export([encode/1]).

-export_type([openapi_follow_user/0]).

-type openapi_follow_user() ::
    #{ 'type' => binary(),
       'username' => binary()
     }.

encode(#{ 'type' := Type,
          'username' := Username
        }) ->
    #{ 'type' => Type,
       'username' => Username
     }.
