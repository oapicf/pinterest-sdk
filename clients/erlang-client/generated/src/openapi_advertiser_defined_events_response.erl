-module(openapi_advertiser_defined_events_response).

-export([encode/1]).

-export_type([openapi_advertiser_defined_events_response/0]).

-type openapi_advertiser_defined_events_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
