-module(openapi_invite_action_result_item).

-export([encode/1]).

-export_type([openapi_invite_action_result_item/0]).

-type openapi_invite_action_result_item() ::
    #{ 'exception' => openapi_invite_exception_response:openapi_invite_exception_response(),
       'invite' => openapi_invite_business_role_binding:openapi_invite_business_role_binding()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
