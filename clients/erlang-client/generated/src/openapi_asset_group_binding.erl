-module(openapi_asset_group_binding).

-export([encode/1]).

-export_type([openapi_asset_group_binding/0]).

-type openapi_asset_group_binding() ::
    #{ 'id' => binary(),
       'asset_group_name' => binary(),
       'asset_group_description' => binary(),
       'asset_group_types' => list(),
       'ad_accounts_ids' => list(),
       'profiles_ids' => list(),
       'created_time' => integer(),
       'updated_time' => integer(),
       'owner' => openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'created_by' => openapi_business_access_user_summary:openapi_business_access_user_summary()
     }.

encode(#{ 'id' := Id,
          'asset_group_name' := AssetGroupName,
          'asset_group_description' := AssetGroupDescription,
          'asset_group_types' := AssetGroupTypes,
          'ad_accounts_ids' := AdAccountsIds,
          'profiles_ids' := ProfilesIds,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime,
          'owner' := Owner,
          'created_by' := CreatedBy
        }) ->
    #{ 'id' => Id,
       'asset_group_name' => AssetGroupName,
       'asset_group_description' => AssetGroupDescription,
       'asset_group_types' => AssetGroupTypes,
       'ad_accounts_ids' => AdAccountsIds,
       'profiles_ids' => ProfilesIds,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime,
       'owner' => Owner,
       'created_by' => CreatedBy
     }.
