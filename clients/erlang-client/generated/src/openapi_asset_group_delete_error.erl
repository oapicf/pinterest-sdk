-module(openapi_asset_group_delete_error).

-export([encode/1]).

-export_type([openapi_asset_group_delete_error/0]).

-type openapi_asset_group_delete_error() ::
    #{ 'asset_group_id' => binary(),
       'code' => integer(),
       'message' => binary()
     }.

encode(#{ 'asset_group_id' := AssetGroupId,
          'code' := Code,
          'message' := Message
        }) ->
    #{ 'asset_group_id' => AssetGroupId,
       'code' => Code,
       'message' => Message
     }.
