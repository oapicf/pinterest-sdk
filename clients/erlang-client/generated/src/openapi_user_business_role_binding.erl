-module(openapi_user_business_role_binding).

-export([encode/1]).

-export_type([openapi_user_business_role_binding/0]).

-type openapi_user_business_role_binding() ::
    #{ 'assets_summary' => openapi_business_member_assets_summary:openapi_business_member_assets_summary(),
       'business_roles' => list(),
       'created_by_business' => openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'created_by_user' => openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'created_time' => integer(),
       'id' => binary(),
       'is_shared_partner' => boolean(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary()
     }.

encode(#{ 'assets_summary' := AssetsSummary,
          'business_roles' := BusinessRoles,
          'created_by_business' := CreatedByBusiness,
          'created_by_user' := CreatedByUser,
          'created_time' := CreatedTime,
          'id' := Id,
          'is_shared_partner' := IsSharedPartner,
          'user' := User
        }) ->
    #{ 'assets_summary' => AssetsSummary,
       'business_roles' => BusinessRoles,
       'created_by_business' => CreatedByBusiness,
       'created_by_user' => CreatedByUser,
       'created_time' => CreatedTime,
       'id' => Id,
       'is_shared_partner' => IsSharedPartner,
       'user' => User
     }.
