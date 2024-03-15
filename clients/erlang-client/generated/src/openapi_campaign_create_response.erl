-module(openapi_campaign_create_response).

-export([encode/1]).

-export_type([openapi_campaign_create_response/0]).

-type openapi_campaign_create_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
