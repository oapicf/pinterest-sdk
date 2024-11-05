-module(openapi_delete_invites_results_response_array_items_inner).

-export([encode/1]).

-export_type([openapi_delete_invites_results_response_array_items_inner/0]).

-type openapi_delete_invites_results_response_array_items_inner() ::
    #{ 'exception' => openapi_delete_invites_results_response_array_items_inner_exception:openapi_delete_invites_results_response_array_items_inner_exception(),
       'invite' => openapi_base_invite_data_response:openapi_base_invite_data_response()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
