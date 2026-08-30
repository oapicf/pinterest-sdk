-module(openapi_delete_member_asset_access_item).

-export([encode/1]).

-export_type([openapi_delete_member_asset_access_item/0]).

-type openapi_delete_member_asset_access_item() ::
    #{ 'asset_id' := binary(),
       'member_id' := binary()
     }.

encode(#{ 'asset_id' := AssetId,
          'member_id' := MemberId
        }) ->
    #{ 'asset_id' => AssetId,
       'member_id' => MemberId
     }.
