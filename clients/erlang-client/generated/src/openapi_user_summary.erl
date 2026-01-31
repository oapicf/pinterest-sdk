-module(openapi_user_summary).

-export([encode/1]).

-export_type([openapi_user_summary/0]).

-type openapi_user_summary() ::
    #{ 'type' => binary(),
       'username' => binary()
     }.

encode(#{ 'type' := Type,
          'username' := Username
        }) ->
    #{ 'type' => Type,
       'username' => Username
     }.
