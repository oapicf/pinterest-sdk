-module(openapi_user_summary).

-export([encode/1]).

-export_type([openapi_user_summary/0]).

-type openapi_user_summary() ::
    #{ 'username' => binary(),
       'type' => binary()
     }.

encode(#{ 'username' := Username,
          'type' := Type
        }) ->
    #{ 'username' => Username,
       'type' => Type
     }.
