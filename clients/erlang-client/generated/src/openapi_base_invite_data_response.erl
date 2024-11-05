-module(openapi_base_invite_data_response).

-export([encode/1]).

-export_type([openapi_base_invite_data_response/0]).

-type openapi_base_invite_data_response() ::
    #{ 'id' => binary(),
       'invite_data' => openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data(),
       'is_received_invite' => boolean(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary()
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
