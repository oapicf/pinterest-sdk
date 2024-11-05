-module(openapi_invite_business_role_binding).

-export([encode/1]).

-export_type([openapi_invite_business_role_binding/0]).

-type openapi_invite_business_role_binding() ::
    #{ 'created_by_business_id' => binary(),
       'created_by_user_id' => binary(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'id' => binary(),
       'invite_data' => openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data(),
       'is_received_invite' => boolean()
     }.

encode(#{ 'created_by_business_id' := CreatedByBusinessId,
          'created_by_user_id' := CreatedByUserId,
          'user' := User,
          'id' := Id,
          'invite_data' := InviteData,
          'is_received_invite' := IsReceivedInvite
        }) ->
    #{ 'created_by_business_id' => CreatedByBusinessId,
       'created_by_user_id' => CreatedByUserId,
       'user' => User,
       'id' => Id,
       'invite_data' => InviteData,
       'is_received_invite' => IsReceivedInvite
     }.
