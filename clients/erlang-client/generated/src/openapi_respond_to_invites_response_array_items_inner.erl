-module(openapi_respond_to_invites_response_array_items_inner).

-export([encode/1]).

-export_type([openapi_respond_to_invites_response_array_items_inner/0]).

-type openapi_respond_to_invites_response_array_items_inner() ::
    #{ 'exception' => openapi_invite_exception_response:openapi_invite_exception_response(),
       'invite' => openapi_base_invite_data_response:openapi_base_invite_data_response()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
