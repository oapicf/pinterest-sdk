-module(openapi_update_member_asset_access_item).

-export([encode/1]).

-export_type([openapi_update_member_asset_access_item/0]).

-type openapi_update_member_asset_access_item() ::
    #{ 'asset_id' := binary(),
       'member_id' := binary(),
       'permissions' := list()
     }.

encode(#{ 'asset_id' := AssetId,
          'member_id' := MemberId,
          'permissions' := Permissions
        }) ->
    #{ 'asset_id' => AssetId,
       'member_id' => MemberId,
       'permissions' => Permissions
     }.
