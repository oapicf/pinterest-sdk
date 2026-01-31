-module(openapi_delete_asset_group_response_exceptions_inner).

-export([encode/1]).

-export_type([openapi_delete_asset_group_response_exceptions_inner/0]).

-type openapi_delete_asset_group_response_exceptions_inner() ::
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
