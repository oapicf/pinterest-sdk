-module(openapi_advertiser_defined_events_create_request).

-export([encode/1]).

-export_type([openapi_advertiser_defined_events_create_request/0]).

-type openapi_advertiser_defined_events_create_request() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
