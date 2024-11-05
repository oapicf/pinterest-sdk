-module(openapi_create_asset_access_request_body).

-export([encode/1]).

-export_type([openapi_create_asset_access_request_body/0]).

-type openapi_create_asset_access_request_body() ::
    #{ 'asset_requests' := list()
     }.

encode(#{ 'asset_requests' := AssetRequests
        }) ->
    #{ 'asset_requests' => AssetRequests
     }.
