-module(openapi_update_invites_results_response_array_items_inner).

-export([encode/1]).

-export_type([openapi_update_invites_results_response_array_items_inner/0]).

-type openapi_update_invites_results_response_array_items_inner() ::
    #{ 'exception' => openapi_invite_exception_response:openapi_invite_exception_response(),
       'invite' => openapi_invite_business_role_binding:openapi_invite_business_role_binding()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
