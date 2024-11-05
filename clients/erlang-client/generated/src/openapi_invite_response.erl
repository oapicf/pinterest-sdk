-module(openapi_invite_response).

-export([encode/1]).

-export_type([openapi_invite_response/0]).

-type openapi_invite_response() ::
    #{ 'assets_summary' => openapi_invite_assets_summary:openapi_invite_assets_summary(),
       'business_roles' => list(),
       'created_by_business' => openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'created_by_user' => openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'created_time' => integer(),
       'id' => binary(),
       'invite_data' => openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data(),
       'is_received_invite' => boolean(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary()
     }.

encode(#{ 'assets_summary' := AssetsSummary,
          'business_roles' := BusinessRoles,
          'created_by_business' := CreatedByBusiness,
          'created_by_user' := CreatedByUser,
          'created_time' := CreatedTime,
          'id' := Id,
          'invite_data' := InviteData,
          'is_received_invite' := IsReceivedInvite,
          'user' := User
        }) ->
    #{ 'assets_summary' => AssetsSummary,
       'business_roles' => BusinessRoles,
       'created_by_business' => CreatedByBusiness,
       'created_by_user' => CreatedByUser,
       'created_time' => CreatedTime,
       'id' => Id,
       'invite_data' => InviteData,
       'is_received_invite' => IsReceivedInvite,
       'user' => User
     }.
