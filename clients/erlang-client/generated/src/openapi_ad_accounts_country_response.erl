-module(openapi_ad_accounts_country_response).

-export([encode/1]).

-export_type([openapi_ad_accounts_country_response/0]).

-type openapi_ad_accounts_country_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
