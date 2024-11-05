-module(openapi_delete_asset_group_response_exceptions_inner).

-export([encode/1]).

-export_type([openapi_delete_asset_group_response_exceptions_inner/0]).

-type openapi_delete_asset_group_response_exceptions_inner() ::
    #{ 'code' => integer(),
       'message' => binary(),
       'asset_group_id' => binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message,
          'asset_group_id' := AssetGroupId
        }) ->
    #{ 'code' => Code,
       'message' => Message,
       'asset_group_id' => AssetGroupId
     }.
