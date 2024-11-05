-module(openapi_create_invites_results_response_array_items_inner).

-export([encode/1]).

-export_type([openapi_create_invites_results_response_array_items_inner/0]).

-type openapi_create_invites_results_response_array_items_inner() ::
    #{ 'exception' => openapi_invite_exception_response:openapi_invite_exception_response(),
       'invite' => openapi_create_invites_results_response_array_items_inner_invite:openapi_create_invites_results_response_array_items_inner_invite()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
