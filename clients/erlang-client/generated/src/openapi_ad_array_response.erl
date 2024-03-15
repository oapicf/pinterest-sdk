-module(openapi_ad_array_response).

-export([encode/1]).

-export_type([openapi_ad_array_response/0]).

-type openapi_ad_array_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
