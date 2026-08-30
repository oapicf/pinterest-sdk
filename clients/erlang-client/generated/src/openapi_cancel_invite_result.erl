-module(openapi_cancel_invite_result).

-export([encode/1]).

-export_type([openapi_cancel_invite_result/0]).

-type openapi_cancel_invite_result() ::
    #{ 'id' => binary(),
       'invite_data' => openapi_invite_data_response:openapi_invite_data_response(),
       'is_received_invite' => boolean(),
       'user' => openapi_cancel_invite_result_user:openapi_cancel_invite_result_user()
     }.

encode(#{ 'id' := Id,
          'invite_data' := InviteData,
          'is_received_invite' := IsReceivedInvite,
          'user' := User
        }) ->
    #{ 'id' => Id,
       'invite_data' => InviteData,
       'is_received_invite' => IsReceivedInvite,
       'user' => User
     }.
