-module(openapi_delivery_metrics_response).

-export([encode/1]).

-export_type([openapi_delivery_metrics_response/0]).

-type openapi_delivery_metrics_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
