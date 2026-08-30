-module(openapi_cancel_invite_result_item).

-export([encode/1]).

-export_type([openapi_cancel_invite_result_item/0]).

-type openapi_cancel_invite_result_item() ::
    #{ 'exception' => openapi_cancel_invite_exception:openapi_cancel_invite_exception(),
       'invite' => openapi_cancel_invite_result:openapi_cancel_invite_result()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
