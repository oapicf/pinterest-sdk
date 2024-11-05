-module(openapi_update_partner_asset_access_body).

-export([encode/1]).

-export_type([openapi_update_partner_asset_access_body/0]).

-type openapi_update_partner_asset_access_body() ::
    #{ 'accesses' := list()
     }.

encode(#{ 'accesses' := Accesses
        }) ->
    #{ 'accesses' => Accesses
     }.
