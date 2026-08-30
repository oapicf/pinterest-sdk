-module(openapi_business_members_asset_access_delete_body).

-export([encode/1]).

-export_type([openapi_business_members_asset_access_delete_body/0]).

-type openapi_business_members_asset_access_delete_body() ::
    #{ 'accesses' := list()
     }.

encode(#{ 'accesses' := Accesses
        }) ->
    #{ 'accesses' => Accesses
     }.
