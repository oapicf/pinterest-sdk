-module(openapi_invite_business_role_binding).

-export([encode/1]).

-export_type([openapi_invite_business_role_binding/0]).

-type openapi_invite_business_role_binding() ::
    #{ 'created_by_business_id' => binary(),
       'created_by_user_id' => binary(),
       'id' => binary(),
       'invite_data' => openapi_invite_data_response:openapi_invite_data_response(),
       'is_received_invite' => boolean(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary()
     }.

encode(#{ 'created_by_business_id' := CreatedByBusinessId,
          'created_by_user_id' := CreatedByUserId,
          'id' := Id,
          'invite_data' := InviteData,
          'is_received_invite' := IsReceivedInvite,
          'user' := User
        }) ->
    #{ 'created_by_business_id' => CreatedByBusinessId,
       'created_by_user_id' => CreatedByUserId,
       'id' => Id,
       'invite_data' => InviteData,
       'is_received_invite' => IsReceivedInvite,
       'user' => User
     }.
