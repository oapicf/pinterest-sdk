-module(openapi_campaign_update_response).

-export([encode/1]).

-export_type([openapi_campaign_update_response/0]).

-type openapi_campaign_update_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
