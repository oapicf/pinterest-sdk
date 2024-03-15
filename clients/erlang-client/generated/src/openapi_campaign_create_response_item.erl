-module(openapi_campaign_create_response_item).

-export([encode/1]).

-export_type([openapi_campaign_create_response_item/0]).

-type openapi_campaign_create_response_item() ::
    #{ 'data' => openapi_campaign_create_response_data:openapi_campaign_create_response_data(),
       'exceptions' => list()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
