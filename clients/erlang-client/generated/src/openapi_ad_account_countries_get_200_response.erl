-module(openapi_ad_account_countries_get_200_response).

-export([encode/1]).

-export_type([openapi_ad_account_countries_get_200_response/0]).

-type openapi_ad_account_countries_get_200_response() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
