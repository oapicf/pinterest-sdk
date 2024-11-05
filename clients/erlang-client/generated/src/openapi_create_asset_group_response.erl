-module(openapi_create_asset_group_response).

-export([encode/1]).

-export_type([openapi_create_asset_group_response/0]).

-type openapi_create_asset_group_response() ::
    #{ 'asset_group' => openapi_asset_group_binding:openapi_asset_group_binding()
     }.

encode(#{ 'asset_group' := AssetGroup
        }) ->
    #{ 'asset_group' => AssetGroup
     }.
