-module(openapi_business_members_asset_access_delete_request).

-export([encode/1]).

-export_type([openapi_business_members_asset_access_delete_request/0]).

-type openapi_business_members_asset_access_delete_request() ::
    #{ 'accesses' := list()
     }.

encode(#{ 'accesses' := Accesses
        }) ->
    #{ 'accesses' => Accesses
     }.
