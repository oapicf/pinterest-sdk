-module(openapi_campaign_batch_item).

-export([encode/1]).

-export_type([openapi_campaign_batch_item/0]).

-type openapi_campaign_batch_item() ::
    #{ 'data' => openapi_campaign_batch_response_data:openapi_campaign_batch_response_data(),
       'exceptions' => list()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
