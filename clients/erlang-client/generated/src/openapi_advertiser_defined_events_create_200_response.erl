-module(openapi_advertiser_defined_events_create_200_response).

-export([encode/1]).

-export_type([openapi_advertiser_defined_events_create_200_response/0]).

-type openapi_advertiser_defined_events_create_200_response() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
