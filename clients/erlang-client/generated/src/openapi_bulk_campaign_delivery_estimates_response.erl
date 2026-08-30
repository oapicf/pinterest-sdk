-module(openapi_bulk_campaign_delivery_estimates_response).

-export([encode/1]).

-export_type([openapi_bulk_campaign_delivery_estimates_response/0]).

-type openapi_bulk_campaign_delivery_estimates_response() ::
    #{ 'data' := list()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
