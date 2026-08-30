-module(openapi_asset_group_input).

-export([encode/1]).

-export_type([openapi_asset_group_input/0]).

-type openapi_asset_group_input() ::
    #{ 'asset_group' => openapi_asset_group_binding:openapi_asset_group_binding()
     }.

encode(#{ 'asset_group' := AssetGroup
        }) ->
    #{ 'asset_group' => AssetGroup
     }.
