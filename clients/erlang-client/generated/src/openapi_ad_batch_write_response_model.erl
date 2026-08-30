-module(openapi_ad_batch_write_response_model).

-export([encode/1]).

-export_type([openapi_ad_batch_write_response_model/0]).

-type openapi_ad_batch_write_response_model() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
