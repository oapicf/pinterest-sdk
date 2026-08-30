-module(openapi_asset_group_binding).

-export([encode/1]).

-export_type([openapi_asset_group_binding/0]).

-type openapi_asset_group_binding() ::
    #{ 'ad_accounts_ids' := list(),
       'asset_group_description' := binary(),
       'asset_group_name' := binary(),
       'asset_group_types' := list(),
       'catalogs_ids' := list(),
       'created_by' := openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'created_time' := integer(),
       'id' := binary(),
       'owner' := openapi_business_access_user_summary:openapi_business_access_user_summary(),
       'profiles_ids' := list(),
       'updated_time' := integer()
     }.

encode(#{ 'ad_accounts_ids' := AdAccountsIds,
          'asset_group_description' := AssetGroupDescription,
          'asset_group_name' := AssetGroupName,
          'asset_group_types' := AssetGroupTypes,
          'catalogs_ids' := CatalogsIds,
          'created_by' := CreatedBy,
          'created_time' := CreatedTime,
          'id' := Id,
          'owner' := Owner,
          'profiles_ids' := ProfilesIds,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'ad_accounts_ids' => AdAccountsIds,
       'asset_group_description' => AssetGroupDescription,
       'asset_group_name' => AssetGroupName,
       'asset_group_types' => AssetGroupTypes,
       'catalogs_ids' => CatalogsIds,
       'created_by' => CreatedBy,
       'created_time' => CreatedTime,
       'id' => Id,
       'owner' => Owner,
       'profiles_ids' => ProfilesIds,
       'updated_time' => UpdatedTime
     }.
