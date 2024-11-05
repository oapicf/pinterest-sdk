-module(openapi_update_member_asset_access_body_accesses_inner).

-export([encode/1]).

-export_type([openapi_update_member_asset_access_body_accesses_inner/0]).

-type openapi_update_member_asset_access_body_accesses_inner() ::
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
