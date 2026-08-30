-module(openapi_cancel_invite_exception).

-export([encode/1]).

-export_type([openapi_cancel_invite_exception/0]).

-type openapi_cancel_invite_exception() ::
    #{ 'invite_id' => binary(),
       'message' => binary()
     }.

encode(#{ 'invite_id' := InviteId,
          'message' := Message
        }) ->
    #{ 'invite_id' => InviteId,
       'message' => Message
     }.
