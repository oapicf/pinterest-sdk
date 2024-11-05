-module(openapi_asset_group_type).

-export([encode/1]).

-export_type([openapi_asset_group_type/0]).

-type openapi_asset_group_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
