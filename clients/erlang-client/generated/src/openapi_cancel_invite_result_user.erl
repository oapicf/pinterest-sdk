-module(openapi_cancel_invite_result_user).

-export([encode/1]).

-export_type([openapi_cancel_invite_result_user/0]).

-type openapi_cancel_invite_result_user() ::
    #{ 'email' => binary(),
       'id' => binary(),
       'username' => binary()
     }.

encode(#{ 'email' := Email,
          'id' := Id,
          'username' := Username
        }) ->
    #{ 'email' => Email,
       'id' => Id,
       'username' => Username
     }.
