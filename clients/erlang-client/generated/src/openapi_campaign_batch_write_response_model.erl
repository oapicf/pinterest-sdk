-module(openapi_campaign_batch_write_response_model).

-export([encode/1]).

-export_type([openapi_campaign_batch_write_response_model/0]).

-type openapi_campaign_batch_write_response_model() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
